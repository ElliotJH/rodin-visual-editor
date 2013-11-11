/*******************************************************************************
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package ac.soton.eventb.emf.core.extension.navigator.provider;

import org.eclipse.core.expressions.PropertyTester;
import org.eventb.core.IEventBRoot;

/**
 * Extension navigator property tester.
 * 
 * @author vitaly
 *
 */
public class ExtensionNavigatorPropertyTester extends PropertyTester {

	private static final Object PROPERTY_EVENTB_ROOT_CHILD = "eventBRootChild";

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		assert receiver instanceof ExtensionNavigatorItem : "Tested property receiver is not a ExtensionNavigatorItem";
		ExtensionNavigatorItem item = (ExtensionNavigatorItem) receiver;
		if (PROPERTY_EVENTB_ROOT_CHILD.equals(property)) {
			return Boolean.parseBoolean(expectedValue.toString()) == item.getParent() instanceof IEventBRoot;
		}
		assert false;
		return false;
	}

}
