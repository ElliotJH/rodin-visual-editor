/**
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.core.extension.persistence;

import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter.ReadableInputStream;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.persistence.synchroniser.AbstractSynchroniser;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinCore;
import org.rodinp.core.RodinDBException;

/**
 * Serialised extension synchroniser abstract class.
 * 
 * Serialises EventB abstract extension to a string attribute.
 * Implements all of the methods of AbstractSynchroniser except createEventBElement(),
 * which must be provided by a client extension to create a correct EMF element
 * on loading.
 * 
 * cfs (04/01/12) : when adding unique id's disable notification of changes (eventBElement.eSetDeliver(false)) to
 * 					prevent exceptions due to the change being made without a Transactional Command
 * 
 * @author vitaly
 *
 */
public class SerialisedExtensionSynchroniser extends AbstractSynchroniser {
	
	private static final Set<IAttributeType> handledAttributes = new HashSet<IAttributeType>();

	static {
		handledAttributes.add(ISerialised.SERIALISED_ATTRIBUTE);
	}

	private String nsURI;
	private String eClass;

	@Override
	protected EStructuralFeature getFeature() {
		return CorePackage.eINSTANCE.getEventBElement_Extensions();
	}

	@Override
	protected EventBElement createEventBElement() {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
		EFactory eFactory = ePackage.getEFactoryInstance();
		EObject element = eFactory.create((EClass) ePackage.getEClassifier(eClass));
		return element instanceof EventBElement ? (EventBElement) element : null;
	}

	@Override
	protected IInternalElementType<?> getRodinType() {
		return ISerialisedExtension.ELEMENT_TYPE;
	}

	@Override
	protected Set<IAttributeType> getHandledAttributeTypes() {
		return handledAttributes;
	}

	@Override
	public <T extends EventBElement> EventBElement load(
			IRodinElement rodinElement, EventBElement emfParent,
			IProgressMonitor monitor) throws RodinDBException {

		assert rodinElement instanceof ISerialisedExtension;
		ISerialisedExtension serialisedExtension = (ISerialisedExtension) rodinElement;
		
		// check required classifier and package URI are set
		if ((serialisedExtension.hasEPackageURI() && serialisedExtension.hasEClassifier()) == false)
			return null;
		
		nsURI = serialisedExtension.getEPackageURI();
		eClass = serialisedExtension.getEClassifier();
		
		// create EMF node
		AbstractExtension eventBElement = (AbstractExtension) super.load(rodinElement, emfParent, monitor);
		
		if (serialisedExtension.hasSerialised() && !serialisedExtension.getSerialised().isEmpty()) {
			String loadString = serialisedExtension.getSerialised();
			
			// use a resource to deserialise an attribute string
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			try {
				
				// dummy resource that loads from input stream to desired EMF object
				Resource resource = resourceSet.createResource(URI.createURI("http:///My.inp"));
				ReadableInputStream in = new ReadableInputStream(new StringReader(loadString));
				resource.load(in, null);
				
				// copy contents
				if (!resource.getContents().isEmpty()) {
					AbstractExtension ext = (AbstractExtension) resource.getContents().get(0);
					EClass eClass = eventBElement.eClass();
					EList<EStructuralFeature> eFeatures = eClass.getEAllStructuralFeatures();
					for (EStructuralFeature feature : eFeatures) {
						if (eventBElement.eClass().getEStructuralFeature(feature.getName()) != null)
							eventBElement.eSet(feature, ext.eGet(feature));
					}
					return eventBElement;
				}
			}
			catch (IOException e) {
				RodinCore.getPlugin().getLog().log(
						new Status(IStatus.ERROR, ExtensionPersistencePlugin.PLUGIN_ID, "Error when trying to deserialise an extension.", e));
				return null;
			}
		}
		
		return null;
	}

	@Override
	public IRodinElement save(EventBElement emfElement,
			IRodinElement rodinParent, IProgressMonitor monitor)
			throws RodinDBException {
		// important - to prevent creating Rodin elements for children
		if (rodinParent instanceof ISerialisedExtension)
			return null;
		
		addUniqueID(emfElement);
		
		// create Rodin element
		IRodinElement rodinElement = super.save(emfElement, rodinParent, monitor);
		
		if (rodinElement instanceof ISerialisedExtension && emfElement instanceof AbstractExtension) {
			ISerialisedExtension rodinExtension = (ISerialisedExtension) rodinElement;
			AbstractExtension emfExtension = (AbstractExtension) emfElement;
			
			try {
				String saveString = XMIHelperImpl.saveString(Collections.emptyMap(), Collections.singletonList(emfExtension), "UTF-8", null);
				rodinExtension.setExtensionId(emfExtension.getExtensionId(), monitor);
				rodinExtension.setSerialised(saveString, monitor);
				rodinExtension.setEPackageURI(emfExtension.eClass().getEPackage().getNsURI(), monitor);
				rodinExtension.setEClassifier(emfExtension.eClass().getName(), monitor);
			} catch (Exception e) {
				RodinCore.getPlugin().getLog().log(
						new Status(IStatus.ERROR, ExtensionPersistencePlugin.PLUGIN_ID, "Error when trying to serialise an extension.", e));
				return null;
			}
		}
		
		return rodinElement;
	}
	
	/**
	 * Where missing, adds a unique id to the given element and all its children recursively.
	 * Note that TransactionChangeRecorders are disabled for the element while it is being changed - this 
	 * prevents the Transactional Editing domain objecting to the change.
	 * 
	 * @param eventBElement
	 */
	private void addUniqueID(EventBElement eventBElement) {
		String id = EcoreUtil.getID(eventBElement);
		String className = eventBElement.eClass().getInstanceClassName();
		if (id == null || id.length() <= className.length() + 1){
			disableTransactionChangeRecorders(eventBElement); //.eSetDeliver(false); //prevent notification of changes made here
			EcoreUtil.setID(eventBElement, className + "." + EcoreUtil.generateUUID());
			reEnableTransactionChangeRecorders(eventBElement); //re-enable notification of changes made here
		}
		for (EObject element : eventBElement.eContents()){
			if (element instanceof EventBElement){
				addUniqueID((EventBElement)element);
			}
		}
	}

}
