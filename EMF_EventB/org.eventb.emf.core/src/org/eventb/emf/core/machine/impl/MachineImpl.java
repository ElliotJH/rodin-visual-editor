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
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextFactory;
import org.eventb.emf.core.externalisation.External;
import org.eventb.emf.core.impl.EventBNamedCommentedComponentElementImpl;
import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachineFactory;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.core.machine.Variant;
import org.rodinp.core.RodinCore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eventb.emf.core.machine.impl.MachineImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.MachineImpl#getRefinesNames <em>Refines Names</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.MachineImpl#getSees <em>Sees</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.MachineImpl#getSeesNames <em>Sees Names</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.MachineImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.MachineImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.MachineImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.eventb.emf.core.machine.impl.MachineImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineImpl extends EventBNamedCommentedComponentElementImpl implements Machine {
	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected EList<Machine> refines;

	/**
	 * The cached value of the '{@link #getSees() <em>Sees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSees()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> sees;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Invariant> invariants;

	/**
	 * The cached value of the '{@link #getVariant() <em>Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected Variant variant;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MachinePackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the Machines that are refined by this one.
	 * WARNING: THIS RETURNS A RESOLVING LIST - ACCESSING ITS CONTENTS RESOLVES PROXIES IF NECESSARY AND MAY RESULT IN LOADING THE REFINED MACHINE
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Machine> getRefines() {
		if (refines == null) {
			refines = new EObjectResolvingEList<Machine>(Machine.class, this, MachinePackage.MACHINE__REFINES);
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns an EList of the names of the refined machines.
	 * Changes made to the returned list will be reflected as changes to the machine's refines reference list
	 * This does not resolve any proxies that are not already resolved
	 *
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getRefinesNames() {
		List<String> refinesNamesData = new ArrayList<String>();
		for (int i = 0 ; i < getRefines().size(); i++){
			refinesNamesData.add(getRefinesName(i));
		}
		EList<String> refinesNamesList = new EDataTypeEList<String>(String.class, this, MachinePackage.MACHINE__REFINES_NAMES);
		((BasicEList<String>)refinesNamesList).setData(refinesNamesData.size(), refinesNamesData.toArray());
		return 	refinesNamesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns the name of the refined machine at the given index, or null if index is out of bounds.
	 * If the refines reference is a proxy, the refined machine name is returned without resolving the reference
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param index	- position in refines list to get the reference
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected String getRefinesName(int index) {
		try{
			//get the current Machine at the given index (using basicGet to avoid resolving)
			Machine machine = ((BasicEList<Machine>)getRefines()).basicGet(index);
			//return the name of the referenced element (either from the unresolved URI fragment or from the resolved element's name)
			return machine.getName();
		}catch (Exception e){
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the machine at the given index of the refines list to a proxy referencing the given machine name.
	 * (or add if index out of bounds)
	 * Any previous, reference at that index is removed (if already resolved) or overwritten (if not resolved).
	 * This method does not check to see whether the new referenced machine exists,
	 * nor whether the reference is unique within the collection.
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param index	- position in EList to put the reference
	 * @param newName - name of the element referenced
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected void setRefinesName(int index, String newName) {
		try{
			//get the current Machine at the given index (using basicGet to avoid resolving)
			Machine proxy = ((BasicEList<Machine>)getRefines()).basicGet(index);
			//if currently has a proxy at that index, re-use it for the new reference otherwise create a new one.
			if (!proxy.eIsProxy()) proxy = MachineFactory.eINSTANCE.createMachine();
			//set the proxy uri to a dummy with fragment set to newName
			((InternalEObject)proxy).eSetProxyURI(CorePackage.dummyURI.appendFragment(Machine.class.getName()+"."+newName));
			//set the proxy at the given index (using setUnique to avoid checking uniqueness because it involves resolving and loading)
			((BasicEList<Machine>)getRefines()).setUnique(index, proxy);
		}catch (IndexOutOfBoundsException e){
			addRefinesName(newName);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Adds a new proxy referencing the given machine name to the end of the refines list.
	 * This method does not check to see whether the new referenced machine exists,
	 * nor whether the reference is unique within the collection.
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param newName - name of the element referenced
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected void addRefinesName(String newName) {
		addRefinesName(((BasicEList<Machine>)getRefines()).size(), newName);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Adds a new proxy referencing the given machine name at the given index in the refines list.
	 * This method does not check to see whether the new referenced machine exists,
	 * nor whether the reference is unique within the collection.
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param newName - name of the element referenced
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected void addRefinesName(int index, String newName) {
		Machine proxy = MachineFactory.eINSTANCE.createMachine();
		//add the new proxy (using setUnique to avoid checking uniqueness because it involves resolving and loading)
		((InternalEObject)proxy).eSetProxyURI(CorePackage.dummyURI.appendFragment(Machine.class.getName()+"."+newName));
		((BasicEList<Machine>)getRefines()).addUnique(index,proxy);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getSees() {
		if (sees == null) {
			sees = new EObjectResolvingEList<Context>(Context.class, this, MachinePackage.MACHINE__SEES);
		}
		return sees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns an EList of the names of the sees contexts.
	 * Changes made to the returned list will be reflected as changes to the machine's sees reference list
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getSeesNames() {
		List<String> seesNamesData = new ArrayList<String>();
		for (int i = 0 ; i < getSees().size(); i++){
			seesNamesData.add(getSeesName(i));
		}
		EList<String> seesNamesList = new EDataTypeEList<String>(String.class, this, MachinePackage.MACHINE__SEES_NAMES);
		((BasicEList<String>)seesNamesList).setData(seesNamesData.size(), seesNamesData.toArray());
		return 	seesNamesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns the name of the seen context at the given index, or null if index is out of bounds.
	 * If the sees reference is a proxy, the seen context name is returned without resolving the reference
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param index	- position in sees list to get the reference
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected String getSeesName(int index) {
		try{
			//get the current Context at the given index (using basicGet to avoid resolving)
			Context context = ((BasicEList<Context>)getSees()).basicGet(index);
			//return the name of the referenced element (either from the unresolved URI fragment or from the resolved element's name)
			return context.getName();
		}catch (Exception e){
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the context at the given index of the sees list to a proxy referencing the given context name.
	 * (or add if index out of bounds)
	 * Any previous, reference at that index is removed (if already resolved) or overwritten (if not resolved).
	 * This method does not check to see whether the new referenced context exists,
	 * nor whether the reference is unique within the collection.
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param index	- position in EList to put the reference
	 * @param newName - name of the element referenced
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected void setSeesName(int index, String newName) {
		try{
			//get the current Context at the given index (using basicGet to avoid resolving)
			Context proxy = ((BasicEList<Context>)getSees()).basicGet(index);
			//if currently has a proxy at that index, re-use it for the new reference otherwise create a new one.
			if (!proxy.eIsProxy()) proxy = ContextFactory.eINSTANCE.createContext();
			//set the proxy uri to a dummy with fragment set to newName
			((InternalEObject)proxy).eSetProxyURI(CorePackage.dummyURI.appendFragment(Context.class.getName()+"."+newName));
			//set the proxy at the given index (using setUnique to avoid checking uniqueness because it involves resolving and loading)
			((BasicEList<Context>)getSees()).setUnique(index, proxy);
		}catch (IndexOutOfBoundsException e){
			addSeesName(newName);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Adds a new proxy referencing the given context name to the end of the sees list.
	 * This method does not check to see whether the new referenced context exists,
	 * nor whether the reference is unique within the collection.
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param newName - name of the element referenced
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected void addSeesName(String newName) {
		addSeesName(((BasicEList<Context>)getSees()).size(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Adds a new proxy referencing the given context name at the given index in the sees list.
	 * This method does not check to see whether the new referenced context exists,
	 * nor whether the reference is unique within the collection.
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param newName - name of the element referenced
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected void addSeesName(int index, String newName) {
		Context proxy = ContextFactory.eINSTANCE.createContext();
		//add the new proxy (using setUnique to avoid checking uniqueness because it involves resolving and loading)
		((InternalEObject)proxy).eSetProxyURI(CorePackage.dummyURI.appendFragment(Context.class.getName()+"."+newName));
		((BasicEList<Context>)getSees()).addUnique(index, proxy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, MachinePackage.MACHINE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invariant> getInvariants() {
		if (invariants == null) {
			invariants = new EObjectContainmentEList<Invariant>(Invariant.class, this, MachinePackage.MACHINE__INVARIANTS);
		}
		return invariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getVariant() {
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariant(Variant newVariant, NotificationChain msgs) {
		Variant oldVariant = variant;
		variant = newVariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MachinePackage.MACHINE__VARIANT, oldVariant, newVariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(Variant newVariant) {
		if (newVariant != variant) {
			NotificationChain msgs = null;
			if (variant != null)
				msgs = ((InternalEObject)variant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MachinePackage.MACHINE__VARIANT, null, msgs);
			if (newVariant != null)
				msgs = ((InternalEObject)newVariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MachinePackage.MACHINE__VARIANT, null, msgs);
			msgs = basicSetVariant(newVariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MachinePackage.MACHINE__VARIANT, newVariant, newVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, MachinePackage.MACHINE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MachinePackage.MACHINE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case MachinePackage.MACHINE__INVARIANTS:
				return ((InternalEList<?>)getInvariants()).basicRemove(otherEnd, msgs);
			case MachinePackage.MACHINE__VARIANT:
				return basicSetVariant(null, msgs);
			case MachinePackage.MACHINE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case MachinePackage.MACHINE__REFINES:
				return getRefines();
			case MachinePackage.MACHINE__REFINES_NAMES:
				return getRefinesNames();
			case MachinePackage.MACHINE__SEES:
				return getSees();
			case MachinePackage.MACHINE__SEES_NAMES:
				return getSeesNames();
			case MachinePackage.MACHINE__VARIABLES:
				return getVariables();
			case MachinePackage.MACHINE__INVARIANTS:
				return getInvariants();
			case MachinePackage.MACHINE__VARIANT:
				return getVariant();
			case MachinePackage.MACHINE__EVENTS:
				return getEvents();
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
			case MachinePackage.MACHINE__REFINES:
				getRefines().clear();
				getRefines().addAll((Collection<? extends Machine>)newValue);
				return;
			case MachinePackage.MACHINE__REFINES_NAMES:
				getRefinesNames().clear();
				getRefinesNames().addAll((Collection<? extends String>)newValue);
				return;
			case MachinePackage.MACHINE__SEES:
				getSees().clear();
				getSees().addAll((Collection<? extends Context>)newValue);
				return;
			case MachinePackage.MACHINE__SEES_NAMES:
				getSeesNames().clear();
				getSeesNames().addAll((Collection<? extends String>)newValue);
				return;
			case MachinePackage.MACHINE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case MachinePackage.MACHINE__INVARIANTS:
				getInvariants().clear();
				getInvariants().addAll((Collection<? extends Invariant>)newValue);
				return;
			case MachinePackage.MACHINE__VARIANT:
				setVariant((Variant)newValue);
				return;
			case MachinePackage.MACHINE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
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
			case MachinePackage.MACHINE__REFINES:
				getRefines().clear();
				return;
			case MachinePackage.MACHINE__REFINES_NAMES:
				getRefinesNames().clear();
				return;
			case MachinePackage.MACHINE__SEES:
				getSees().clear();
				return;
			case MachinePackage.MACHINE__SEES_NAMES:
				getSeesNames().clear();
				return;
			case MachinePackage.MACHINE__VARIABLES:
				getVariables().clear();
				return;
			case MachinePackage.MACHINE__INVARIANTS:
				getInvariants().clear();
				return;
			case MachinePackage.MACHINE__VARIANT:
				setVariant((Variant)null);
				return;
			case MachinePackage.MACHINE__EVENTS:
				getEvents().clear();
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
			case MachinePackage.MACHINE__REFINES:
				return refines != null && !refines.isEmpty();
			case MachinePackage.MACHINE__REFINES_NAMES:
				return !getRefinesNames().isEmpty();
			case MachinePackage.MACHINE__SEES:
				return sees != null && !sees.isEmpty();
			case MachinePackage.MACHINE__SEES_NAMES:
				return !getSeesNames().isEmpty();
			case MachinePackage.MACHINE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case MachinePackage.MACHINE__INVARIANTS:
				return invariants != null && !invariants.isEmpty();
			case MachinePackage.MACHINE__VARIANT:
				return variant != null;
			case MachinePackage.MACHINE__EVENTS:
				return events != null && !events.isEmpty();
		}
		return super.eIsSet(featureID);
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
		  try{
			 String reference = proxy.eProxyURI().fragment();
			 
			 // if resolved already in the parent, do not resolve again
			 if (eContainer() != null)
				 for (EObject component : eContainer().eContents())
					 if (((EventBNamedCommentedElementImpl) component).getReference().equals(reference))
						 return component;
			 
			 // attempt to construct a suitable proxy URI
			 URI uri=null;
			 String projectName = getURI().trimSegments(getURI().segmentCount()-2).lastSegment();
			 String resourceName = reference.substring(reference.lastIndexOf(".")+1);

			 if (proxy instanceof Machine && getRefines().contains(proxy)){
				 uri = URI.createPlatformResourceURI(projectName, true)
				 	.appendSegment(resourceName)
				 	.appendFileExtension(External.getString("FileExtensions.machine"))
				 	.appendFragment(reference);
			 }else if (proxy instanceof Context && getSees().contains(proxy)){
				 uri = URI.createPlatformResourceURI(projectName, true)
				 	.appendSegment(resourceName)
				 	.appendFileExtension(External.getString("FileExtensions.context"))
				 	.appendFragment(reference);				 
			 }
			 if (uri!=null) proxy.eSetProxyURI(uri);
		  }catch (Exception e){
				RodinCore.getPlugin().getLog().log(new Status(Status.ERROR, "org.eventb.emf.core", "Cannot resolve: " + proxy, e));
			  return proxy;
		  }
	  }
	  return super.eResolveProxy(proxy);
	}

	/**
	 * Overrides to always require notification. This is to ensure that changes to derived features can be reflected in the 
	 * main features from which they are derived
	 */
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotificationRequired()
	 */
	@Override
	public boolean eNotificationRequired(){return true;}

	/**
	 * Intercepts notification to reflect any changes made to the 'refinesNames' and 'seesNames' lists into
	 * the 'refines' and 'sees' collections from which they are derived.
	 * Then defers to super.
	 */
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eNotify(Notification notification){
		if (notification.getFeatureID(this.getClass()) == MachinePackage.MACHINE__SEES_NAMES){
			switch (notification.getEventType()){
			case Notification.SET:
				setSeesName(notification.getPosition(), notification.getNewStringValue());
				break;
			case Notification.UNSET:
				getSees().clear();	//not expected to be used
				break;
			case Notification.ADD: {
				addSeesName(notification.getPosition(), notification.getNewStringValue());
				break;
			}
			case Notification.REMOVE: {
				getSees().remove(notification.getPosition());
				break;
			}
			case Notification.ADD_MANY: {
				for (String newName : (List<String>)notification.getNewValue()){
					addSeesName(newName);
				}
				break;
			}
			case Notification.REMOVE_MANY: {
				if (notification.getNewValue()==null && notification.getPosition()==-1){
					getSees().clear();
				}
				break;
			}
			case Notification.MOVE:
				//N.B decided it is better NOT to prevent exceptions, otherwise the names list will be out of sync with the references
				//if (!(notification.getOldValue() instanceof Integer)) break;
				int oldpos = ((Integer)notification.getOldValue()).intValue();
				int newpos = notification.getPosition();
				//if (oldpos<0 || newpos<0 || oldpos >= getSees().size() || newpos >= getSees().size() ) break;
				getSees().move(newpos, oldpos);
				break;
			default: break;
			}
		}else if (notification.getFeatureID(this.getClass()) == MachinePackage.MACHINE__REFINES_NAMES){
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

} //MachineImpl
