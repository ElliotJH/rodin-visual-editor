/**
 * Copyright (c) 2012/13 - University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package ac.soton.eventb.emf.core.extension.coreextension.impl;

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup;

import ac.soton.eventb.emf.core.extension.coreextension.TypedParameter;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Witness;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event BEvent Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBEventGroupImpl#getElaborates <em>Elaborates</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBEventGroupImpl#isExtended <em>Extended</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBEventGroupImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBEventGroupImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBEventGroupImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBEventGroupImpl#getWitnesses <em>Witnesses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EventBEventGroupImpl extends EObjectImpl implements EventBEventGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012/13 - University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The cached value of the '{@link #getElaborates() <em>Elaborates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElaborates()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> elaborates;

	/**
	 * The default value of the '{@link #isExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #isExtended()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTENDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #isExtended()
	 * @generated
	 * @ordered
	 */
	protected boolean extended = EXTENDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedParameter> parameters;

	/**
	 * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<Guard> guards;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getWitnesses() <em>Witnesses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getWitnesses()
	 * @generated
	 * @ordered
	 */
	protected EList<Witness> witnesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBEventGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreextensionPackage.Literals.EVENT_BEVENT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getElaborates() {
		if (elaborates == null) {
			elaborates = new EObjectResolvingEList<Event>(Event.class, this, CoreextensionPackage.EVENT_BEVENT_GROUP__ELABORATES);
		}
		return elaborates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtended() {
		return extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtended(boolean newExtended) {
		boolean oldExtended = extended;
		extended = newExtended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreextensionPackage.EVENT_BEVENT_GROUP__EXTENDED, oldExtended, extended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<TypedParameter>(TypedParameter.class, this, CoreextensionPackage.EVENT_BEVENT_GROUP__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guard> getGuards() {
		if (guards == null) {
			guards = new EObjectContainmentEList<Guard>(Guard.class, this, CoreextensionPackage.EVENT_BEVENT_GROUP__GUARDS);
		}
		return guards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, CoreextensionPackage.EVENT_BEVENT_GROUP__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Witness> getWitnesses() {
		if (witnesses == null) {
			witnesses = new EObjectContainmentEList<Witness>(Witness.class, this, CoreextensionPackage.EVENT_BEVENT_GROUP__WITNESSES);
		}
		return witnesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreextensionPackage.EVENT_BEVENT_GROUP__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case CoreextensionPackage.EVENT_BEVENT_GROUP__GUARDS:
				return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
			case CoreextensionPackage.EVENT_BEVENT_GROUP__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case CoreextensionPackage.EVENT_BEVENT_GROUP__WITNESSES:
				return ((InternalEList<?>)getWitnesses()).basicRemove(otherEnd, msgs);
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
			case CoreextensionPackage.EVENT_BEVENT_GROUP__ELABORATES:
				return getElaborates();
			case CoreextensionPackage.EVENT_BEVENT_GROUP__EXTENDED:
				return isExtended();
			case CoreextensionPackage.EVENT_BEVENT_GROUP__PARAMETERS:
				return getParameters();
			case CoreextensionPackage.EVENT_BEVENT_GROUP__GUARDS:
				return getGuards();
			case CoreextensionPackage.EVENT_BEVENT_GROUP__ACTIONS:
				return getActions();
			case CoreextensionPackage.EVENT_BEVENT_GROUP__WITNESSES:
				return getWitnesses();
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
			case CoreextensionPackage.EVENT_BEVENT_GROUP__ELABORATES:
				getElaborates().clear();
				getElaborates().addAll((Collection<? extends Event>)newValue);
				return;
			case CoreextensionPackage.EVENT_BEVENT_GROUP__EXTENDED:
				setExtended((Boolean)newValue);
				return;
			case CoreextensionPackage.EVENT_BEVENT_GROUP__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends TypedParameter>)newValue);
				return;
			case CoreextensionPackage.EVENT_BEVENT_GROUP__GUARDS:
				getGuards().clear();
				getGuards().addAll((Collection<? extends Guard>)newValue);
				return;
			case CoreextensionPackage.EVENT_BEVENT_GROUP__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case CoreextensionPackage.EVENT_BEVENT_GROUP__WITNESSES:
				getWitnesses().clear();
				getWitnesses().addAll((Collection<? extends Witness>)newValue);
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
			case CoreextensionPackage.EVENT_BEVENT_GROUP__ELABORATES:
				getElaborates().clear();
				return;
			case CoreextensionPackage.EVENT_BEVENT_GROUP__EXTENDED:
				setExtended(EXTENDED_EDEFAULT);
				return;
			case CoreextensionPackage.EVENT_BEVENT_GROUP__PARAMETERS:
				getParameters().clear();
				return;
			case CoreextensionPackage.EVENT_BEVENT_GROUP__GUARDS:
				getGuards().clear();
				return;
			case CoreextensionPackage.EVENT_BEVENT_GROUP__ACTIONS:
				getActions().clear();
				return;
			case CoreextensionPackage.EVENT_BEVENT_GROUP__WITNESSES:
				getWitnesses().clear();
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
			case CoreextensionPackage.EVENT_BEVENT_GROUP__ELABORATES:
				return elaborates != null && !elaborates.isEmpty();
			case CoreextensionPackage.EVENT_BEVENT_GROUP__EXTENDED:
				return extended != EXTENDED_EDEFAULT;
			case CoreextensionPackage.EVENT_BEVENT_GROUP__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case CoreextensionPackage.EVENT_BEVENT_GROUP__GUARDS:
				return guards != null && !guards.isEmpty();
			case CoreextensionPackage.EVENT_BEVENT_GROUP__ACTIONS:
				return actions != null && !actions.isEmpty();
			case CoreextensionPackage.EVENT_BEVENT_GROUP__WITNESSES:
				return witnesses != null && !witnesses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extended: ");
		result.append(extended);
		result.append(')');
		return result.toString();
	}

} //EventBEventGroupImpl
