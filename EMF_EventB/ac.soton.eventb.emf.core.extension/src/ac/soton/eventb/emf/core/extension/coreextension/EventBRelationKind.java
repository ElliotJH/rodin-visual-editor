/**
 * Copyright (c) 2012/13 - University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package ac.soton.eventb.emf.core.extension.coreextension;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event BRelation Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isSurjective <em>Surjective</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isInjective <em>Injective</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isTotal <em>Total</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isFunctional <em>Functional</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBRelationKind()
 * @model abstract="true"
 * @generated
 */
public interface EventBRelationKind extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012/13 - University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>Surjective</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surjective</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surjective</em>' attribute.
	 * @see #setSurjective(boolean)
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBRelationKind_Surjective()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSurjective();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isSurjective <em>Surjective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surjective</em>' attribute.
	 * @see #isSurjective()
	 * @generated
	 */
	void setSurjective(boolean value);

	/**
	 * Returns the value of the '<em><b>Injective</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injective</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injective</em>' attribute.
	 * @see #setInjective(boolean)
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBRelationKind_Injective()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isInjective();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isInjective <em>Injective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Injective</em>' attribute.
	 * @see #isInjective()
	 * @generated
	 */
	void setInjective(boolean value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(boolean)
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBRelationKind_Total()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isTotal();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #isTotal()
	 * @generated
	 */
	void setTotal(boolean value);

	/**
	 * Returns the value of the '<em><b>Functional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional</em>' attribute.
	 * @see #setFunctional(boolean)
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBRelationKind_Functional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isFunctional();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind#isFunctional <em>Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional</em>' attribute.
	 * @see #isFunctional()
	 * @generated
	 */
	void setFunctional(boolean value);

} // EventBRelationKind
