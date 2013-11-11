/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eventb.emf.formulas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Becomes Member Of Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eventb.emf.formulas.BecomesMemberOfAssignment#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eventb.emf.formulas.FormulasPackage#getBecomesMemberOfAssignment()
 * @model
 * @generated
 */
public interface BecomesMemberOfAssignment extends BAssignmentResolved {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(BExpressionResolved)
	 * @see org.eventb.emf.formulas.FormulasPackage#getBecomesMemberOfAssignment_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BExpressionResolved getExpression();

	/**
	 * Sets the value of the '{@link org.eventb.emf.formulas.BecomesMemberOfAssignment#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(BExpressionResolved value);

} // BecomesMemberOfAssignment
