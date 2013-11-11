/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eventb.emf.formulas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eventb.emf.formulas.UnaryOperator#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eventb.emf.formulas.FormulasPackage#getUnaryOperator()
 * @model abstract="true"
 * @generated
 */
public interface UnaryOperator extends BFormula {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(BFormula)
	 * @see org.eventb.emf.formulas.FormulasPackage#getUnaryOperator_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BFormula getChild();

	/**
	 * Sets the value of the '{@link org.eventb.emf.formulas.UnaryOperator#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(BFormula value);

} // UnaryOperator
