package org.eventb.emf.persistence.factory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Assert;

public class ChangeListenerRegistry {

	private static final Map<RodinResource, Set<IChangeListener>> listenerMap = new HashMap<RodinResource, Set<IChangeListener>>();

	static void notifyChangeListener(final RodinResource resource) {
		Assert.isNotNull(resource);

		final Set<IChangeListener> listeners = listenerMap.get(resource);
		if (listeners != null) {
			for (IChangeListener listener : listeners) {
				listener.persistentResourceChanged(resource);
			}
		}
	}

	public static void addChangeListener(final RodinResource resource, final IChangeListener listener) {
		Assert.isNotNull(resource);
		Assert.isNotNull(listener);

		Set<IChangeListener> listeners = listenerMap.get(resource);

		if (listeners == null) {
			listeners = new HashSet<IChangeListener>();
			listenerMap.put(resource, listeners);
		}

		listeners.add(listener);
	}

	public static void removeChangeListener(final RodinResource resource, final IChangeListener listener) {
		Assert.isNotNull(resource);
		Assert.isNotNull(listener);

		final Set<IChangeListener> listeners = listenerMap.get(resource);
		if (listeners != null) {
			listeners.remove(listener);
		}
	}
}
