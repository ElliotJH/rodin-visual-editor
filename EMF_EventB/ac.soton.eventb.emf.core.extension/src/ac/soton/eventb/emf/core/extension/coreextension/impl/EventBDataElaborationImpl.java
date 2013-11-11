/**
 * Copyright (c) 2012/13 - University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package ac.soton.eventb.emf.core.extension.coreextension.impl;

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.coreextension.DataKind;
import ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eventb.emf.core.EventBNamed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event BData Elaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBDataElaborationImpl#getElaborates <em>Elaborates</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBDataElaborationImpl#getDataKind <em>Data Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EventBDataElaborationImpl extends EObjectImpl implements EventBDataElaboration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012/13 - University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The cached value of the '{@link #getElaborates() <em>Elaborates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElaborates()
	 * @generated
	 * @ordered
	 */
	protected EventBNamed elaborates;

	/**
	 * The default value of the '{@link #getDataKind() <em>Data Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataKind()
	 * @generated
	 * @ordered
	 */
	protected static final DataKind DATA_KIND_EDEFAULT = DataKind.VARIABLE;

	/**
	 * The cached value of the '{@link #getDataKind() <em>Data Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataKind()
	 * @generated
	 * @ordered
	 */
	protected DataKind dataKind = DATA_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBDataElaborationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreextensionPackage.Literals.EVENT_BDATA_ELABORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBNamed getElaborates() {
		if (elaborates != null && elaborates.eIsProxy()) {
			InternalEObject oldElaborates = (InternalEObject)elaborates;
			elaborates = (EventBNamed)eResolveProxy(oldElaborates);
			if (elaborates != oldElaborates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreextensionPackage.EVENT_BDATA_ELABORATION__ELABORATES, oldElaborates, elaborates));
			}
		}
		return elaborates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBNamed basicGetElaborates() {
		return elaborates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElaborates(EventBNamed newElaborates) {
		EventBNamed oldElaborates = elaborates;
		elaborates = newElaborates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreextensionPackage.EVENT_BDATA_ELABORATION__ELABORATES, oldElaborates, elaborates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataKind getDataKind() {
		return dataKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataKind(DataKind newDataKind) {
		DataKind oldDataKind = dataKind;
		dataKind = newDataKind == null ? DATA_KIND_EDEFAULT : newDataKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreextensionPackage.EVENT_BDATA_ELABORATION__DATA_KIND, oldDataKind, dataKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreextensionPackage.EVENT_BDATA_ELABORATION__ELABORATES:
				if (resolve) return getElaborates();
				return basicGetElaborates();
			case CoreextensionPackage.EVENT_BDATA_ELABORATION__DATA_KIND:
				return getDataKind();
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
			case CoreextensionPackage.EVENT_BDATA_ELABORATION__ELABORATES:
				setElaborates((EventBNamed)newValue);
				return;
			case CoreextensionPackage.EVENT_BDATA_ELABORATION__DATA_KIND:
				setDataKind((DataKind)newValue);
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
			case CoreextensionPackage.EVENT_BDATA_ELABORATION__ELABORATES:
				setElaborates((EventBNamed)null);
				return;
			case CoreextensionPackage.EVENT_BDATA_ELABORATION__DATA_KIND:
				setDataKind(DATA_KIND_EDEFAULT);
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
			case CoreextensionPackage.EVENT_BDATA_ELABORATION__ELABORATES:
				return elaborates != null;
			case CoreextensionPackage.EVENT_BDATA_ELABORATION__DATA_KIND:
				return dataKind != DATA_KIND_EDEFAULT;
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
		result.append(" (dataKind: ");
		result.append(dataKind);
		result.append(')');
		return result.toString();
	}

} //EventBDataElaborationImpl
