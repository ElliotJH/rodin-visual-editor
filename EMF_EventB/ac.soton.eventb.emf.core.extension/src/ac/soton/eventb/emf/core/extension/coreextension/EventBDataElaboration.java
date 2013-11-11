/**
 * Copyright (c) 2012/13 - University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package ac.soton.eventb.emf.core.extension.coreextension;

import org.eclipse.emf.ecore.EObject;

import org.eventb.emf.core.EventBNamed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event BData Elaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration#getElaborates <em>Elaborates</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration#getDataKind <em>Data Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBDataElaboration()
 * @model abstract="true"
 * @generated
 */
public interface EventBDataElaboration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012/13 - University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>Elaborates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elaborates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elaborates</em>' reference.
	 * @see #setElaborates(EventBNamed)
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBDataElaboration_Elaborates()
	 * @model
	 * @generated
	 */
	EventBNamed getElaborates();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration#getElaborates <em>Elaborates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elaborates</em>' reference.
	 * @see #getElaborates()
	 * @generated
	 */
	void setElaborates(EventBNamed value);

	/**
	 * Returns the value of the '<em><b>Data Kind</b></em>' attribute.
	 * The default value is <code>"Variable"</code>.
	 * The literals are from the enumeration {@link ac.soton.eventb.emf.core.extension.coreextension.DataKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Kind</em>' attribute.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.DataKind
	 * @see #setDataKind(DataKind)
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBDataElaboration_DataKind()
	 * @model default="Variable"
	 * @generated
	 */
	DataKind getDataKind();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration#getDataKind <em>Data Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Kind</em>' attribute.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.DataKind
	 * @see #getDataKind()
	 * @generated
	 */
	void setDataKind(DataKind value);

} // EventBDataElaboration
