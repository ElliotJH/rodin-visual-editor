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
import org.eventb.emf.formulas.IdentifierExpression;
import org.eventb.emf.formulas.LambdaExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lambda Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eventb.emf.formulas.impl.LambdaExpressionImpl#getIdent_pattern <em>Ident pattern</em>}</li>
 *   <li>{@link org.eventb.emf.formulas.impl.LambdaExpressionImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.eventb.emf.formulas.impl.LambdaExpressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LambdaExpressionImpl extends BExpressionResolvedImpl implements LambdaExpression {
	/**
	 * The cached value of the '{@link #getIdent_pattern() <em>Ident pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdent_pattern()
	 * @generated
	 * @ordered
	 */
	protected IdentifierExpression ident_pattern;

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
	protected LambdaExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormulasPackage.Literals.LAMBDA_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierExpression getIdent_pattern() {
		return ident_pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdent_pattern(IdentifierExpression newIdent_pattern, NotificationChain msgs) {
		IdentifierExpression oldIdent_pattern = ident_pattern;
		ident_pattern = newIdent_pattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormulasPackage.LAMBDA_EXPRESSION__IDENT_PATTERN, oldIdent_pattern, newIdent_pattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdent_pattern(IdentifierExpression newIdent_pattern) {
		if (newIdent_pattern != ident_pattern) {
			NotificationChain msgs = null;
			if (ident_pattern != null)
				msgs = ((InternalEObject)ident_pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.LAMBDA_EXPRESSION__IDENT_PATTERN, null, msgs);
			if (newIdent_pattern != null)
				msgs = ((InternalEObject)newIdent_pattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.LAMBDA_EXPRESSION__IDENT_PATTERN, null, msgs);
			msgs = basicSetIdent_pattern(newIdent_pattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulasPackage.LAMBDA_EXPRESSION__IDENT_PATTERN, newIdent_pattern, newIdent_pattern));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormulasPackage.LAMBDA_EXPRESSION__PREDICATE, oldPredicate, newPredicate);
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
				msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.LAMBDA_EXPRESSION__PREDICATE, null, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.LAMBDA_EXPRESSION__PREDICATE, null, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulasPackage.LAMBDA_EXPRESSION__PREDICATE, newPredicate, newPredicate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormulasPackage.LAMBDA_EXPRESSION__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.LAMBDA_EXPRESSION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.LAMBDA_EXPRESSION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulasPackage.LAMBDA_EXPRESSION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormulasPackage.LAMBDA_EXPRESSION__IDENT_PATTERN:
				return basicSetIdent_pattern(null, msgs);
			case FormulasPackage.LAMBDA_EXPRESSION__PREDICATE:
				return basicSetPredicate(null, msgs);
			case FormulasPackage.LAMBDA_EXPRESSION__EXPRESSION:
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
			case FormulasPackage.LAMBDA_EXPRESSION__IDENT_PATTERN:
				return getIdent_pattern();
			case FormulasPackage.LAMBDA_EXPRESSION__PREDICATE:
				return getPredicate();
			case FormulasPackage.LAMBDA_EXPRESSION__EXPRESSION:
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
			case FormulasPackage.LAMBDA_EXPRESSION__IDENT_PATTERN:
				setIdent_pattern((IdentifierExpression)newValue);
				return;
			case FormulasPackage.LAMBDA_EXPRESSION__PREDICATE:
				setPredicate((BPredicateResolved)newValue);
				return;
			case FormulasPackage.LAMBDA_EXPRESSION__EXPRESSION:
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
			case FormulasPackage.LAMBDA_EXPRESSION__IDENT_PATTERN:
				setIdent_pattern((IdentifierExpression)null);
				return;
			case FormulasPackage.LAMBDA_EXPRESSION__PREDICATE:
				setPredicate((BPredicateResolved)null);
				return;
			case FormulasPackage.LAMBDA_EXPRESSION__EXPRESSION:
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
			case FormulasPackage.LAMBDA_EXPRESSION__IDENT_PATTERN:
				return ident_pattern != null;
			case FormulasPackage.LAMBDA_EXPRESSION__PREDICATE:
				return predicate != null;
			case FormulasPackage.LAMBDA_EXPRESSION__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //LambdaExpressionImpl
