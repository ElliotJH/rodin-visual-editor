/**
 * Copyright (c) 2006, 2009 
 * University of Southampton, Heinrich-Heine University Dusseldorf and others.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package org.eventb.emf.core.machine.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Convergence;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachineFactory;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Parameter;
import org.eventb.emf.core.machine.Witness;
import org.rodinp.core.RodinCore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eventb.emf.core.machine.impl.EventImpl#getConvergence <em>Convergence</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.EventImpl#isExtended <em>Extended</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.EventImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.EventImpl#getRefinesNames <em>Refines Names</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.EventImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.EventImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.EventImpl#getWitnesses <em>Witnesses</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.EventImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends EventBNamedCommentedElementImpl implements Event {
	/**
	 * The default value of the '{@link #getConvergence() <em>Convergence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvergence()
	 * @generated
	 * @ordered
	 */
	protected static final Convergence CONVERGENCE_EDEFAULT = Convergence.ORDINARY;

	/**
	 * The cached value of the '{@link #getConvergence() <em>Convergence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvergence()
	 * @generated
	 * @ordered
	 */
	protected Convergence convergence = CONVERGENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtended()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTENDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtended()
	 * @generated
	 * @ordered
	 */
	protected boolean extended = EXTENDED_EDEFAULT;

	/**
	 * This is true if the Extended attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extendedESet;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> refines;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<Guard> guards;

	/**
	 * The cached value of the '{@link #getWitnesses() <em>Witnesses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWitnesses()
	 * @generated
	 * @ordered
	 */
	protected EList<Witness> witnesses;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MachinePackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convergence getConvergence() {
		return convergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvergence(Convergence newConvergence) {
		Convergence oldConvergence = convergence;
		convergence = newConvergence == null ? CONVERGENCE_EDEFAULT : newConvergence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MachinePackage.EVENT__CONVERGENCE, oldConvergence, convergence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtended() {
		return extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtended(boolean newExtended) {
		boolean oldExtended = extended;
		extended = newExtended;
		boolean oldExtendedESet = extendedESet;
		extendedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MachinePackage.EVENT__EXTENDED, oldExtended, extended, !oldExtendedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtended() {
		boolean oldExtended = extended;
		boolean oldExtendedESet = extendedESet;
		extended = EXTENDED_EDEFAULT;
		extendedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MachinePackage.EVENT__EXTENDED, oldExtended, EXTENDED_EDEFAULT, oldExtendedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtended() {
		return extendedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getRefines() {
		if (refines == null) {
			refines = new EObjectResolvingEList<Event>(Event.class, this, MachinePackage.EVENT__REFINES);
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns an EList of the names of the refines events.
	 * Changes made to the returned list will be reflected as changes to the event's refines reference list
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getRefinesNames() {
		List<String> refinesNamesData = new ArrayList<String>();
		for (int i = 0 ; i < getRefines().size(); i++){
			refinesNamesData.add(getRefinesName(i));
		}
		EList<String> refinesNamesList = new EDataTypeEList<String>(String.class, this, MachinePackage.EVENT__REFINES_NAMES);
		((BasicEList<String>)refinesNamesList).setData(refinesNamesData.size(), refinesNamesData.toArray());
		return 	refinesNamesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns the name of the refined event at the given index, or null if index is out of bounds.
	 * If the refines reference is a proxy, the referenced event name is returned without resolving the reference
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param index	- position in refines list to get the reference
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected String getRefinesName(int index) {
		try{
			//get the current BEvent at the given index (using basicGet to avoid resolving)
			Event event = ((BasicEList<Event>)getRefines()).basicGet(index);
			//return the name of the referenced element (either from the unresolved URI fragment or from the resolved element's name)
			return event.getName();
		}catch (Exception e){
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the event at the given index of the refines list to a proxy referencing the given event name.
	 * (or add if index out of bounds)
	 * Any previous, reference at that index is removed (if already resolved) or overwritten (if not resolved).
	 * This method does not check to see whether the new referenced event exists,
	 * nor whether the reference is unique within the collection.
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param index	- position in EList to put the reference
	 * @param newName - name of the element referenced
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected void setRefinesName(int index, String newName) {
		try {
			//get the current BEvent at the given index (using basicGet to avoid resolving)
			Event proxy = ((BasicEList<Event>)getRefines()).basicGet(index);
			//if currently has a proxy at that index, re-use it for the new reference otherwise create a new one.
			if (!proxy.eIsProxy()) proxy = MachineFactory.eINSTANCE.createEvent();
			//set the proxy uri to a dummy with fragment set to newName
			((InternalEObject)proxy).eSetProxyURI(CorePackage.dummyURI.appendFragment(Event.class.getName()+"."+newName));
			//set the proxy at the given index (using setUnique to avoid checking uniqueness because it involves resolving and loading)
			((BasicEList<Event>)getRefines()).setUnique(index, proxy);
		}catch (IndexOutOfBoundsException e){
			addRefinesName(newName);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Adds a new proxy referencing the given event name to the end of the refines list.
	 * This method does not check to see whether the new referenced event exists,
	 * nor whether the reference is unique within the collection.
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param newName - name of the element referenced
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected void addRefinesName(String newName) {
		addRefinesName(((BasicEList<Event>)getRefines()).size(), newName);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Adds a new proxy referencing the given event name at the given index in the refines list.
	 * This method does not check to see whether the new referenced event exists,
	 * nor whether the reference is unique within the collection.
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param newName - name of the element referenced
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected void addRefinesName(int index, String newName) {
		Event proxy = MachineFactory.eINSTANCE.createEvent();
		//add the new proxy (using addUnique to avoid checking uniqueness because it involves resolving and loading)
		((InternalEObject)proxy).eSetProxyURI(CorePackage.dummyURI.appendFragment(Event.class.getName()+"."+newName));
		((BasicEList<Event>)getRefines()).addUnique(index, proxy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, MachinePackage.EVENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guard> getGuards() {
		if (guards == null) {
			guards = new EObjectContainmentEList<Guard>(Guard.class, this, MachinePackage.EVENT__GUARDS);
		}
		return guards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Witness> getWitnesses() {
		if (witnesses == null) {
			witnesses = new EObjectContainmentEList<Witness>(Witness.class, this, MachinePackage.EVENT__WITNESSES);
		}
		return witnesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, MachinePackage.EVENT__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MachinePackage.EVENT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case MachinePackage.EVENT__GUARDS:
				return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
			case MachinePackage.EVENT__WITNESSES:
				return ((InternalEList<?>)getWitnesses()).basicRemove(otherEnd, msgs);
			case MachinePackage.EVENT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case MachinePackage.EVENT__CONVERGENCE:
				return getConvergence();
			case MachinePackage.EVENT__EXTENDED:
				return isExtended();
			case MachinePackage.EVENT__REFINES:
				return getRefines();
			case MachinePackage.EVENT__REFINES_NAMES:
				return getRefinesNames();
			case MachinePackage.EVENT__PARAMETERS:
				return getParameters();
			case MachinePackage.EVENT__GUARDS:
				return getGuards();
			case MachinePackage.EVENT__WITNESSES:
				return getWitnesses();
			case MachinePackage.EVENT__ACTIONS:
				return getActions();
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
			case MachinePackage.EVENT__CONVERGENCE:
				setConvergence((Convergence)newValue);
				return;
			case MachinePackage.EVENT__EXTENDED:
				setExtended((Boolean)newValue);
				return;
			case MachinePackage.EVENT__REFINES:
				getRefines().clear();
				getRefines().addAll((Collection<? extends Event>)newValue);
				return;
			case MachinePackage.EVENT__REFINES_NAMES:
				getRefinesNames().clear();
				getRefinesNames().addAll((Collection<? extends String>)newValue);
				return;
			case MachinePackage.EVENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case MachinePackage.EVENT__GUARDS:
				getGuards().clear();
				getGuards().addAll((Collection<? extends Guard>)newValue);
				return;
			case MachinePackage.EVENT__WITNESSES:
				getWitnesses().clear();
				getWitnesses().addAll((Collection<? extends Witness>)newValue);
				return;
			case MachinePackage.EVENT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
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
			case MachinePackage.EVENT__CONVERGENCE:
				setConvergence(CONVERGENCE_EDEFAULT);
				return;
			case MachinePackage.EVENT__EXTENDED:
				unsetExtended();
				return;
			case MachinePackage.EVENT__REFINES:
				getRefines().clear();
				return;
			case MachinePackage.EVENT__REFINES_NAMES:
				getRefinesNames().clear();
				return;
			case MachinePackage.EVENT__PARAMETERS:
				getParameters().clear();
				return;
			case MachinePackage.EVENT__GUARDS:
				getGuards().clear();
				return;
			case MachinePackage.EVENT__WITNESSES:
				getWitnesses().clear();
				return;
			case MachinePackage.EVENT__ACTIONS:
				getActions().clear();
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
			case MachinePackage.EVENT__CONVERGENCE:
				return convergence != CONVERGENCE_EDEFAULT;
			case MachinePackage.EVENT__EXTENDED:
				return isSetExtended();
			case MachinePackage.EVENT__REFINES:
				return refines != null && !refines.isEmpty();
			case MachinePackage.EVENT__REFINES_NAMES:
				return !getRefinesNames().isEmpty();
			case MachinePackage.EVENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case MachinePackage.EVENT__GUARDS:
				return guards != null && !guards.isEmpty();
			case MachinePackage.EVENT__WITNESSES:
				return witnesses != null && !witnesses.isEmpty();
			case MachinePackage.EVENT__ACTIONS:
				return actions != null && !actions.isEmpty();
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
		result.append(" (convergence: "); //$NON-NLS-1$
		result.append(convergence);
		result.append(", extended: "); //$NON-NLS-1$
		if (extendedESet) result.append(extended); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

	/**
	 * Resolves a proxy associated with this element.
	 * URI's are constructed lazily. A dummy URI with just a fragment holding the name of the referenced item, is used
	 * until this point. When a proxy is resolved, the URI is constructed based on this elements resource URI.
	 * Therefore, proxies will not resolve until this element has been associated with a resource.
	 *
	 * Following construction of the URI, the proxy resolution is deferred to super
	 *
	 * @custom
	 */

	@Override
	public EObject eResolveProxy(InternalEObject proxy){
		if (proxy != null && proxy.eIsProxy()){
			if (eResource()==null) return proxy;
			try {
				 URI uri=null;
				 if (proxy instanceof Event && getRefines().contains(proxy)){
					 EList<Machine> refineList = ((MachineImpl)eContainer).getRefines();
					 if (refineList.size() == 0) {
						throw new IllegalArgumentException(((MachineImpl)eContainer).getName() + " does not refine another machine.");
					 }
					Machine refinedMachine = refineList.get(0);
					 uri = refinedMachine.getURI()
					 	.appendFragment(proxy.eProxyURI().fragment());
				 }
				 if (uri!=null) proxy.eSetProxyURI(uri);
			} catch (Exception e){
				RodinCore.getPlugin().getLog().log(
						new Status(Status.ERROR, "org.eventb.emf.core",
								"Cannot resolve: " + proxy, e));
				return proxy;
			}
		}
		return super.eResolveProxy(proxy);
	}


	@Override
	public boolean eNotificationRequired(){return true;}

	@SuppressWarnings("unchecked")
	@Override
	public void eNotify(Notification notification){
		if (notification.getFeatureID(this.getClass()) == MachinePackage.EVENT__REFINES_NAMES){
			switch (notification.getEventType()){
			case Notification.SET:
				setRefinesName(notification.getPosition(), notification.getNewStringValue());
				break;
			case Notification.UNSET:
				getRefines().clear();	//not expected to be used
				break;
			case Notification.ADD: {
				addRefinesName(notification.getPosition(), notification.getNewStringValue());
				break;
			}
			case Notification.REMOVE: {
				getRefines().remove(notification.getPosition());
				break;
			}
			case Notification.ADD_MANY: {
				for (String newName : (List<String>)notification.getNewValue()){
					addRefinesName(newName);
				}
				break;
			}
			case Notification.REMOVE_MANY: {
				if (notification.getNewValue()==null && notification.getPosition()==-1){
					getRefines().clear();
				}
				break;
			}
			case Notification.MOVE:
				//N.B decided it is better NOT to prevent exceptions, otherwise the names list will be out of sync with the references
				//if (!(notification.getOldValue() instanceof Integer)) break;
				int oldpos = ((Integer)notification.getOldValue()).intValue();
				int newpos = notification.getPosition();
				//if (oldpos<0 || newpos<0 || oldpos >= getSees().size() || newpos >= getSees().size() ) break;
				getRefines().move(newpos, oldpos);
				break;
			default: break;
			}
		}
		super.eNotify(notification);
	}

} //EventImpl
