package org.eventb.emf.persistence.factory;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eventb.emf.persistence.ProjectResource;

public class ProjectFactory implements Resource.Factory {

	private static Map<IResource, Collection<ProjectResource>> handledResources;
	private static Object handledResourcesMutex = new Object();

	public Resource createResource(URI uri) {
		checkInit();

		final ProjectResource resource = new ProjectResource();
		resource.setURI(uri);

		synchronized (handledResourcesMutex) {
			addNewResource(resource);
		}

		return resource;
	}

	public void removeResource(final ProjectResource resource) {
		IResource key = (IResource) resource.getResourceSet();
		Collection<ProjectResource> collection = handledResources.get(key);

		if (collection != null) {
			collection.remove(resource);

			if (collection.isEmpty()) {
				handledResources.remove(collection);
			}
		}
	}

	private void addNewResource(final ProjectResource resource) {
		IResource key = (IResource) resource.getResourceSet();
		Collection<ProjectResource> collection = handledResources.get(key);

		if (collection == null) {
			collection = new HashSet<ProjectResource>();
			handledResources.put(key, collection);
		}

		collection.add(resource);
	}

	private void checkInit() {
		synchronized (handledResourcesMutex) {
			if (handledResources == null) {
				handledResources = new HashMap<IResource, Collection<ProjectResource>>();
			}
		}
	}

	public static Collection<ProjectResource> getHandledResources(IResource resource) {
		synchronized (handledResourcesMutex) {
			if (handledResources != null && handledResources.containsKey(resource)) {
				return Collections.unmodifiableCollection(handledResources.get(resource));
			}
		}

		return null;
	}
}