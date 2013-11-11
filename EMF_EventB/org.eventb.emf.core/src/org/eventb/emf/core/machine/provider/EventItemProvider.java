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
package org.eventb.emf.core.machine.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.Image;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.MachineFactory;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.provider.EventBNamedCommentedElementItemProvider;
import org.eventb.internal.ui.EventBImage;
import org.eventb.ui.IEventBSharedImages;

/**
 * This is the item provider adapter for a {@link org.eventb.emf.core.machine.Event} object.
 * <!-- begin-user-doc -->
 * @implements ITableItemLabelProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class EventItemProvider
	extends EventBNamedCommentedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider {
	
	private static final Image IMAGE = EventBImage.getImage(IEventBSharedImages.IMG_EVENT);

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addConvergencePropertyDescriptor(object);
			addExtendedPropertyDescriptor(object);
			addRefinesPropertyDescriptor(object);
			addRefinesNamesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Convergence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConvergencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Event_convergence_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Event_convergence_feature", "_UI_Event_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 MachinePackage.Literals.EVENT__CONVERGENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extended feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Event_extended_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Event_extended_feature", "_UI_Event_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 MachinePackage.Literals.EVENT__EXTENDED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Event_refines_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Event_refines_feature", "_UI_Event_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 MachinePackage.Literals.EVENT__REFINES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refines Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinesNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Event_refinesNames_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Event_refinesNames_feature", "_UI_Event_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 MachinePackage.Literals.EVENT__REFINES_NAMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MachinePackage.Literals.EVENT__PARAMETERS);
			childrenFeatures.add(MachinePackage.Literals.EVENT__GUARDS);
			childrenFeatures.add(MachinePackage.Literals.EVENT__WITNESSES);
			childrenFeatures.add(MachinePackage.Literals.EVENT__ACTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * 
	 * <!-- begin-user-doc -->
	 * Returns the corresponding Rodin Event B image or a default image if this has not been found.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return IMAGE!=null ? IMAGE : 
			overlayImage(object, getResourceLocator().getImage("full/obj16/Event"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Event)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Event_type") : //$NON-NLS-1$
			getString("_UI_Event_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Event.class)) {
			case MachinePackage.EVENT__CONVERGENCE:
			case MachinePackage.EVENT__EXTENDED:
			case MachinePackage.EVENT__REFINES_NAMES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MachinePackage.EVENT__PARAMETERS:
			case MachinePackage.EVENT__GUARDS:
			case MachinePackage.EVENT__WITNESSES:
			case MachinePackage.EVENT__ACTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MachinePackage.Literals.EVENT__PARAMETERS,
				 MachineFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MachinePackage.Literals.EVENT__GUARDS,
				 MachineFactory.eINSTANCE.createGuard()));

		newChildDescriptors.add
			(createChildParameter
				(MachinePackage.Literals.EVENT__WITNESSES,
				 MachineFactory.eINSTANCE.createWitness()));

		newChildDescriptors.add
			(createChildParameter
				(MachinePackage.Literals.EVENT__ACTIONS,
				 MachineFactory.eINSTANCE.createAction()));
	}
	
	/**
	 * getColumnText is implemented for ITableItemLabelProvider
	 * first column is the event label,
	 * second column is convergence
	 * third column is a comma seperated list of refined events
	 * 
	 */
	public String getColumnText(Object object, int columnIndex){
		Event event = (Event)object;
		switch (columnIndex){
		case 0:
			return getText(event);
		case 1:
			return event.getConvergence().getLiteral();
		case 2:
			return refinesList(event);
		default:
			return "";
		}
	}

	private String refinesList(Event event) {
		String ret = "";
		EList<String> refinesNames = event.getRefinesNames();
		for (String nm : refinesNames){
			if (!"".equals(ret)) ret = ret + ", ";
			ret = ret + nm;
		}
		if (event.isExtended()) ret = "EXTENDS " + ret;
		return ret;
	}

//	/**
//	 * override to return the transient item provider of the Events node
//	 */
//	public Object getParent(Object object){
//		Object machine = super.getParent(object);
//		MachineItemProvider machineItemProvider = (MachineItemProvider)adapterFactory.adapt(machine, IEditingDomainItemProvider.class);
//		return machineItemProvider != null ? machineItemProvider.getEvents() : null;
//		
//	}
}
