/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eventb.emf.formulas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eventb.emf.formulas.BinaryOperator#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eventb.emf.formulas.BinaryOperator#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eventb.emf.formulas.FormulasPackage#getBinaryOperator()
 * @model abstract="true"
 * @generated
 */
public interface BinaryOperator extends BFormula {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(BFormula)
	 * @see org.eventb.emf.formulas.FormulasPackage#getBinaryOperator_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BFormula getLeft();

	/**
	 * Sets the value of the '{@link org.eventb.emf.formulas.BinaryOperator#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(BFormula value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(BFormula)
	 * @see org.eventb.emf.formulas.FormulasPackage#getBinaryOperator_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BFormula getRight();

	/**
	 * Sets the value of the '{@link org.eventb.emf.formulas.BinaryOperator#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(BFormula value);

} // BinaryOperator
