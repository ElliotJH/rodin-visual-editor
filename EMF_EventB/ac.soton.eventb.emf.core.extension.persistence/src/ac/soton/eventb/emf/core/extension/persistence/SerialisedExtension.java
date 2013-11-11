/**
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.core.extension.persistence;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eventb.core.basis.EventBElement;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinDBException;

/**
 * Serialised extension element type.
 * 
 * @author vitaly
 *
 */
public class SerialisedExtension extends EventBElement implements ISerialisedExtension {

	public SerialisedExtension(String name, IRodinElement parent) {
		super(name, parent);
	}

	@Override
	public IInternalElementType<? extends IInternalElement> getElementType() {
		return ELEMENT_TYPE;
	}

	@Override
	public boolean hasExtensionId() throws RodinDBException {
		return hasAttribute(EXTENSION_ID_ATTRIBUTE);
	}

	@Override
	public String getExtensionId() throws RodinDBException {
		return getAttributeValue(EXTENSION_ID_ATTRIBUTE);
	}

	@Override
	public void setExtensionId(String string, IProgressMonitor monitor)
			throws RodinDBException {
		setAttributeValue(EXTENSION_ID_ATTRIBUTE, string, monitor);
	}

	@Override
	public boolean hasSerialised() throws RodinDBException {
		return hasAttribute(SERIALISED_ATTRIBUTE);
	}

	@Override
	public String getSerialised() throws RodinDBException {
		return getAttributeValue(SERIALISED_ATTRIBUTE);
	}

	@Override
	public void setSerialised(String string, IProgressMonitor monitor)
			throws RodinDBException {
		setAttributeValue(SERIALISED_ATTRIBUTE, string, monitor);
	}

	@Override
	public boolean hasEPackageURI() throws RodinDBException {
		return hasAttribute(EPACKAGE_URI_ATTRIBUTE);
	}

	@Override
	public String getEPackageURI() throws RodinDBException {
		return getAttributeValue(EPACKAGE_URI_ATTRIBUTE);
	}

	@Override
	public void setEPackageURI(String string, IProgressMonitor monitor)
			throws RodinDBException {
		setAttributeValue(EPACKAGE_URI_ATTRIBUTE, string, monitor);
	}

	@Override
	public boolean hasEClassifier() throws RodinDBException {
		return hasAttribute(ECLASSIFIER_ATTRIBUTE);
	}

	@Override
	public String getEClassifier() throws RodinDBException {
		return getAttributeValue(ECLASSIFIER_ATTRIBUTE);
	}

	@Override
	public void setEClassifier(String string, IProgressMonitor monitor)
			throws RodinDBException {
		setAttributeValue(ECLASSIFIER_ATTRIBUTE, string, monitor);
	}

}
