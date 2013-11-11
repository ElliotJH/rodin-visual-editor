package org.eventb.emf.core.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry;

/**
 * @generated
 */
public class EventbcoreNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof EventbcoreNavigatorItem) {
			EventbcoreNavigatorItem item = (EventbcoreNavigatorItem) element;
			return EventbcoreVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
