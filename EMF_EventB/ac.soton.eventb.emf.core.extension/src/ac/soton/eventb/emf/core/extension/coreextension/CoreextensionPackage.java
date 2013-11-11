/**
 * Copyright (c) 2012/13 - University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package ac.soton.eventb.emf.core.extension.coreextension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.machine.MachinePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionFactory
 * @model kind="package"
 * @generated
 */
public interface CoreextensionPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012/13 - University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "coreextension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/eventb/coreextension/0613";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "coreextension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreextensionPackage eINSTANCE = ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.TypeImpl
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.TypedParameterImpl <em>Typed Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.TypedParameterImpl
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getTypedParameter()
	 * @generated
	 */
	int TYPED_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAMETER__ANNOTATIONS = MachinePackage.PARAMETER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAMETER__EXTENSIONS = MachinePackage.PARAMETER__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAMETER__ATTRIBUTES = MachinePackage.PARAMETER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAMETER__REFERENCE = MachinePackage.PARAMETER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAMETER__GENERATED = MachinePackage.PARAMETER__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAMETER__LOCAL_GENERATED = MachinePackage.PARAMETER__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAMETER__COMMENT = MachinePackage.PARAMETER__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAMETER__NAME = MachinePackage.PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAMETER__TYPE = MachinePackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PARAMETER_FEATURE_COUNT = MachinePackage.PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBLabeledImpl <em>Event BLabeled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBLabeledImpl
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBLabeled()
	 * @generated
	 */
	int EVENT_BLABELED = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BLABELED__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Event BLabeled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BLABELED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBRelationKindImpl <em>Event BRelation Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBRelationKindImpl
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBRelationKind()
	 * @generated
	 */
	int EVENT_BRELATION_KIND = 3;

	/**
	 * The feature id for the '<em><b>Surjective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BRELATION_KIND__SURJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Injective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BRELATION_KIND__INJECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BRELATION_KIND__TOTAL = 2;

	/**
	 * The feature id for the '<em><b>Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BRELATION_KIND__FUNCTIONAL = 3;

	/**
	 * The number of structural features of the '<em>Event BRelation Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BRELATION_KIND_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBDataElaborationImpl <em>Event BData Elaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBDataElaborationImpl
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBDataElaboration()
	 * @generated
	 */
	int EVENT_BDATA_ELABORATION = 4;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BDATA_ELABORATION__ELABORATES = 0;

	/**
	 * The feature id for the '<em><b>Data Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BDATA_ELABORATION__DATA_KIND = 1;

	/**
	 * The number of structural features of the '<em>Event BData Elaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BDATA_ELABORATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBEventGroupImpl <em>Event BEvent Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBEventGroupImpl
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBEventGroup()
	 * @generated
	 */
	int EVENT_BEVENT_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BEVENT_GROUP__ELABORATES = 0;

	/**
	 * The feature id for the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BEVENT_GROUP__EXTENDED = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BEVENT_GROUP__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BEVENT_GROUP__GUARDS = 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->>
	 * @generated
	 * @ordered
	 */
	int EVENT_BEVENT_GROUP__ACTIONS = 4;

	/**
	 * The feature id for the '<em><b>Witnesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BEVENT_GROUP__WITNESSES = 5;

	/**
	 * The number of structural features of the '<em>Event BEvent Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BEVENT_GROUP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledElementImpl <em>Event BCommented Labeled Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledElementImpl
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBCommentedLabeledElement()
	 * @generated
	 */
	int EVENT_BCOMMENTED_LABELED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_ELEMENT__ANNOTATIONS = CorePackage.EVENT_BCOMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_ELEMENT__EXTENSIONS = CorePackage.EVENT_BCOMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_ELEMENT__ATTRIBUTES = CorePackage.EVENT_BCOMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_ELEMENT__REFERENCE = CorePackage.EVENT_BCOMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_ELEMENT__GENERATED = CorePackage.EVENT_BCOMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_ELEMENT__LOCAL_GENERATED = CorePackage.EVENT_BCOMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_ELEMENT__COMMENT = CorePackage.EVENT_BCOMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_ELEMENT__LABEL = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event BCommented Labeled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_ELEMENT_FEATURE_COUNT = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledEventGroupElementImpl <em>Event BCommented Labeled Event Group Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledEventGroupElementImpl
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBCommentedLabeledEventGroupElement()
	 * @generated
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ANNOTATIONS = EVENT_BCOMMENTED_LABELED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__EXTENSIONS = EVENT_BCOMMENTED_LABELED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ATTRIBUTES = EVENT_BCOMMENTED_LABELED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__REFERENCE = EVENT_BCOMMENTED_LABELED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__GENERATED = EVENT_BCOMMENTED_LABELED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__LOCAL_GENERATED = EVENT_BCOMMENTED_LABELED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__COMMENT = EVENT_BCOMMENTED_LABELED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__LABEL = EVENT_BCOMMENTED_LABELED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ELABORATES = EVENT_BCOMMENTED_LABELED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__EXTENDED = EVENT_BCOMMENTED_LABELED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__PARAMETERS = EVENT_BCOMMENTED_LABELED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__GUARDS = EVENT_BCOMMENTED_LABELED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ACTIONS = EVENT_BCOMMENTED_LABELED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Witnesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__WITNESSES = EVENT_BCOMMENTED_LABELED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Event BCommented Labeled Event Group Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT_FEATURE_COUNT = EVENT_BCOMMENTED_LABELED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBNamedCommentedDataElaborationElementImpl <em>Event BNamed Commented Data Elaboration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBNamedCommentedDataElaborationElementImpl
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBNamedCommentedDataElaborationElement()
	 * @generated
	 */
	int EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ELABORATES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__DATA_KIND = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event BNamed Commented Data Elaboration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBNamedCommentedRelationDataElaborationElementImpl <em>Event BNamed Commented Relation Data Elaboration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBNamedCommentedRelationDataElaborationElementImpl
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBNamedCommentedRelationDataElaborationElement()
	 * @generated
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__ANNOTATIONS = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__EXTENSIONS = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__ATTRIBUTES = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__REFERENCE = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__GENERATED = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__LOCAL_GENERATED = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__COMMENT = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__NAME = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__ELABORATES = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ELABORATES;

	/**
	 * The feature id for the '<em><b>Data Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__DATA_KIND = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__DATA_KIND;

	/**
	 * The feature id for the '<em><b>Surjective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__SURJECTIVE = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Injective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__INJECTIVE = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__TOTAL = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT__FUNCTIONAL = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event BNamed Commented Relation Data Elaboration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT_FEATURE_COUNT = EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.core.extension.coreextension.DataKind <em>Data Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.core.extension.coreextension.DataKind
	 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getDataKind()
	 * @generated
	 */
	int DATA_KIND = 10;


	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.core.extension.coreextension.TypedParameter <em>Typed Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Parameter</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.TypedParameter
	 * @generated
	 */
	EClass getTypedParameter();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.core.extension.coreextension.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.core.extension.coreextension.Type#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.Type#getType()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Type();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled <em>Event BLabeled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event BLabeled</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled
	 * @generated
	 */
	EClass getEventBLabeled();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled#getLabel()
	 * @see #getEventBLabeled()
	 * @generated
	 */
	EAttribute getEventBLabeled_Label();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind <em>Event BRelation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event BRelation Kind</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind
	 * @generated
	 */
	EClass getEventBRelationKind();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isSurjective <em>Surjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surjective</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isSurjective()
	 * @see #getEventBRelationKind()
	 * @generated
	 */
	EAttribute getEventBRelationKind_Surjective();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isInjective <em>Injective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Injective</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isInjective()
	 * @see #getEventBRelationKind()
	 * @generated
	 */
	EAttribute getEventBRelationKind_Injective();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isTotal()
	 * @see #getEventBRelationKind()
	 * @generated
	 */
	EAttribute getEventBRelationKind_Total();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isFunctional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isFunctional()
	 * @see #getEventBRelationKind()
	 * @generated
	 */
	EAttribute getEventBRelationKind_Functional();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration <em>Event BData Elaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event BData Elaboration</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration
	 * @generated
	 */
	EClass getEventBDataElaboration();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration#getElaborates <em>Elaborates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elaborates</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration#getElaborates()
	 * @see #getEventBDataElaboration()
	 * @generated
	 */
	EReference getEventBDataElaboration_Elaborates();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration#getDataKind <em>Data Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Kind</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration#getDataKind()
	 * @see #getEventBDataElaboration()
	 * @generated
	 */
	EAttribute getEventBDataElaboration_DataKind();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup <em>Event BEvent Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event BEvent Group</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup
	 * @generated
	 */
	EClass getEventBEventGroup();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getElaborates <em>Elaborates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elaborates</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getElaborates()
	 * @see #getEventBEventGroup()
	 * @generated
	 */
	EReference getEventBEventGroup_Elaborates();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#isExtended <em>Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#isExtended()
	 * @see #getEventBEventGroup()
	 * @generated
	 */
	EAttribute getEventBEventGroup_Extended();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getParameters()
	 * @see #getEventBEventGroup()
	 * @generated
	 */
	EReference getEventBEventGroup_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guards</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getGuards()
	 * @see #getEventBEventGroup()
	 * @generated
	 */
	EReference getEventBEventGroup_Guards();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getActions()
	 * @see #getEventBEventGroup()
	 * @generated
	 */
	EReference getEventBEventGroup_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getWitnesses <em>Witnesses</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Witnesses</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getWitnesses()
	 * @see #getEventBEventGroup()
	 * @generated
	 */
	EReference getEventBEventGroup_Witnesses();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBCommentedLabeledEventGroupElement <em>Event BCommented Labeled Event Group Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event BCommented Labeled Event Group Element</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBCommentedLabeledEventGroupElement
	 * @generated
	 */
	EClass getEventBCommentedLabeledEventGroupElement();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBCommentedLabeledElement <em>Event BCommented Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event BCommented Labeled Element</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBCommentedLabeledElement
	 * @generated
	 */
	EClass getEventBCommentedLabeledElement();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBNamedCommentedDataElaborationElement <em>Event BNamed Commented Data Elaboration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event BNamed Commented Data Elaboration Element</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBNamedCommentedDataElaborationElement
	 * @generated
	 */
	EClass getEventBNamedCommentedDataElaborationElement();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBNamedCommentedRelationDataElaborationElement <em>Event BNamed Commented Relation Data Elaboration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event BNamed Commented Relation Data Elaboration Element</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.EventBNamedCommentedRelationDataElaborationElement
	 * @generated
	 */
	EClass getEventBNamedCommentedRelationDataElaborationElement();

	/**
	 * Returns the meta object for enum '{@link ac.soton.eventb.emf.core.extension.coreextension.DataKind <em>Data Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Kind</em>'.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.DataKind
	 * @generated
	 */
	EEnum getDataKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreextensionFactory getCoreextensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.TypedParameterImpl <em>Typed Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.TypedParameterImpl
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getTypedParameter()
		 * @generated
		 */
		EClass TYPED_PARAMETER = eINSTANCE.getTypedParameter();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.TypeImpl
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__TYPE = eINSTANCE.getType_Type();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBLabeledImpl <em>Event BLabeled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBLabeledImpl
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBLabeled()
		 * @generated
		 */
		EClass EVENT_BLABELED = eINSTANCE.getEventBLabeled();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BLABELED__LABEL = eINSTANCE.getEventBLabeled_Label();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBRelationKindImpl <em>Event BRelation Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBRelationKindImpl
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBRelationKind()
		 * @generated
		 */
		EClass EVENT_BRELATION_KIND = eINSTANCE.getEventBRelationKind();

		/**
		 * The meta object literal for the '<em><b>Surjective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BRELATION_KIND__SURJECTIVE = eINSTANCE.getEventBRelationKind_Surjective();

		/**
		 * The meta object literal for the '<em><b>Injective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BRELATION_KIND__INJECTIVE = eINSTANCE.getEventBRelationKind_Injective();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BRELATION_KIND__TOTAL = eINSTANCE.getEventBRelationKind_Total();

		/**
		 * The meta object literal for the '<em><b>Functional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BRELATION_KIND__FUNCTIONAL = eINSTANCE.getEventBRelationKind_Functional();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBDataElaborationImpl <em>Event BData Elaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBDataElaborationImpl
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBDataElaboration()
		 * @generated
		 */
		EClass EVENT_BDATA_ELABORATION = eINSTANCE.getEventBDataElaboration();

		/**
		 * The meta object literal for the '<em><b>Elaborates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_BDATA_ELABORATION__ELABORATES = eINSTANCE.getEventBDataElaboration_Elaborates();

		/**
		 * The meta object literal for the '<em><b>Data Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BDATA_ELABORATION__DATA_KIND = eINSTANCE.getEventBDataElaboration_DataKind();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBEventGroupImpl <em>Event BEvent Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBEventGroupImpl
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBEventGroup()
		 * @generated
		 */
		EClass EVENT_BEVENT_GROUP = eINSTANCE.getEventBEventGroup();

		/**
		 * The meta object literal for the '<em><b>Elaborates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_BEVENT_GROUP__ELABORATES = eINSTANCE.getEventBEventGroup_Elaborates();

		/**
		 * The meta object literal for the '<em><b>Extended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BEVENT_GROUP__EXTENDED = eINSTANCE.getEventBEventGroup_Extended();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_BEVENT_GROUP__PARAMETERS = eINSTANCE.getEventBEventGroup_Parameters();

		/**
		 * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_BEVENT_GROUP__GUARDS = eINSTANCE.getEventBEventGroup_Guards();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_BEVENT_GROUP__ACTIONS = eINSTANCE.getEventBEventGroup_Actions();

		/**
		 * The meta object literal for the '<em><b>Witnesses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_BEVENT_GROUP__WITNESSES = eINSTANCE.getEventBEventGroup_Witnesses();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledEventGroupElementImpl <em>Event BCommented Labeled Event Group Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledEventGroupElementImpl
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBCommentedLabeledEventGroupElement()
		 * @generated
		 */
		EClass EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT = eINSTANCE.getEventBCommentedLabeledEventGroupElement();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledElementImpl <em>Event BCommented Labeled Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledElementImpl
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBCommentedLabeledElement()
		 * @generated
		 */
		EClass EVENT_BCOMMENTED_LABELED_ELEMENT = eINSTANCE.getEventBCommentedLabeledElement();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBNamedCommentedDataElaborationElementImpl <em>Event BNamed Commented Data Elaboration Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBNamedCommentedDataElaborationElementImpl
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBNamedCommentedDataElaborationElement()
		 * @generated
		 */
		EClass EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT = eINSTANCE.getEventBNamedCommentedDataElaborationElement();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBNamedCommentedRelationDataElaborationElementImpl <em>Event BNamed Commented Relation Data Elaboration Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.EventBNamedCommentedRelationDataElaborationElementImpl
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getEventBNamedCommentedRelationDataElaborationElement()
		 * @generated
		 */
		EClass EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT = eINSTANCE.getEventBNamedCommentedRelationDataElaborationElement();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.core.extension.coreextension.DataKind <em>Data Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.core.extension.coreextension.DataKind
		 * @see ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionPackageImpl#getDataKind()
		 * @generated
		 */
		EEnum DATA_KIND = eINSTANCE.getDataKind();

	}

} //CoreextensionPackage
