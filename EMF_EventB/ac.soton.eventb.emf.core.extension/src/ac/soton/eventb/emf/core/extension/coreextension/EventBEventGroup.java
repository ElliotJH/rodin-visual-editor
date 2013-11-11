/**
 * Copyright (c) 2012/13 - University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package ac.soton.eventb.emf.core.extension.coreextension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Witness;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event BEvent Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getElaborates <em>Elaborates</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#isExtended <em>Extended</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getGuards <em>Guards</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getActions <em>Actions</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getWitnesses <em>Witnesses</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup()
 * @model abstract="true"
 * @generated
 */
public interface EventBEventGroup extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012/13 - University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>Elaborates</b></em>' reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elaborates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elaborates</em>' reference list.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Elaborates()
	 * @model
	 * @generated
	 */
	EList<Event> getElaborates();

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended</em>' attribute.
	 * @see #setExtended(boolean)
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Extended()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isExtended();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#isExtended <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' attribute.
	 * @see #isExtended()
	 * @generated
	 */
	void setExtended(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.core.extension.coreextension.TypedParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Guard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guards</em>' containment reference list.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Guards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Guard> getGuards();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Witnesses</b></em>' containment reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Witness}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Witnesses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Witnesses</em>' containment reference list.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Witnesses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Witness> getWitnesses();

} // EventBEventGroup
