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

import org.eventb.emf.formulas.BPredicateResolved;
import org.eventb.emf.formulas.BoundIdentifierExpression;
import org.eventb.emf.formulas.ForallPredicate;
import org.eventb.emf.formulas.FormulasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forall Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eventb.emf.formulas.impl.ForallPredicateImpl#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.eventb.emf.formulas.impl.ForallPredicateImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForallPredicateImpl extends BPredicateResolvedImpl implements ForallPredicate {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundIdentifierExpression> identifiers;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForallPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormulasPackage.Literals.FORALL_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundIdentifierExpression> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<BoundIdentifierExpression>(BoundIdentifierExpression.class, this, FormulasPackage.FORALL_PREDICATE__IDENTIFIERS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormulasPackage.FORALL_PREDICATE__PREDICATE, oldPredicate, newPredicate);
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
				msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.FORALL_PREDICATE__PREDICATE, null, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormulasPackage.FORALL_PREDICATE__PREDICATE, null, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulasPackage.FORALL_PREDICATE__PREDICATE, newPredicate, newPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormulasPackage.FORALL_PREDICATE__IDENTIFIERS:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case FormulasPackage.FORALL_PREDICATE__PREDICATE:
				return basicSetPredicate(null, msgs);
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
			case FormulasPackage.FORALL_PREDICATE__IDENTIFIERS:
				return getIdentifiers();
			case FormulasPackage.FORALL_PREDICATE__PREDICATE:
				return getPredicate();
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
			case FormulasPackage.FORALL_PREDICATE__IDENTIFIERS:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends BoundIdentifierExpression>)newValue);
				return;
			case FormulasPackage.FORALL_PREDICATE__PREDICATE:
				setPredicate((BPredicateResolved)newValue);
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
			case FormulasPackage.FORALL_PREDICATE__IDENTIFIERS:
				getIdentifiers().clear();
				return;
			case FormulasPackage.FORALL_PREDICATE__PREDICATE:
				setPredicate((BPredicateResolved)null);
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
			case FormulasPackage.FORALL_PREDICATE__IDENTIFIERS:
				return identifiers != null && !identifiers.isEmpty();
			case FormulasPackage.FORALL_PREDICATE__PREDICATE:
				return predicate != null;
		}
		return super.eIsSet(featureID);
	}

} //ForallPredicateImpl
