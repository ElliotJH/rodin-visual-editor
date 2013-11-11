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
 * Serialised element type interface.
 * Contains Rodin string attribute 'serialised'.
 * 
 * @author vitaly
 *
 */
public interface ISerialised {
	
	public static IAttributeType.String SERIALISED_ATTRIBUTE = RodinCore.getStringAttrType(ExtensionPersistencePlugin.PLUGIN_ID + ".serialised");
	public static IAttributeType.String EPACKAGE_URI_ATTRIBUTE = RodinCore.getStringAttrType(ExtensionPersistencePlugin.PLUGIN_ID + ".ePackageURI");
	public static IAttributeType.String ECLASSIFIER_ATTRIBUTE = RodinCore.getStringAttrType(ExtensionPersistencePlugin.PLUGIN_ID + ".eClassifier");

	/**
	 * Tests whether a serialised string is set.
	 * 
	 * @return true if set, otherwise false
	 * @throws RodinDBException if there was a problem accessing the database
	 */
	public abstract boolean hasSerialised() throws RodinDBException;

	/**
	 * Returns serialised string.
	 * 
	 * @return a string representation of a serialised AbsractStatemachine
	 * @throws RodinDBException if there was a problem accessing the database
	 */
	public abstract String getSerialised() throws RodinDBException;

	/**
	 * Sets serialised string.
	 * 
	 * @param string a serialised AbsractStatemachine
	 * @param monitor progress monitor
	 * @throws RodinDBException if there was a problem accessing the database
	 */
	public abstract void setSerialised(String string,
			IProgressMonitor monitor) throws RodinDBException;
	
	/**
	 * Is EPackage URI set?
	 * @return
	 * @throws RodinDBException
	 */
	public abstract boolean hasEPackageURI() throws RodinDBException;

	/**
	 * Returns EPackage URI.
	 * @return
	 * @throws RodinDBException
	 */
	public abstract String getEPackageURI() throws RodinDBException;

	/**
	 * Sets URI.
	 * @param string EPackage URI
	 * @param monitor
	 * @throws RodinDBException
	 */
	public abstract void setEPackageURI(String string, IProgressMonitor monitor)
			throws RodinDBException;

	/**
	 * Is EClassifier set?
	 * @return 
	 * @throws RodinDBException
	 */
	public abstract boolean hasEClassifier() throws RodinDBException;

	/**
	 * Returns EClassifier.
	 * @return
	 * @throws RodinDBException
	 */
	public abstract String getEClassifier() throws RodinDBException;

	/**
	 * Sets EClassifier.
	 * @param string EClassifier name
	 * @param monitor
	 * @throws RodinDBException
	 */
	public abstract void setEClassifier(String string, IProgressMonitor monitor) throws RodinDBException;
}