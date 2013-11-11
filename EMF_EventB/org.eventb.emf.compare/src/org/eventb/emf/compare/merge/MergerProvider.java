/** 
 * (c) 2009 Lehrstuhl fuer Softwaretechnik und Programmiersprachen, 
 * Heinrich Heine Universitaet Duesseldorf
 * This software is licenced under EPL 1.0 (http://www.eclipse.org/org/documents/epl-v10.html) 
 * */

package org.eventb.emf.compare.merge;

import java.util.Map;

import org.eclipse.emf.compare.diff.merge.IMerger;
import org.eclipse.emf.compare.diff.merge.IMergerProvider;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChangeRightTarget;
import org.eclipse.emf.compare.util.EMFCompareMap;

public class MergerProvider implements IMergerProvider {
	private Map<Class<? extends DiffElement>, Class<? extends IMerger>> mergerTypes;

	public Map<Class<? extends DiffElement>, Class<? extends IMerger>> getMergers() {
		if (mergerTypes == null) {
			mergerTypes = new EMFCompareMap<Class<? extends DiffElement>, Class<? extends IMerger>>();

			mergerTypes.put(ReferenceChangeRightTarget.class,
					ReferenceChangeRightTargetMerger.class);
			// mergerTypes.put(ReferenceChangeRightTarget.class,
			// DefaultMerger.class);

			// TODO maybe we'll need to implement that one too
			// mergerTypes.put(ReferenceChangeLeftTarget.class,
			// ReferenceChangeLeftTargetMerger.class);
		}
		return mergerTypes;
	}
}
