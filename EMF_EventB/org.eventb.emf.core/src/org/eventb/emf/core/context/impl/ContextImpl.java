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
package org.eventb.emf.core.context.impl;

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
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextFactory;
import org.eventb.emf.core.context.ContextPackage;
import org.eventb.emf.core.externalisation.External;
import org.eventb.emf.core.impl.EventBNamedCommentedComponentElementImpl;
import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;
import org.rodinp.core.RodinCore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eventb.emf.core.context.impl.ContextImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eventb.emf.core.context.impl.ContextImpl#getExtendsNames <em>Extends Names</em>}</li>
 *   <li>{@link org.eventb.emf.core.context.impl.ContextImpl#getSets <em>Sets</em>}</li>
 *   <li>{@link org.eventb.emf.core.context.impl.ContextImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link org.eventb.emf.core.context.impl.ContextImpl#getAxioms <em>Axioms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends EventBNamedCommentedComponentElementImpl implements Context {
	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> extends_;

	/**
	 * The cached value of the '{@link #getSets() <em>Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSets()
	 * @generated
	 * @ordered
	 */
	protected EList<CarrierSet> sets;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constants;

	/**
	 * The cached value of the '{@link #getAxioms() <em>Axioms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<Axiom> axioms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<Context>(Context.class, this, ContextPackage.CONTEXT__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns an EList of the names of the extends contexts.
	 * Changes made to the returned list will be reflected as changes to the context's extends reference list
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getExtendsNames() {
		List<String> extendsNamesData = new ArrayList<String>();
		for (int i = 0 ; i < getExtends().size(); i++){
			extendsNamesData.add(getExtendsName(i));
		}
		EList<String> extendsNamesList = new EDataTypeEList<String>(String.class, this, ContextPackage.CONTEXT__EXTENDS_NAMES);
		((BasicEList<String>)extendsNamesList).setData(extendsNamesData.size(), extendsNamesData.toArray());
		return 	extendsNamesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns the name of the extended context at the given index, or null if index is out of bounds.
	 * If the extends reference is a proxy, the context name is returned without resolving the reference
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param index	- position in list to get the reference
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected String getExtendsName(int index) {
		try{
			//get the current Context at the given index (using basicGet to avoid resolving)
			Context context = ((BasicEList<Context>)getExtends()).basicGet(index);
			//return the name of the referenced element (either from the unresolved URI fragment or from the resolved element's name)
			return context.getName();
		}catch (Exception e){
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the context at the given index of the extends list to a proxy referencing the given context name.
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
	protected void setExtendsName(int index, String newName) {
		try{
			//get the current Context at the given index (using basicGet to avoid resolving)
			Context proxy = ((BasicEList<Context>)getExtends()).basicGet(index);
			//if currently has a proxy at that index, re-use it for the new reference otherwise create a new one.
			if (!proxy.eIsProxy()) proxy = ContextFactory.eINSTANCE.createContext();
			//set the proxy uri to a dummy with fragment set to newName
			((InternalEObject)proxy).eSetProxyURI(CorePackage.dummyURI.appendFragment(Context.class.getName()+"."+newName));
			//set the proxy at the given index (using setUnique to avoid checking uniqueness because it involves resolving and loading)
			((BasicEList<Context>)getExtends()).setUnique(index,proxy);
		}catch (IndexOutOfBoundsException e){
			addExtendsName(newName);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Adds a new proxy referencing the given context name to the end of the extends list.
	 * This method does not check to see whether the new referenced context exists,
	 * nor whether the reference is unique within the collection.
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param newName - name of the element referenced
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected void addExtendsName(String newName) {
		addExtendsName(((BasicEList<Context>)getExtends()).size(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Adds a new proxy referencing the given context name at the given index in the extends list.
	 * This method does not check to see whether the new referenced context exists,
	 * nor whether the reference is unique within the collection.
	 * This method does not resolve any proxies that are not already resolved
	 *
	 * @param newName - name of the element referenced
	 * <!-- end-user-doc -->
	 * @custom
	 */
	protected void addExtendsName(int index, String newName) {
		Context proxy = ContextFactory.eINSTANCE.createContext();
		//add the new proxy (using setUnique to avoid checking uniqueness because it involves resolving and loading)
		((InternalEObject)proxy).eSetProxyURI(CorePackage.dummyURI.appendFragment(Context.class.getName()+"."+newName));
		((BasicEList<Context>)getExtends()).addUnique(index, proxy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarrierSet> getSets() {
		if (sets == null) {
			sets = new EObjectContainmentEList<CarrierSet>(CarrierSet.class, this, ContextPackage.CONTEXT__SETS);
		}
		return sets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentEList<Constant>(Constant.class, this, ContextPackage.CONTEXT__CONSTANTS);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Axiom> getAxioms() {
		if (axioms == null) {
			axioms = new EObjectContainmentEList<Axiom>(Axiom.class, this, ContextPackage.CONTEXT__AXIOMS);
		}
		return axioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextPackage.CONTEXT__SETS:
				return ((InternalEList<?>)getSets()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
			case ContextPackage.CONTEXT__AXIOMS:
				return ((InternalEList<?>)getAxioms()).basicRemove(otherEnd, msgs);
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
			case ContextPackage.CONTEXT__EXTENDS:
				return getExtends();
			case ContextPackage.CONTEXT__EXTENDS_NAMES:
				return getExtendsNames();
			case ContextPackage.CONTEXT__SETS:
				return getSets();
			case ContextPackage.CONTEXT__CONSTANTS:
				return getConstants();
			case ContextPackage.CONTEXT__AXIOMS:
				return getAxioms();
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
			case ContextPackage.CONTEXT__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends Context>)newValue);
				return;
			case ContextPackage.CONTEXT__EXTENDS_NAMES:
				getExtendsNames().clear();
				getExtendsNames().addAll((Collection<? extends String>)newValue);
				return;
			case ContextPackage.CONTEXT__SETS:
				getSets().clear();
				getSets().addAll((Collection<? extends CarrierSet>)newValue);
				return;
			case ContextPackage.CONTEXT__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends Constant>)newValue);
				return;
			case ContextPackage.CONTEXT__AXIOMS:
				getAxioms().clear();
				getAxioms().addAll((Collection<? extends Axiom>)newValue);
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
			case ContextPackage.CONTEXT__EXTENDS:
				getExtends().clear();
				return;
			case ContextPackage.CONTEXT__EXTENDS_NAMES:
				getExtendsNames().clear();
				return;
			case ContextPackage.CONTEXT__SETS:
				getSets().clear();
				return;
			case ContextPackage.CONTEXT__CONSTANTS:
				getConstants().clear();
				return;
			case ContextPackage.CONTEXT__AXIOMS:
				getAxioms().clear();
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
			case ContextPackage.CONTEXT__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case ContextPackage.CONTEXT__EXTENDS_NAMES:
				return !getExtendsNames().isEmpty();
			case ContextPackage.CONTEXT__SETS:
				return sets != null && !sets.isEmpty();
			case ContextPackage.CONTEXT__CONSTANTS:
				return constants != null && !constants.isEmpty();
			case ContextPackage.CONTEXT__AXIOMS:
				return axioms != null && !axioms.isEmpty();
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
				
				URI uri=null;
				String projectName = getURI().trimSegments(getURI().segmentCount()-2).lastSegment();
				String resourceName = reference.substring(reference.lastIndexOf(".")+1);
				
				if (proxy instanceof Context && getExtends().contains(proxy)){
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


	@Override
	public boolean eNotificationRequired(){return true;}

	@SuppressWarnings("unchecked")
	@Override
	public void eNotify(Notification notification){
		if (notification.getFeatureID(this.getClass()) == ContextPackage.CONTEXT__EXTENDS_NAMES){
			switch (notification.getEventType()){
			case Notification.SET:
				setExtendsName(notification.getPosition(), notification.getNewStringValue());
				break;
			case Notification.UNSET:
				getExtends().clear();	//not expected to be used
				break;
			case Notification.ADD: {
				addExtendsName(notification.getPosition(), notification.getNewStringValue());
				break;
			}
			case Notification.REMOVE: {
				getExtends().remove(notification.getPosition());
				break;
			}
			case Notification.ADD_MANY: {
				for (String newName : (List<String>)notification.getNewValue()){
					addExtendsName(newName);
				}
				break;
			}
			case Notification.REMOVE_MANY: {
				if (notification.getNewValue()==null && notification.getPosition()==-1){
					getExtends().clear();
				}
				break;
			}
			case Notification.MOVE:
				//N.B decided it is better NOT to prevent exceptions, otherwise the names list will be out of sync with the references
				//if (!(notification.getOldValue() instanceof Integer)) break;
				int oldpos = ((Integer)notification.getOldValue()).intValue();
				int newpos = notification.getPosition();
				//if (oldpos<0 || newpos<0 || oldpos >= getSees().size() || newpos >= getSees().size() ) break;
				getExtends().move(newpos, oldpos);
				break;
			default: break;
			}
		}
		super.eNotify(notification);
	}

} //ContextImpl
