package org.eventb.emf.persistence.synchroniser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eventb.core.IContextRoot;
import org.eventb.core.IExtendsContext;
import org.eventb.core.IMachineRoot;
import org.eventb.core.IRefinesEvent;
import org.eventb.core.IRefinesMachine;
import org.eventb.core.ISeesContext;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.Project;
import org.eventb.emf.persistence.ISynchroniser;
import org.rodinp.core.IParent;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.RodinDBException;

public class SyncManager {
	private static final Map<String, ISynchroniser> idMapping = new HashMap<String, ISynchroniser>();
	private static final Map<EClass, ISynchroniser> emfMapping = new HashMap<EClass, ISynchroniser>();
	private static final ISynchroniser genericSynchroniser;

	private static final String synchronisersID = "org.eventb.emf.persistence.synchroniser";
	static {
		// populate synchroniser mappings from registered extensions
		for (final IExtension extension : Platform.getExtensionRegistry().getExtensionPoint(synchronisersID).getExtensions()) {
			for (final IConfigurationElement packageElement : extension.getConfigurationElements()) {
				if ("emfPackage".equals(packageElement.getName())) {
					String nsURI = packageElement.getAttribute("nsURI");
					EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
					for (final IConfigurationElement element : packageElement.getChildren("synchroniser")) {
						if ("synchroniser".equals(element.getName())) {
							try {
								final ISynchroniser synchroniser = (ISynchroniser) element.createExecutableExtension("synchroniser_class");
								String rodinId = element.getAttribute("rodin_id");
								if (rodinId != null && !"".equals(rodinId)) {
									idMapping.put(rodinId, synchroniser);
								}
								EClassifier eClassifier = ePackage.getEClassifier(element.getAttribute("emf_class"));
								if (eClassifier != null) {
									emfMapping.put((EClass) eClassifier, synchroniser);
								}
							} catch (final CoreException e) {
								// to log an error we would need to give this
								// plugin an
								// Activator Class
								// IStatus status= new Status(
								// IStatus.ERROR,
								// PLUGIN_ID,
								// IStatus.ERROR,
								// message,
								// exception);
								// plugin.getLog().log(status);
							}
						}
					}
				}
			}
		}

		genericSynchroniser = new ExtensionSynchroniser();// DynamicSynchroniser(); //
	}

	private final Map<EObject, List<EObject>> order = new HashMap<EObject, List<EObject>>();

	public EventBElement loadRodinElement(final IRodinElement rodinElement, final EventBElement emfParent, Map<IRodinElement, EventBObject> map, final IProgressMonitor monitor)
			throws RodinDBException, Exception {
		order.clear();
		return doLoadRodinElement(rodinElement, emfParent, map, monitor);
	}

	private EventBElement doLoadRodinElement(final IRodinElement rodinElement, final EventBElement emfParent, Map<IRodinElement, EventBObject> map, final IProgressMonitor monitor)
			throws RodinDBException, Exception {

		final EventBElement emfElement;
		final IRodinElement rElement = rodinElement instanceof IRodinFile ? ((IRodinFile) rodinElement).getRoot() : rodinElement;
		// get mapping by id
		final String id = rElement.getElementType().getId();

		// for a project look at machine or context only
		if (emfParent instanceof Project && !id.equals(IMachineRoot.ELEMENT_TYPE.getId()) && !id.equals(IContextRoot.ELEMENT_TYPE.getId()))
			return null;

		if (id.equals(IRefinesMachine.ELEMENT_TYPE.getId()) || id.equals(ISeesContext.ELEMENT_TYPE.getId()) || id.equals(IRefinesEvent.ELEMENT_TYPE.getId())
				|| id.equals(IExtendsContext.ELEMENT_TYPE.getId()))
			return null;

		final ISynchroniser synchroniser = idMapping.get(id);

		if (synchroniser != null) {
			// call synchroniser
			emfElement = synchroniser.load(rElement, emfParent, monitor);
		} else {
			// use default generic synchroniser
			emfElement = genericSynchroniser.load(rElement, emfParent, monitor);
		}
		map.put(rElement, emfElement);
		List<EObject> childOrder = new ArrayList<EObject>();
		for (final IRodinElement child : ((IParent) rElement).getChildren()) {
			childOrder.add(loadRodinElement(child, emfElement, map, monitor));
		}
		order.put(emfElement, childOrder);
		return emfElement;
	}

	public void saveModelElement(final EventBElement emfElement, final IRodinElement rodinParent, Map<IRodinElement, EventBObject> map, final IProgressMonitor monitor)
			throws CoreException {
		final IRodinElement rodinElement;

		// get mapping and call synchroniser
		final ISynchroniser synchroniser = emfMapping.get(emfElement.eClass());

		if (synchroniser != null) {
			rodinElement = synchroniser.save(emfElement, rodinParent, monitor);
		} else {
			// use default generic synchroniser
			rodinElement = genericSynchroniser.save(emfElement, rodinParent, monitor);
		}
		if (rodinElement == null)
			return;
		map.put(rodinElement, emfElement);
		//Get the order of children of this element that was saved during load
		List<EObject> childOrder = order.get(emfElement);
		if (childOrder == null)
			childOrder = new ArrayList<EObject>();
		//work out whether any children have been moved 
		//(and add any new children into the order) so that they precede
		//the next element that is in the same EMF containment feature
		for (final EObject child : emfElement.eContents()) {
			if (child instanceof EventBElement) {
				//int currentPos = childOrder.indexOf(child);
				int p = getNewPos(emfElement, childOrder, child);
				if (p > -1) {
					childOrder.remove(child);
					childOrder.add(p, child);
				}
			}
		}
		//save children in revised order
		for (final EObject child : childOrder) {
			if (emfElement.eContents().contains(child) && child instanceof EventBElement)
				saveModelElement((EventBElement) child, rodinElement, map, monitor);
		}
	}

	/**
	 * Finds the required position of the child element in childOrder by looking
	 * at its position in the EMF containment feature. The child order should
	 * not be changed unless necessary. The child may have been be moved or
	 * added in which case the position of the next element in childOrder that
	 * it must precede is returned.. Returns -1 if the current position is ok
	 * (childOrder should not be changed).
	 * 
	 * @param parent
	 * @param childOrder
	 * @param child
	 * @return
	 */
	private int getNewPos(EventBElement parent, List<EObject> childOrder, EObject child) {
		//get the next child in the same emf collection that is already in the childOrder
		// or null
		Object nextChild = null;
		//EStructuralFeature feature = child.eContainingFeature();
		Object featureContent = parent.eGet(child.eContainingFeature());
		if (featureContent instanceof EList) {
			EList elist = (EList) featureContent;
			int p = ((EList) featureContent).indexOf(child);
			while (p + 1 < elist.size() && nextChild == null) {
				p = p + 1;
				if (childOrder.contains(elist.get(p))) {
					nextChild = elist.get(p);
				}
			}
		}

		int x = childOrder.indexOf(child);
		if (nextChild == null) {
			//no next child so return 'size' if child is new or no move if not
			return x == -1 ? childOrder.size() : -1;
		} else {
			//if child is new or out of position return position of next child, else no move
			int y = childOrder.indexOf(nextChild);
			return x == -1 || y < x ? y : -1;
		}
	}
}
