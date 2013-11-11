/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eventb.emf.formulas.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eventb.emf.formulas.BExpressionResolved;
import org.eventb.emf.formulas.BPredicateResolved;
import org.eventb.emf.formulas.FormulasPackage;
import org.eventb.emf.formulas.SetComprehensionExpression2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Comprehension Expression2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eventb.emf.formulas.impl.SetComprehensionExpression2Impl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.eventb.emf.formulas.impl.SetComprehensionExpression2Impl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetComprehensionExpression2Impl extends BExpressionResolvedImpl implements SetComprehensionExpression2 {
	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected BPredicateResolved predicate;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected BExpressionResolved expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetComprehensionExpression2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormulasPackage.Literals.SET_COMPREHENSION_EXPRESSION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPredicateResolved getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicate(BPredicateResolved newPredicate, NotificationChain msgs) {
		BPredicateResolved oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormulasPackage.SET_COMPREHENSION_EXPRESSION2__PREDICATE, oldPredicate, newPredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(BPredicateResolved newPredicate) {
		if (newPredicate != predicate) {
			NotificationChain msgs = null;
			if (predicate != null)
				msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.SET_COMPREHENSION_EXPRESSION2__PREDICATE, null, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.SET_COMPREHENSION_EXPRESSION2__PREDICATE, null, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulasPackage.SET_COMPREHENSION_EXPRESSION2__PREDICATE, newPredicate, newPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpressionResolved getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(BExpressionResolved newExpression, NotificationChain msgs) {
		BExpressionResolved oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormulasPackage.SET_COMPREHENSION_EXPRESSION2__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(BExpressionResolved newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.SET_COMPREHENSION_EXPRESSION2__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.SET_COMPREHENSION_EXPRESSION2__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulasPackage.SET_COMPREHENSION_EXPRESSION2__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION2__PREDICATE:
				return basicSetPredicate(null, msgs);
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION2__EXPRESSION:
				return basicSetExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION2__PREDICATE:
				return getPredicate();
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION2__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION2__PREDICATE:
				setPredicate((BPredicateResolved)newValue);
				return;
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION2__EXPRESSION:
				setExpression((BExpressionResolved)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION2__PREDICATE:
				setPredicate((BPredicateResolved)null);
				return;
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION2__EXPRESSION:
				setExpression((BExpressionResolved)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION2__PREDICATE:
				return predicate != null;
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION2__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //SetComprehensionExpression2Impl
