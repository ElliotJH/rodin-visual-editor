/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eventb.emf.formulas.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eventb.emf.formulas.BExpressionResolved;
import org.eventb.emf.formulas.BPredicateResolved;
import org.eventb.emf.formulas.FormulasPackage;
import org.eventb.emf.formulas.IdentifierExpression;
import org.eventb.emf.formulas.QuantifiedUnionExpression1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantified Union Expression1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eventb.emf.formulas.impl.QuantifiedUnionExpression1Impl#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.eventb.emf.formulas.impl.QuantifiedUnionExpression1Impl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.eventb.emf.formulas.impl.QuantifiedUnionExpression1Impl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantifiedUnionExpression1Impl extends BExpressionResolvedImpl implements QuantifiedUnionExpression1 {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierExpression> identifiers;

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
	protected QuantifiedUnionExpression1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormulasPackage.Literals.QUANTIFIED_UNION_EXPRESSION1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentifierExpression> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<IdentifierExpression>(IdentifierExpression.class, this, FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__IDENTIFIERS);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__PREDICATE, oldPredicate, newPredicate);
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
				msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__PREDICATE, null, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__PREDICATE, null, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__PREDICATE, newPredicate, newPredicate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__IDENTIFIERS:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__PREDICATE:
				return basicSetPredicate(null, msgs);
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__EXPRESSION:
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
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__IDENTIFIERS:
				return getIdentifiers();
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__PREDICATE:
				return getPredicate();
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__IDENTIFIERS:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends IdentifierExpression>)newValue);
				return;
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__PREDICATE:
				setPredicate((BPredicateResolved)newValue);
				return;
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__EXPRESSION:
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
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__IDENTIFIERS:
				getIdentifiers().clear();
				return;
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__PREDICATE:
				setPredicate((BPredicateResolved)null);
				return;
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__EXPRESSION:
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
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__IDENTIFIERS:
				return identifiers != null && !identifiers.isEmpty();
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__PREDICATE:
				return predicate != null;
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //QuantifiedUnionExpression1Impl
