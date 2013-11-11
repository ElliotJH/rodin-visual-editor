/*******************************************************************************
 * Copyright (c) 2011 University of Duesseldorf, University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.eventb.emf.persistence.synchroniser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.impl.TransactionChangeRecorder;
import org.eventb.core.EventBAttributes;
import org.eventb.core.ICommentedElement;
import org.eventb.core.IConfigurationElement;
import org.eventb.core.IIdentifierElement;
import org.eventb.core.ILabeledElement;
import org.eventb.emf.core.Annotation;
import org.eventb.emf.core.Attribute;
import org.eventb.emf.core.AttributeType;
import org.eventb.emf.core.CoreFactory;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBCommented;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.persistence.ISynchroniser;
import org.eventb.emf.persistence.PersistencePlugin;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.IAttributeValue;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinDBStatusConstants;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.RodinCore;
import org.rodinp.core.RodinDBException;

/**
 * Abstract basis for synchronisers that save/load between EMF and Rodin
 * 
 * cfs (04/01/12) Update the Annotation for rodin internal names when a new name
 * is allocated. if updating an existing entry, disable notifications on the
 * entry so that the transactional editing adapter doesn't object.
 * 
 * cfs (20/06/13) catch unknown attributes when saving generic attributes
 * 
 * @author cfs/ff
 * 
 */

public abstract class AbstractSynchroniser implements ISynchroniser {

	private static final String UNKNOWN_ATTRIBUTES = PersistencePlugin.PLUGIN_ID + ".unknownAttributes";
	private static final IAttributeType.String unknownAttributesType = RodinCore.getStringAttrType(UNKNOWN_ATTRIBUTES);
	private static final String IDENTIFIER = "identifier";
	private static final String LABEL = "label";
	private static final String NAME = "name";
	private static final String CONFIGURATION = "configuration";
	private static final String COMMENT = "comment";

	private static final Set<IAttributeType> handledAttributes = new HashSet<IAttributeType>();

	static {
		handledAttributes.add(EventBAttributes.CONFIGURATION_ATTRIBUTE);
		handledAttributes.add(EventBAttributes.LABEL_ATTRIBUTE);
		handledAttributes.add(EventBAttributes.IDENTIFIER_ATTRIBUTE);
		handledAttributes.add(EventBAttributes.COMMENT_ATTRIBUTE);
		handledAttributes.add(EventBAttributes.GENERATED_ATTRIBUTE);
	}

	protected abstract EventBElement createEventBElement();

	protected abstract EStructuralFeature getFeature();

	protected abstract IInternalElementType<?> getRodinType();

	protected abstract Set<IAttributeType> getHandledAttributeTypes();

	@SuppressWarnings("unchecked")
	public <T extends EventBElement> EventBElement load(final IRodinElement rodinElement, final EventBElement emfParent, final IProgressMonitor monitor) throws RodinDBException {
		if (!(rodinElement instanceof IInternalElement))
			throw new RodinDBException(new Exception("Not an Internal Element"), IRodinDBStatusConstants.CORE_EXCEPTION);

		// create EMF node
		final EventBElement eventBElement = createEventBElement();

		loadAttributes((IInternalElement) rodinElement, eventBElement);

		if (emfParent != null) {
			// attach new node to parent
			EStructuralFeature feature = getFeature();

			if (feature instanceof EReference && ((EReference) feature).isContainment()) {
				Object container = emfParent.eGet(feature, false);

				if (container instanceof EList) {
					((EList<Object>) container).add(eventBElement);
				} else {
					emfParent.eSet(feature, eventBElement);
				}
			} else if (feature instanceof EAttribute) {
				emfParent.eSet(feature, eventBElement);
			}
		}

		return eventBElement;
	}

	private void loadAttributes(final IInternalElement rodinElement, final EventBElement eventBElement) throws RodinDBException {
		// create Annotation for rodin internal details
		Annotation rodinInternals = CoreFactory.eINSTANCE.createAnnotation();
		rodinInternals.setSource(PersistencePlugin.SOURCE_RODIN_INTERNAL_ANNOTATION);
		eventBElement.getAnnotations().add(rodinInternals);

		EMap<String, String> rodinInternalDetails = rodinInternals.getDetails();

		if (rodinElement.hasAttribute(EventBAttributes.GENERATED_ATTRIBUTE)) {
			eventBElement.setLocalGenerated(rodinElement.getAttributeValue(EventBAttributes.GENERATED_ATTRIBUTE));
		} else {
			eventBElement.unsetLocalGenerated();
		}

		if (rodinElement instanceof IConfigurationElement) {
			if (((IConfigurationElement) rodinElement).hasConfiguration()) {
				rodinInternalDetails.put(CONFIGURATION, ((IConfigurationElement) rodinElement).getConfiguration());
			}
		}

		// set attributes of new node

		String elementName = rodinElement.getElementName();
		rodinInternalDetails.put(NAME, elementName);
		if (rodinElement instanceof ILabeledElement && ((ILabeledElement) rodinElement).hasLabel()) {
			elementName = ((ILabeledElement) rodinElement).getLabel();
			rodinInternalDetails.put(LABEL, elementName);
		}
		if (rodinElement instanceof IIdentifierElement && ((IIdentifierElement) rodinElement).hasIdentifierString()) {
			elementName = ((IIdentifierElement) rodinElement).getIdentifierString();
			rodinInternalDetails.put(IDENTIFIER, elementName);
		}
		if (eventBElement instanceof EventBNamed) {
			((EventBNamed) eventBElement).setName(elementName);
		}

		if (rodinElement instanceof ICommentedElement && ((ICommentedElement) rodinElement).hasComment()) {
			String comment = ((ICommentedElement) rodinElement).getComment();
			rodinInternalDetails.put(COMMENT, comment);
			if (eventBElement instanceof EventBCommented) {
				((EventBCommented) eventBElement).setComment(comment);
			}
		}

		loadGenericAttributes(rodinElement, eventBElement);
	}

	/**
	 * Loads all attributes which have not been handled by this class or the
	 * concrete implementing synchroniser into an annotation with the source
	 * 
	 * @param rodinElement
	 * @param eventBElement
	 * @throws RodinDBException
	 */
	private void loadGenericAttributes(IInternalElement rodinElement, EventBElement eventBElement) throws RodinDBException {
		// check if we have any conflicting handlers for attributes
		Set<IAttributeType> otherwiseTypes = getHandledAttributeTypes();
		checkConflicts(otherwiseTypes);

		/*
		 * Filter all elements that are already handled by this class and a
		 * concrete synchroniser. We only store those which are unhandled.
		 */
		HashSet<IAttributeType> availableTypes = new HashSet<IAttributeType>(Arrays.asList(rodinElement.getAttributeTypes()));
		availableTypes.removeAll(handledAttributes);
		availableTypes.removeAll(otherwiseTypes);

		// retrieve any attributes that were persisted as unknown attribute types
		if (availableTypes.contains(unknownAttributesType)) {
			String unknownAttributesValue = rodinElement.getAttributeValue(unknownAttributesType);
			String[] unknownAttributes = unknownAttributesValue.split(":" + UNKNOWN_ATTRIBUTES + ":"); //[^a-zA-Z0-9_]+");
			for (String unknown : unknownAttributes) {
				int hash1 = unknown.indexOf("#");
				int hash2 = unknown.indexOf("#", hash1 + 1);
				if (hash1 >= 0 && hash2 > hash1) {
					String id = unknown.substring(0, hash1);
					String typeStr = unknown.substring(hash1 + 1, hash2);
					String valueStr = unknown.substring(hash2 + 1);
					Attribute eventBAttribute = CoreFactory.eINSTANCE.createAttribute();
					eventBAttribute.setType(getType(typeStr));
					eventBAttribute.setValue(getValue(typeStr, valueStr));
					eventBElement.getAttributes().put(id, eventBAttribute);
				}
			}
			availableTypes.remove(unknownAttributesType);
		}
		// add all remaining attributes
		for (IAttributeType type : availableTypes) {
			IAttributeValue rodinAttribute = rodinElement.getAttributeValue(type);
			Attribute eventBAttribute = CoreFactory.eINSTANCE.createAttribute();
			eventBAttribute.setType(getType(rodinAttribute));
			eventBAttribute.setValue(rodinAttribute.getValue());
			eventBElement.getAttributes().put(type.getId(), eventBAttribute);
		}
	}

	private AttributeType getType(String typeStr) {
		if (AttributeType.BOOLEAN.getLiteral().equals(typeStr))
			return AttributeType.BOOLEAN;
		else if (AttributeType.HANDLE.getLiteral().equals(typeStr))
			return AttributeType.HANDLE;
		else if (AttributeType.INTEGER.getLiteral().equals(typeStr))
			return AttributeType.INTEGER;
		else if (AttributeType.LONG.getLiteral().equals(typeStr))
			return AttributeType.LONG;
		else if (AttributeType.STRING.getLiteral().equals(typeStr))
			return AttributeType.STRING;
		return null;
	}

	private Object getValue(String typeStr, String valueStr) {
		if (AttributeType.BOOLEAN.getLiteral().equals(typeStr))
			return Boolean.parseBoolean(valueStr);
		else if (AttributeType.HANDLE.getLiteral().equals(typeStr))
			return valueStr;
		else if (AttributeType.INTEGER.getLiteral().equals(typeStr))
			return Integer.parseInt(valueStr);
		else if (AttributeType.LONG.getLiteral().equals(typeStr))
			return Long.parseLong(valueStr);
		else if (AttributeType.STRING.getLiteral().equals(typeStr))
			return valueStr;
		return null;
	}

	private AttributeType getType(IAttributeValue rodinAttribute) {
		if (rodinAttribute instanceof IAttributeValue.Boolean)
			return AttributeType.BOOLEAN;
		else if (rodinAttribute instanceof IAttributeValue.Handle)
			return AttributeType.HANDLE;
		else if (rodinAttribute instanceof IAttributeValue.Integer)
			return AttributeType.INTEGER;
		else if (rodinAttribute instanceof IAttributeValue.Long)
			return AttributeType.LONG;
		else if (rodinAttribute instanceof IAttributeValue.String)
			return AttributeType.STRING;
		return null;
	}

	/**
	 * Checks whether the given set of {@link IAttributeType}s intersect with
	 * the {@link IAttributeType}s handled by this class. In this case an
	 * exception is thrown.
	 * 
	 * @param otherwiseTypes
	 * @throws CoreException
	 */
	private void checkConflicts(Set<IAttributeType> otherwiseTypes) {
		Set<IAttributeType> intersection = new HashSet<IAttributeType>(otherwiseTypes);
		intersection.retainAll(handledAttributes);

		if (intersection.size() > 0) {
			PersistencePlugin.getDefault().getLog().log(new Status(IStatus.ERROR, PersistencePlugin.PLUGIN_ID, "Conflicting attribute handlers for: " + intersection.toString()));
		}
	}

	public IRodinElement save(final EventBElement eventBElement, final IRodinElement rodinParent, final IProgressMonitor monitor) throws RodinDBException {
		// get rodin details annotation or create if doesn't exist
		Annotation rodinInternals = eventBElement.getAnnotation(PersistencePlugin.SOURCE_RODIN_INTERNAL_ANNOTATION);

		disableTransactionChangeRecorders(rodinInternals, eventBElement); //we may need to update the Annotations without the Transactional Editing Adapter knowing
		if (rodinInternals == null) {
			rodinInternals = CoreFactory.eINSTANCE.createAnnotation();
			rodinInternals.setSource(PersistencePlugin.SOURCE_RODIN_INTERNAL_ANNOTATION);
			eventBElement.getAnnotations().add(rodinInternals);
		}
		reEnableTransactionChangeRecorders(rodinInternals, eventBElement); //turn notification back on

		// create Rodin element
		IInternalElement rodinElement = null;
		if (rodinParent instanceof IRodinFile) {
			IRodinFile file = (IRodinFile) rodinParent;
			if (!file.exists())
				file.create(false, monitor);
			rodinElement = file.getRoot();
			rodinElement.clear(true, monitor);
		} else if (rodinParent instanceof IInternalElement) {
			try {
				rodinElement = getNewRodinElement((IInternalElement) rodinParent, getRodinType(), rodinInternals);
				rodinElement.create(null, monitor);
			} catch (RodinDBException e) {
				PersistencePlugin.getDefault().getLog().log(new Status(IStatus.ERROR, PersistencePlugin.PLUGIN_ID, "Rodin Exception while saving: " + e.getMessage()));
			}
		} else {
			return null;
		}
		saveAttributes(eventBElement, monitor, rodinElement, rodinInternals);

		return rodinElement;
	}

	private IInternalElement getNewRodinElement(IInternalElement rodinParent, IInternalElementType<?> rodinType, Annotation rodinInternals) throws RodinDBException {
		IInternalElement rodinElement = rodinParent.getInternalElement(getRodinType(), getInternalName(rodinInternals));
		if (rodinElement.exists()) {
			//if name clash, overwrite Rodin name with UUID - this should be extremely rare.
			EMap<String, String> rodinInternalDetails = rodinInternals.getDetails();
			disableTransactionChangeRecorders(rodinInternals, rodinInternalDetails, rodinInternalDetails.get(rodinInternalDetails.indexOfKey(NAME)));
			String oldName = rodinInternalDetails.put(NAME, getNewName());
			reEnableTransactionChangeRecorders(rodinInternals, rodinInternalDetails, rodinInternalDetails.get(rodinInternalDetails.indexOfKey(NAME)));
			rodinElement = rodinParent.getInternalElement(getRodinType(), getInternalName(rodinInternals));

			PersistencePlugin.getDefault().getLog()
					.log(new Status(IStatus.WARNING, PersistencePlugin.PLUGIN_ID, "Element name clash - renamed element " + oldName + " to " + rodinElement.getElementName()));
		}
		return rodinElement;
	}

	private void saveAttributes(final EventBElement eventBElement, final IProgressMonitor monitor, final IInternalElement rodinElement, Annotation rodinInternals)
			throws RodinDBException {

		if (eventBElement.isSetLocalGenerated()) {
			rodinElement.setAttributeValue(EventBAttributes.GENERATED_ATTRIBUTE, eventBElement.isLocalGenerated(), monitor);
		}

		if (rodinElement instanceof IConfigurationElement) {
			// make sure the element has a configuration
			String configuration = rodinInternals.getDetails().get(CONFIGURATION);
			if (configuration == null || "".equals(configuration)) {
				configuration = IConfigurationElement.DEFAULT_CONFIGURATION;
				//rodinInternalDetails.put(CONFIGURATION, configuration); not necessary and dangerous re Transaction notifications
			}
			((IConfigurationElement) rodinElement).setConfiguration(configuration, monitor);
		}

		if (rodinElement instanceof ICommentedElement && eventBElement instanceof EventBCommented
				&& ((EventBCommented) eventBElement).eIsSet(CorePackage.eINSTANCE.getEventBCommented_Comment())) {
			((ICommentedElement) rodinElement).setComment(((EventBCommented) eventBElement).getComment(), monitor);
		}

		String elementName = "";
		if (eventBElement instanceof EventBNamed && ((EventBNamed) eventBElement).eIsSet(CorePackage.eINSTANCE.getEventBNamed_Name())) {
			elementName = ((EventBNamed) eventBElement).getName();
		}

		if (rodinElement instanceof ILabeledElement) {
			((ILabeledElement) rodinElement).setLabel(elementName, monitor);
		}

		if (rodinElement instanceof IIdentifierElement) {
			((IIdentifierElement) rodinElement).setIdentifierString(elementName, monitor);
		}

		saveGenericAttributes(rodinElement, eventBElement, monitor);
	}

	private void saveGenericAttributes(IInternalElement rodinElement, EventBElement eventBElement, IProgressMonitor monitor) throws RodinDBException, IllegalArgumentException {
		for (Entry<String, Attribute> attribute : eventBElement.getAttributes()) {
			String id = attribute.getKey();
			Object value = attribute.getValue().getValue();
			String type = attribute.getValue().getType().getLiteral();
			IAttributeValue rodinAttributeValue = null;
			try {
				switch (attribute.getValue().getType().getValue()) {
				case AttributeType.BOOLEAN_VALUE:
					IAttributeType.Boolean booleanType = (IAttributeType.Boolean) RodinCore.getAttributeType(id);
					rodinAttributeValue = booleanType.makeValue((Boolean) value);
					break;
				case AttributeType.HANDLE_VALUE:
					IAttributeType.Handle handleType = (IAttributeType.Handle) RodinCore.getAttributeType(id);
					rodinAttributeValue = handleType.makeValue((IRodinElement) value);
					break;
				case AttributeType.INTEGER_VALUE:
					IAttributeType.Integer integerType = (IAttributeType.Integer) RodinCore.getAttributeType(id);
					rodinAttributeValue = integerType.makeValue((Integer) value);
					break;
				case AttributeType.LONG_VALUE:
					IAttributeType.Long longType = RodinCore.getLongAttrType(id);
					rodinAttributeValue = longType.makeValue((Long) value);
					break;
				case AttributeType.STRING_VALUE:
					IAttributeType.String stringType = RodinCore.getStringAttrType(id);
					rodinAttributeValue = stringType.makeValue((String) value);
					break;
				default:
				}
			} catch (IllegalArgumentException iae) {
				PersistencePlugin
						.getDefault()
						.getLog()
						.log(new Status(IStatus.WARNING, PersistencePlugin.PLUGIN_ID, "Attribute of unknown type " + id + " was saved in " + UNKNOWN_ATTRIBUTES + " \n value = "
								+ value));
				// this is a mechanism to persist the unknown attribute in string form so that it is not lost
				// (it will be converted back to a Event-B_EMF generic attribute if the file is loaded again)
				String currentValue = "";
				if (rodinElement.hasAttribute(unknownAttributesType)) {
					currentValue = rodinElement.getAttributeValue(unknownAttributesType);
				}
				if (!"".equals(currentValue))
					currentValue = currentValue + ":" + UNKNOWN_ATTRIBUTES + ":";
				rodinAttributeValue = unknownAttributesType.makeValue(currentValue + id + "#" + type + "#" + value.toString());
			}
			if (rodinAttributeValue != null)
				rodinElement.setAttributeValue(rodinAttributeValue, monitor);
		}
	}

	private String getInternalName(Annotation rodinInternals) {
		String name = null;
		Entry<String, String> nameEntry = null;
		EMap<String, String> rodinInternalDetails = rodinInternals.getDetails();
		//try to obtain the name from rodinInternalDetails
		if (rodinInternalDetails.containsKey(NAME)) {
			nameEntry = rodinInternalDetails.get(rodinInternalDetails.indexOfKey(NAME));
			name = nameEntry.getValue();
		}
		// if no usuable name was obtained ...
		if (name == null || "".equals(name)) {
			//get a new name 
			name = getNewName();
			//remember the new name for next time
			//(if a name entry already existed disable notifications so that TransactionChangeRecorder doesn't know we are changing it)
			disableTransactionChangeRecorders(nameEntry, rodinInternals);
			rodinInternalDetails.put(NAME, name);
			reEnableTransactionChangeRecorders(nameEntry, rodinInternals);
		}

		return name;
	}

	protected String getNewName() {
		return EcoreUtil.generateUUID();
	}

	////////////////////////////////////////////////////////////////

	private final Map<Notifier, List<TransactionChangeRecorder>> savedAdapters = new HashMap<Notifier, List<TransactionChangeRecorder>>();;

	/**
	 * This removes and caches all adapters of type, TransactionChangeRecorder
	 * from all the elements in the parameter list. This enables modifications
	 * to be made to these elements even if the model is protected by the
	 * Transactional Command Framework. (Only background annotations/properties
	 * should be changed in this way since editors need to know of any major
	 * changes to the model).
	 * 
	 * Any object, including null, can be passed to this method. Anything that
	 * is not a notifier or has no TransactionChangeRecorder adapters will be
	 * ignored.
	 * 
	 * @param elements
	 */
	protected void disableTransactionChangeRecorders(Object... elements) {
		for (Object element : elements) {
			if (element instanceof Notifier) {
				List<TransactionChangeRecorder> tcrs = new ArrayList<TransactionChangeRecorder>();
				for (Adapter adapter : ((Notifier) element).eAdapters()) {
					if (adapter instanceof TransactionChangeRecorder) {
						tcrs.add((TransactionChangeRecorder) adapter);
					}
				}
				if (tcrs != null && tcrs.size() > 0) {
					((Notifier) element).eAdapters().removeAll(tcrs);
					savedAdapters.put((Notifier) element, tcrs);
				}

			}

		}
	}

	/**
	 * Replace TransactionChangeRecorder adapters that have previously been
	 * removed via 'diableTransactionChangeRecorders' for all the elements in
	 * the parameter list.
	 * 
	 * Any object, including null, can be passed to this method. Anything that
	 * is not a notifier that is in the cached map of previously disabled
	 * elements will be ignored.
	 * 
	 * @param elements
	 */
	protected void reEnableTransactionChangeRecorders(Object... elements) {
		for (Object element : elements) {
			if (element instanceof Notifier) {
				if (savedAdapters.containsKey(element)) {
					((Notifier) element).eAdapters().addAll(savedAdapters.get(element));
					savedAdapters.remove(element);
				}
			}
		}
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Support for adding an annotation to record the internal name of a rodin reference element so that it can be reused on save 
	// (to avoid create a new name on each save which causes unnecessary changes which are a nuisance for comparisons)

	/**
	 * Saves the Rodin internal reference name with the key ..................
	 * 'kind+" "+referencedElementName' in an annotation attached to the emf
	 * element The annotation is created if one is not already attached to the
	 * emf element. (This is intended to be called during load operations. if
	 * called from a save it may be necessary to disable transactional change
	 * recorders first)
	 * 
	 * @param emfElement
	 * @param kind
	 * @param referencedElementName
	 * @param internalReferenceName
	 * @since 2.5
	 */
	protected void saveRodinReferenceInternalName(final EventBElement emfElement, String kind, String referencedElementName, String internalReferenceName) {
		Annotation rodinReferenceNames = emfElement.getAnnotation(PersistencePlugin.SOURCE_RODIN_REFERENCE_NAMES_ANNOTATION);
		if (rodinReferenceNames == null) {
			// create Annotation for rodin reference element name details
			rodinReferenceNames = CoreFactory.eINSTANCE.createAnnotation();
			rodinReferenceNames.setSource(PersistencePlugin.SOURCE_RODIN_REFERENCE_NAMES_ANNOTATION);
			emfElement.getAnnotations().add(rodinReferenceNames);
		}
		// create Annotation for rodin reference element name details
		rodinReferenceNames.getDetails().put(kind + " " + referencedElementName, internalReferenceName);
	}

	/**
	 * Get a Rodin internal name for a Rodin reference element. Such elements do
	 * not exist in EMF. If a name has been saved during load in an annotation
	 * attached to the provided parent emf element, this will be retrieved using
	 * the key 'kind+" "+referencedElementName' otherwise a new name will be
	 * generated (and saved in an annotation for future use).
	 * 
	 * @param emfElement
	 * @param kind
	 * @param referencedElementName
	 * @return
	 * @since 2.5
	 */
	protected String getRodinReferenceInternalName(final EventBElement emfElement, String kind, String referencedElementName) {
		Annotation rodinReferenceNames = emfElement.getAnnotation(PersistencePlugin.SOURCE_RODIN_REFERENCE_NAMES_ANNOTATION);
		if (rodinReferenceNames != null && rodinReferenceNames.getDetails().containsKey(kind + " " + referencedElementName)) {
			return rodinReferenceNames.getDetails().get(kind + " " + referencedElementName);
		} else {
			String newName = getNewName();
			disableTransactionChangeRecorders(emfElement);
			saveRodinReferenceInternalName(emfElement, kind, referencedElementName, newName);
			reEnableTransactionChangeRecorders(emfElement);
			return newName;
		}
	}

}
