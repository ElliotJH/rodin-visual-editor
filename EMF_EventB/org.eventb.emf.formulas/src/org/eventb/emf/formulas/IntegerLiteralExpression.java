/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eventb.emf.formulas;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eventb.emf.formulas.IntegerLiteralExpression#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eventb.emf.formulas.FormulasPackage#getIntegerLiteralExpression()
 * @model
 * @generated
 */
public interface IntegerLiteralExpression extends BExpressionResolved {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BigInteger)
	 * @see org.eventb.emf.formulas.FormulasPackage#getIntegerLiteralExpression_Number()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getNumber();

	/**
	 * Sets the value of the '{@link org.eventb.emf.formulas.IntegerLiteralExpression#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BigInteger value);

} // IntegerLiteralExpression
