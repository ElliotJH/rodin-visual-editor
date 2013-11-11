/*******************************************************************************
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package ac.soton.eventb.emf.core.extension.navigator.filter;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eventb.emf.core.Annotation;

/**
 * EventB EMF annotation filter class.
 * Hides annotations if activated.
 * 
 * @author vitaly
 *
 */
public class AnnotationFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (element instanceof IAdaptable) {
			EObject eobject = (EObject) ((IAdaptable) element).getAdapter(EObject.class);
			if (eobject != null && eobject instanceof Annotation)
				return false;
		}
		return true;
	}

}
