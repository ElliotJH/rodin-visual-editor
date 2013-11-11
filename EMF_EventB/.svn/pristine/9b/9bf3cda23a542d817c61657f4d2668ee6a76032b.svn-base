/*******************************************************************************
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package ac.soton.eventb.emf.core.extension.navigator.refiner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eventb.core.IEventBRoot;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.MachinePackage;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IRefinementParticipant;
import org.rodinp.core.RodinDBException;

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.persistence.ISerialisedExtension;
import ac.soton.eventb.emf.core.extension.persistence.SerialisedExtensionSynchroniser;

/**
 * Abstract Refiner for serialised EventB EMF Extensions.
 * This should be extended for each Extension ID
 * 
 * @author cfsnook
 *
 */
public abstract class AbstractExtensionRefiner implements IRefinementParticipant {

	/**
	 * The ID for this kind of Serialised Event-B EMF Extension
	 */
	private final String EXTENSION_ID;
	/**
	 * Extenders must implement this to return the ID string of their extension
	 * @return
	 */
	protected abstract String getExtensionID();

	/**
	 * A list of the EClasses which should not be copied into the refinement
	 */
	private	List<EClass> filterList = new ArrayList<EClass>();

	/**
	 * Extenders may override this method to populate the list of EClasses 
	 * which should not be copied into a refinement.
	 * 
	 * Extenders may call super.populateFilterByTypeList(filterList) to filter
	 *   MachinePackage.Literals.WITNESS and 
	 *   MachinePackage.Literals.INVARIANT
	 *   
	 * @param filterList
	 */
	protected void populateFilterByTypeList(List<EClass> filterList) {
		filterList.add(MachinePackage.Literals.WITNESS);
		filterList.add(MachinePackage.Literals.INVARIANT);
	}
	
	/**
	 * A map of the references which need to be dealt with in the new refined model.
	 * For each EReference, the boolean indicates whether it should be dealt with as a reference back to 
	 * the source element (e.g. refines) or a normal reference within the same resource level which
	 * will be copied to simulate the abstract one..
	 */
	private Map<EReference,Boolean> referencemap = new HashMap<EReference,Boolean>();
	
	/**
	 * Extenders may override this method to populate the reference mapping with a list of 
	 * EReference features in their model extension. For each one indicate whether it should be dealt 
	 * with as a reference to the original source element (e.g. refines).
	 * (If the reference mapping is not populated the default behaviour is to not copy any references
	 * into the refinement).
	 * 
	 * Extenders may call super.populateReferenceMap(referencemap) to set 
	 * 	EVENT_BDATA_ELABORATION__ELABORATES, false and
	 * 	EVENT_BEVENT_GROUP__ELABORATES, false
	 */
	protected void populateReferenceMap(Map<EReference,Boolean> referencemap){
		referencemap.put(CoreextensionPackage.Literals.EVENT_BDATA_ELABORATION__ELABORATES, false);
		referencemap.put(CoreextensionPackage.Literals.EVENT_BEVENT_GROUP__ELABORATES, false);
	}
	
	/** 
	 * a synchroniser for saving these models 
	 */
	private SerialisedExtensionSynchroniser synchroniser = new SerialisedExtensionSynchroniser();;
	
	/**
	 * The URI's for the abstract and concrete Resources
	 */
	private URI abstractResourceURI;
	private URI concreteResourceURI;

	/**
	 * The instance of the copier.
	 * Note that this is also a mapping from source to target once the copy has been performed
	 */
	private Copier copier = new EcoreUtil.Copier(true,false);
	
	/**
	 * Used to get the key (source element) from the copier map using the value (target element)
	 * 
	 * @param map
	 * @param value
	 * @return
	 */
	private static <T, E> T getKeyByValue(Map<T, E> map, E value) {
	    for (Entry<T, E> entry : map.entrySet()) {
	        if (value.equals(entry.getValue())) {
	            return entry.getKey();
	        }
	    }
	    return null;
	}
	

	/**
	 * Constructor.
	 */
	protected AbstractExtensionRefiner() {
		EXTENSION_ID = getExtensionID();
		populateFilterByTypeList(filterList);
		populateReferenceMap(referencemap);
	}

	/**
	 * Extenders should not override this
	 */
	@Override
	public void process(IInternalElement targetRoot, IInternalElement sourceRoot, IProgressMonitor monitor) throws RodinDBException {
		final IEventBRoot concreteEventBRoot = (IEventBRoot) targetRoot;
		final IEventBRoot abstractEventBRoot = (IEventBRoot) sourceRoot;
		// machine URIs
		String projectName = sourceRoot.getRodinProject().getElementName();
		abstractResourceURI = URI.createURI("platform:/resource/" + projectName + "/" + abstractEventBRoot.getComponentName() + ".bum");
		concreteResourceURI = URI.createURI("platform:/resource/" + projectName + "/" + concreteEventBRoot.getComponentName() + ".bum");
		refineExtensions(concreteEventBRoot, abstractEventBRoot, monitor);
	}

	/**
	 * Refines all Serialised Event-B EMF extensions with the given ID.
	 * 
	 * @param concreteEventBRoot concrete machine root
	 * @param abstractEventBRoot abstract machine root
	 * @param map refinement map
	 * @param monitor progress monitor
	 * @throws RodinDBException 
	 */
	private void refineExtensions(IEventBRoot concreteEventBRoot, IEventBRoot abstractEventBRoot, IProgressMonitor monitor) throws RodinDBException {
		for (ISerialisedExtension extension : abstractEventBRoot.getChildrenOfType(ISerialisedExtension.ELEMENT_TYPE)) {
			if (extension.hasExtensionId() && extension.getExtensionId().startsWith(EXTENSION_ID))
				refineExtension(concreteEventBRoot, extension, monitor);
		}
	}

	/**
	 * Refines component extension.
	 * 
	 * @param concreteEventBRoot concrete EventB Component root
	 * @param abstractExtensionRoot the root of the abstract extension
	 * @param map refinement map
	 * @param monitor progress monitor
	 * @throws RodinDBException 
	 */
	private void refineExtension(IEventBRoot concreteEventBRoot, ISerialisedExtension abstractExtensionRoot, IProgressMonitor monitor) throws RodinDBException 	{
		
		EventBElement extension = synchroniser.load(abstractExtensionRoot, null, monitor);
		
		synchroniser.save(refineEventBElement(extension), concreteEventBRoot, monitor);
	}

	
	/**
	 * Returns refined component from root component.
	 * 
	 * 
	 * @param abstractEventBElement
	 * @return
	 */
	private EventBElement refineEventBElement(EventBElement abstractEventBElement) {

		
		copier = new Copier(true,false);
		// create refined Component using copier.
		// this does a deep copy of all the children and properties of the copied element
		// but it does not copy any references
		EventBElement concreteEventBElement = (EventBElement) copier.copy(abstractEventBElement); 

		//copier.copyReferences();  THIS DOES NOT WORK - INSTEAD SEE BELOW
		copyReferences(concreteEventBElement);

		//having copied everything we may need to remove some kinds of elements that are not supposed to be
		//copied into a refinement
		filterElements(concreteEventBElement);
		
		return concreteEventBElement;
	}

	/*
	 * This removes any elements that are of a type (EClass) listed in filterList
	 */
	@SuppressWarnings("unchecked")
	private void filterElements(EventBElement concreteEventBElement) {
		List<EObject> removeList = new ArrayList<EObject>();
		for (EClass removeClass : filterList){
			removeList.addAll(concreteEventBElement.getAllContained(removeClass, true));
		}
		for (EObject eObject : removeList){
			if (eObject != null){
				EStructuralFeature feature = eObject.eContainingFeature();
				EObject parent = eObject.eContainer();
				if (parent != null && feature!= null && parent.eClass().getEStructuralFeatures().contains(feature)) {
					if (feature.isMany()){
						((EList<EObject>) parent.eGet(feature)).remove(eObject);
					}else{
						parent.eUnset(feature);
					}
				}
			}
		}
	}

	/*
	 * This sets up the references in the new refined model according to the 
	 * settings in the referenceMap
	 */
	@SuppressWarnings("unchecked")
	private void copyReferences(EventBElement concreteEventBElement) {
		// Set up references in the new concrete model  (note that copier.copyReferences() does not work for this)
		//get all the content of the root Element including itself
		EList<EObject> contents = concreteEventBElement.getAllContained(CorePackage.Literals.EVENT_BELEMENT, true);
		contents.add(concreteEventBElement);
		// iterate through the contents looking for references corresponding to those declared in the referencemap
		// and copy them in the appropriate way according to multiplicity and the refencemap.
		for (EObject eObject : contents){
			if (eObject instanceof EventBElement){
				EReference referenceFeature;
				URI referenceResourceURI;
				for (Entry<EReference, Boolean> referenceEntry : referencemap.entrySet()){
					referenceFeature = referenceEntry.getKey(); 
					if (referenceFeature.getEContainingClass().isSuperTypeOf(eObject.eClass())){
						if (referenceEntry.getValue().booleanValue() == true){
							referenceResourceURI = abstractResourceURI;
						}else{
							referenceResourceURI = concreteResourceURI;
						}
						if (referenceFeature.isMany()){
							for (EObject abstractReference : (EList<EObject>)(getKeyByValue(copier, eObject)).eGet(referenceFeature)){
								((EList<EObject>)eObject.eGet(referenceFeature)).add(
										 EMFCoreUtil.createProxy(
												 //(EClass)referenceFeature.getEType(),
												 ((EObject) abstractReference).eClass(),
												 referenceResourceURI.appendFragment(EcoreUtil.getURI(abstractReference).fragment()
										)));
							}
						}else{
							if (referenceFeature.getEType() instanceof EClass){
								Object referencedObject;
								if (referenceEntry.getValue().booleanValue() == true){
									//for references back to the abstract source e.g. refines
									referencedObject = getKeyByValue(copier, eObject); 
								}else{
									//for references to other objects in the concrete model
									referencedObject = getKeyByValue(copier, eObject).eGet(referenceFeature);
								}
								if (referencedObject instanceof EObject){
									eObject.eSet(
										referenceFeature, 
										EMFCoreUtil.createProxy(
												//(EClass)referenceFeature.getEType(),
												((EObject) referencedObject).eClass(),
												referenceResourceURI.appendFragment(EcoreUtil.getURI((EObject)referencedObject).fragment()
												)));
								}
							}
						}
					}
				}
			}
		}
	}

	
}
