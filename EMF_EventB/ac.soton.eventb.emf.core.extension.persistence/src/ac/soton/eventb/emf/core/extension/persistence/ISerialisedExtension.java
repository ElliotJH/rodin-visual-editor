/**
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.core.extension.persistence;

import org.rodinp.core.IInternalElement;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.RodinCore;

/**
 * Serialised extension Rodin element type interface.
 * 
 * @author vitaly
 *
 */
public interface ISerialisedExtension  extends ISerialised, IExtension, IInternalElement {

	public static final IInternalElementType<ISerialisedExtension> ELEMENT_TYPE = RodinCore.getInternalElementType(ExtensionPersistencePlugin.PLUGIN_ID + ".serialisedExtension");

}