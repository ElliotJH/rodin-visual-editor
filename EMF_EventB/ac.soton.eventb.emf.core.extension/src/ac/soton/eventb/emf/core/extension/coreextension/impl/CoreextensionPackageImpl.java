/**
 * Copyright (c) 2012/13 - University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package ac.soton.eventb.emf.core.extension.coreextension.impl;

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionFactory;
import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.coreextension.DataKind;
import ac.soton.eventb.emf.core.extension.coreextension.EventBCommentedLabeledElement;
import ac.soton.eventb.emf.core.extension.coreextension.EventBCommentedLabeledEventGroupElement;
import ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration;
import ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup;
import ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled;
import ac.soton.eventb.emf.core.extension.coreextension.EventBNamedCommentedDataElaborationElement;
import ac.soton.eventb.emf.core.extension.coreextension.EventBNamedCommentedRelationDataElaborationElement;
import ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind;
import ac.soton.eventb.emf.core.extension.coreextension.Type;
import ac.soton.eventb.emf.core.extension.coreextension.TypedParameter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eventb.emf.core.CorePackage;

import org.eventb.emf.core.machine.MachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreextensionPackageImpl extends EPackageImpl implements CoreextensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012/13 - University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBLabeledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBRelationKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBDataElaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBEventGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBCommentedLabeledEventGroupElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBCommentedLabeledElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBNamedCommentedDataElaborationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBNamedCommentedRelationDataElaborationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoreextensionPackageImpl() {
		super(eNS_URI, CoreextensionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CoreextensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoreextensionPackage init() {
		if (isInited) return (CoreextensionPackage)EPackage.Registry.INSTANCE.getEPackage(CoreextensionPackage.eNS_URI);

		// Obtain or create and register package
		CoreextensionPackageImpl theCoreextensionPackage = (CoreextensionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CoreextensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CoreextensionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCoreextensionPackage.createPackageContents();

		// Initialize created meta-data
		theCoreextensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCoreextensionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoreextensionPackage.eNS_URI, theCoreextensionPackage);
		return theCoreextensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedParameter() {
		return typedParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Type() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBLabeled() {
		return eventBLabeledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBLabeled_Label() {
		return (EAttribute)eventBLabeledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBRelationKind() {
		return eventBRelationKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBRelationKind_Surjective() {
		return (EAttribute)eventBRelationKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBRelationKind_Injective() {
		return (EAttribute)eventBRelationKindEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBRelationKind_Total() {
		return (EAttribute)eventBRelationKindEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBRelationKind_Functional() {
		return (EAttribute)eventBRelationKindEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBDataElaboration() {
		return eventBDataElaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBDataElaboration_Elaborates() {
		return (EReference)eventBDataElaborationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBDataElaboration_DataKind() {
		return (EAttribute)eventBDataElaborationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBEventGroup() {
		return eventBEventGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBEventGroup_Elaborates() {
		return (EReference)eventBEventGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBEventGroup_Extended() {
		return (EAttribute)eventBEventGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBEventGroup_Parameters() {
		return (EReference)eventBEventGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBEventGroup_Guards() {
		return (EReference)eventBEventGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBEventGroup_Actions() {
		return (EReference)eventBEventGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBEventGroup_Witnesses() {
		return (EReference)eventBEventGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBCommentedLabeledEventGroupElement() {
		return eventBCommentedLabeledEventGroupElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBCommentedLabeledElement() {
		return eventBCommentedLabeledElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBNamedCommentedDataElaborationElement() {
		return eventBNamedCommentedDataElaborationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBNamedCommentedRelationDataElaborationElement() {
		return eventBNamedCommentedRelationDataElaborationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataKind() {
		return dataKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreextensionFactory getCoreextensionFactory() {
		return (CoreextensionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		typedParameterEClass = createEClass(TYPED_PARAMETER);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__TYPE);

		eventBLabeledEClass = createEClass(EVENT_BLABELED);
		createEAttribute(eventBLabeledEClass, EVENT_BLABELED__LABEL);

		eventBRelationKindEClass = createEClass(EVENT_BRELATION_KIND);
		createEAttribute(eventBRelationKindEClass, EVENT_BRELATION_KIND__SURJECTIVE);
		createEAttribute(eventBRelationKindEClass, EVENT_BRELATION_KIND__INJECTIVE);
		createEAttribute(eventBRelationKindEClass, EVENT_BRELATION_KIND__TOTAL);
		createEAttribute(eventBRelationKindEClass, EVENT_BRELATION_KIND__FUNCTIONAL);

		eventBDataElaborationEClass = createEClass(EVENT_BDATA_ELABORATION);
		createEReference(eventBDataElaborationEClass, EVENT_BDATA_ELABORATION__ELABORATES);
		createEAttribute(eventBDataElaborationEClass, EVENT_BDATA_ELABORATION__DATA_KIND);

		eventBEventGroupEClass = createEClass(EVENT_BEVENT_GROUP);
		createEReference(eventBEventGroupEClass, EVENT_BEVENT_GROUP__ELABORATES);
		createEAttribute(eventBEventGroupEClass, EVENT_BEVENT_GROUP__EXTENDED);
		createEReference(eventBEventGroupEClass, EVENT_BEVENT_GROUP__PARAMETERS);
		createEReference(eventBEventGroupEClass, EVENT_BEVENT_GROUP__GUARDS);
		createEReference(eventBEventGroupEClass, EVENT_BEVENT_GROUP__ACTIONS);
		createEReference(eventBEventGroupEClass, EVENT_BEVENT_GROUP__WITNESSES);

		eventBCommentedLabeledEventGroupElementEClass = createEClass(EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT);

		eventBCommentedLabeledElementEClass = createEClass(EVENT_BCOMMENTED_LABELED_ELEMENT);

		eventBNamedCommentedDataElaborationElementEClass = createEClass(EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT);

		eventBNamedCommentedRelationDataElaborationElementEClass = createEClass(EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT);

		// Create enums
		dataKindEEnum = createEEnum(DATA_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MachinePackage theMachinePackage = (MachinePackage)EPackage.Registry.INSTANCE.getEPackage(MachinePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typedParameterEClass.getESuperTypes().add(theMachinePackage.getParameter());
		typedParameterEClass.getESuperTypes().add(this.getType());
		eventBCommentedLabeledEventGroupElementEClass.getESuperTypes().add(this.getEventBCommentedLabeledElement());
		eventBCommentedLabeledEventGroupElementEClass.getESuperTypes().add(this.getEventBEventGroup());
		eventBCommentedLabeledElementEClass.getESuperTypes().add(theCorePackage.getEventBCommentedElement());
		eventBCommentedLabeledElementEClass.getESuperTypes().add(this.getEventBLabeled());
		eventBNamedCommentedDataElaborationElementEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		eventBNamedCommentedDataElaborationElementEClass.getESuperTypes().add(this.getEventBDataElaboration());
		eventBNamedCommentedRelationDataElaborationElementEClass.getESuperTypes().add(this.getEventBNamedCommentedDataElaborationElement());
		eventBNamedCommentedRelationDataElaborationElementEClass.getESuperTypes().add(this.getEventBRelationKind());

		// Initialize classes and features; add operations and parameters
		initEClass(typedParameterEClass, TypedParameter.class, "TypedParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Type(), ecorePackage.getEString(), "type", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventBLabeledEClass, EventBLabeled.class, "EventBLabeled", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventBLabeled_Label(), ecorePackage.getEString(), "label", "", 0, 1, EventBLabeled.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eventBRelationKindEClass, EventBRelationKind.class, "EventBRelationKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventBRelationKind_Surjective(), ecorePackage.getEBoolean(), "surjective", "false", 1, 1, EventBRelationKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventBRelationKind_Injective(), ecorePackage.getEBoolean(), "injective", "false", 1, 1, EventBRelationKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventBRelationKind_Total(), ecorePackage.getEBoolean(), "total", "false", 1, 1, EventBRelationKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventBRelationKind_Functional(), ecorePackage.getEBoolean(), "functional", "false", 1, 1, EventBRelationKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventBDataElaborationEClass, EventBDataElaboration.class, "EventBDataElaboration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventBDataElaboration_Elaborates(), theCorePackage.getEventBNamed(), null, "elaborates", null, 0, 1, EventBDataElaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventBDataElaboration_DataKind(), this.getDataKind(), "dataKind", "Variable", 0, 1, EventBDataElaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventBEventGroupEClass, EventBEventGroup.class, "EventBEventGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventBEventGroup_Elaborates(), theMachinePackage.getEvent(), null, "elaborates", null, 0, -1, EventBEventGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventBEventGroup_Extended(), ecorePackage.getEBoolean(), "extended", "false", 1, 1, EventBEventGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventBEventGroup_Parameters(), this.getTypedParameter(), null, "parameters", null, 0, -1, EventBEventGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventBEventGroup_Guards(), theMachinePackage.getGuard(), null, "guards", null, 0, -1, EventBEventGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventBEventGroup_Actions(), theMachinePackage.getAction(), null, "actions", null, 0, -1, EventBEventGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventBEventGroup_Witnesses(), theMachinePackage.getWitness(), null, "witnesses", null, 0, -1, EventBEventGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventBCommentedLabeledEventGroupElementEClass, EventBCommentedLabeledEventGroupElement.class, "EventBCommentedLabeledEventGroupElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventBCommentedLabeledElementEClass, EventBCommentedLabeledElement.class, "EventBCommentedLabeledElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventBNamedCommentedDataElaborationElementEClass, EventBNamedCommentedDataElaborationElement.class, "EventBNamedCommentedDataElaborationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventBNamedCommentedRelationDataElaborationElementEClass, EventBNamedCommentedRelationDataElaborationElement.class, "EventBNamedCommentedRelationDataElaborationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dataKindEEnum, DataKind.class, "DataKind");
		addEEnumLiteral(dataKindEEnum, DataKind.SET);
		addEEnumLiteral(dataKindEEnum, DataKind.CONSTANT);
		addEEnumLiteral(dataKindEEnum, DataKind.VARIABLE);

		// Create resource
		createResource(eNS_URI);
	}

} //CoreextensionPackageImpl
