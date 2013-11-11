/**
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.core.extension.persistence;

import org.eclipse.core.runtime.IProgressMonitor;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.RodinCore;
import org.rodinp.core.RodinDBException;

/**
 * Extension element type interface.
 * Contains Rodin string attribute 'extensionId'.
 * 
 * @author vitaly
 *
 */
public interface IExtension {
	
	public static IAttributeType.String EXTENSION_ID_ATTRIBUTE = RodinCore.getStringAttrType(ExtensionPersistencePlugin.PLUGIN_ID + ".extensionId");

	/**
	 * Tests whether an extensionId string is set.
	 * 
	 * @return true if set, otherwise false
	 * @throws RodinDBException if there was a problem accessing the database
	 */
	public abstract boolean hasExtensionId() throws RodinDBException;

	/**
	 * Returns extensionId string.
	 * 
	 * @return extensionId
	 * @throws RodinDBException if there was a problem accessing the database
	 */
	public abstract String getExtensionId() throws RodinDBException;

	/**
	 * Sets extensionId string.
	 * 
	 * @param string an extensionId
	 * @param monitor progress monitor
	 * @throws RodinDBException if there was a problem accessing the database
	 */
	public abstract void setExtensionId(String string,
			IProgressMonitor monitor) throws RodinDBException;
}