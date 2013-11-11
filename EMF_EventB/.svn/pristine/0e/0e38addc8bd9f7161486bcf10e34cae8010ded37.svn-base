package org.eventb.emf.persistence;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eventb.core.IContextRoot;
import org.eventb.core.IEventBProject;
import org.eventb.core.IEventBRoot;
import org.eventb.core.IMachineRoot;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.Project;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.persistence.synchroniser.SyncManager;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;
import org.rodinp.core.RodinDBException;

public class ProjectResource extends ResourceImpl {

	private IRodinProject rodinProject = null;
	private Map<IRodinElement, EventBObject> map = new HashMap<IRodinElement, EventBObject>();
	private final IResourceChangeListener workspaceListener = new ProjectUpdater();
	private final Map<String, EventBNamed> components = new HashMap<String, EventBNamed>();

	public ProjectResource() {
		rodinProject = null;
		ResourcesPlugin.getWorkspace().addResourceChangeListener(workspaceListener);
	}

	public ProjectResource(final IRodinProject project) {
		rodinProject = project;
	}

	public ProjectResource(final String projectName) {
		rodinProject = RodinCore.getRodinDB().getRodinProject(projectName);
	}

	public Map<IRodinElement, EventBObject> getMap() {
		return map;
	}

	@Override
	protected void doUnload() {
		super.doUnload();
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(workspaceListener);
	}

	@Override
	public void setURI(final URI uri) {
		super.setURI(uri);
		final int segmentCount = uri.segmentCount();
		final String projectName = URI.decode(uri.segment(segmentCount - 2));

		rodinProject = RodinCore.getRodinDB().getRodinProject(projectName);
		map = new HashMap<IRodinElement, EventBObject>();
	}

	public IEventBProject getEventBProject() {
		return (IEventBProject) rodinProject.getAdapter(IEventBProject.class);
	}

	@Override
	public void load(final Map<?, ?> options) throws IOException {
		try {
			isLoading = true;
			setLoaded(true);

			// does file already exist? -> load
			if (exists()) {
				SyncManager syncManager = new SyncManager();
				try {
					map.clear();
					getContents().add(syncManager.loadRodinElement(rodinProject, null, map, null));

				} catch (RodinDBException e) {
					throw new IOException("Error while loading rodin project: " + e.getLocalizedMessage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// success
				setTimeStamp(System.currentTimeMillis());
			} else {
				throw new IOException("Resource does not exist");
			}
		} finally {
			isLoading = false;
		}
	}

	@Override
	public void save(final Map<?, ?> options) throws IOException {
		if (!isLoaded || isLoading)
			return;

		try {
			if (!exists()) {
				RodinCore.run(new IWorkspaceRunnable() {
					public void run(final IProgressMonitor monitor) throws CoreException {
						createRodinProject().save(monitor, true);
						// success
						setTimeStamp(System.currentTimeMillis());
					}
				}, null);
			}
			RodinCore.run(new IWorkspaceRunnable() {
				public void run(final IProgressMonitor monitor) throws CoreException {
					SyncManager syncManager = new SyncManager();
					for (EObject content : getContents()) {
						if (content instanceof Project) {
							map.clear();
							syncManager.saveModelElement((EventBElement) content, rodinProject, map, new NullProgressMonitor());
							updateMap((Project) content);
						}
					}

					// remove files that were deleted from the diagram
					List<IInternalElement> children = new ArrayList<IInternalElement>();
					children.addAll(Arrays.asList(rodinProject.getRootElementsOfType(IMachineRoot.ELEMENT_TYPE)));
					children.addAll(Arrays.asList(rodinProject.getRootElementsOfType(IContextRoot.ELEMENT_TYPE)));
					for (IInternalElement child : children) {
						if (!map.containsKey(child))
							if (child.getRodinFile().exists()) {
								((IEventBRoot) child.getRoot()).getPRRoot().getRodinFile().delete(true, monitor);
								child.getRodinFile().delete(true, monitor);
							}
					}

					// save changed files
					for (IRodinFile file : rodinProject.getRodinFiles())
						//FIX: not sure if forcing on file save should be specified
						if (!file.isConsistent())
							file.save(null, false);
					rodinProject.save(null, true);

					// success
					setTimeStamp(System.currentTimeMillis());
					isModified = false;
				}
			}, null);
		} catch (RodinDBException e) {
			throw new IOException("Error while saving rodin project: " + e.getLocalizedMessage());
		}
	}

	private IRodinProject createRodinProject() throws CoreException {
		final IProject project = rodinProject.getProject();
		if (!project.exists())
			project.create(null);
		project.open(null);

		// add the rodin nature if it isn't already there
		final IProjectDescription description = project.getDescription();
		final String[] natures = description.getNatureIds();
		boolean alreadyRodin = false;
		for (int i = 0; i < natures.length; ++i) {
			if (RodinCore.NATURE_ID.equals(natures[i])) {
				alreadyRodin = true;
				break;
			}
		}
		if (!alreadyRodin) {
			// Add the Rodin nature
			final String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = RodinCore.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		}
		return rodinProject;
	}

	private void updateMap(Project project) {
		components.clear();
		for (EventBNamed component : project.getComponents())
			components.put(component.doGetName(), component);
	}

	public boolean exists() {
		return rodinProject.exists() && rodinProject.getProject().exists();
	}

	public class ProjectUpdater implements IResourceChangeListener {

		public void resourceChanged(IResourceChangeEvent event) {

			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(ProjectResource.this);

			//if domain is null there is no editor that needs updating.
			if (domain == null)
				return;

			// we are only interested in POST_CHANGE events
			if (event.getType() != IResourceChangeEvent.POST_CHANGE)
				return;

			IResourceDelta rootDelta = event.getDelta();

			// get the delta for the rodin project
			IResourceDelta docDelta = rootDelta.findMember(rodinProject.getPath());
			if (docDelta == null)
				return;

			final Map<String, String> moved = new HashMap<String, String>();
			final ArrayList<String> removed = new ArrayList<String>();
			final ArrayList<String> added = new ArrayList<String>();
			final ArrayList<String> changed = new ArrayList<String>();

			IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {
				public boolean visit(IResourceDelta delta) {
					if ((delta.getKind() & (IResourceDelta.REMOVED | IResourceDelta.ADDED | IResourceDelta.CHANGED)) == 0)
						return true;

					IResource resource = delta.getResource();
					String name = resource.getLocation().removeFileExtension().lastSegment();
					String filename = resource.getLocation().lastSegment();

					// only interested in unchecked machine/context files
					if (resource.getType() == IResource.FILE && ("bum".equalsIgnoreCase(resource.getFileExtension()) || "buc".equalsIgnoreCase(resource.getFileExtension()))) {

						if (delta.getKind() == IResourceDelta.REMOVED)
							if ((delta.getFlags() & IResourceDelta.MOVED_TO) != 0)
								moved.put(name, delta.getMovedToPath().removeFileExtension().lastSegment());
							else
								removed.add(name);

						if (delta.getKind() == IResourceDelta.ADDED)
							if ((delta.getFlags() & IResourceDelta.MOVED_FROM) != 0)
								;//moved.add(resource);
							else
								added.add(filename);

						if (delta.getKind() == IResourceDelta.CHANGED) {
							if ((delta.getFlags() & IResourceDelta.CONTENT) != 0)
								changed.add(filename);
						}
					}

					return true;
				}
			};

			try {
				docDelta.accept(visitor);
			} catch (CoreException e) {
				//open error dialog with syncExec or print to plugin log file
			}

			final Project project = (Project) ProjectResource.this.getContents().get(0);

			CompoundCommand cc = new CompoundCommand();

			if (added.size() > 0)
				cc.append(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						try {
							SyncManager syncManager = new SyncManager();
							for (String fileName : added) {
								String name = fileName.substring(0, fileName.length() - 4);
								if (!components.containsKey(name))
									components.put(name, (EventBNamed) syncManager.loadRodinElement(rodinProject.getRodinFile(fileName), project, map, null));
							}
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});

			if (removed.size() > 0)
				cc.append(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						try {
							Collection<EventBNamed> toRemove = new ArrayList<EventBNamed>();
							for (String name : removed)
								if (components.containsKey(name))
									toRemove.add(components.remove(name));
							domain.getCommandStack().execute(new DeleteCommand(domain, toRemove));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});

			if (moved.size() > 0)
				cc.append(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						try {
							for (String name : moved.keySet())
								if (components.containsKey(name)) {
									domain.getCommandStack().execute(new SetCommand(domain, components.get(name), CorePackage.eINSTANCE.getEventBNamed_Name(), moved.get(name)));
									components.put(moved.get(name), components.get(name));
								}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});

			if (changed.size() > 0)
				cc.append(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						try {
							SyncManager syncManager = new SyncManager();
							for (String name : changed) {
								EventBNamed element = (EventBNamed) syncManager.loadRodinElement(rodinProject.getRodinFile(name), null, map, null);
								EventBNamed component = components.get(element.doGetName());
								if (component != null)
									if (element instanceof Machine) {
										domain.getCommandStack().execute(
												new SetCommand(domain, component, MachinePackage.eINSTANCE.getMachine_SeesNames(), ((Machine) element).getSeesNames()));
										domain.getCommandStack().execute(
												new SetCommand(domain, component, MachinePackage.eINSTANCE.getMachine_RefinesNames(), ((Machine) element).getRefinesNames()));
									} else if (element instanceof Context) {
										domain.getCommandStack().execute(
												new SetCommand(domain, component, ContextPackage.eINSTANCE.getContext_ExtendsNames(), ((Context) element).getExtendsNames()));
									}
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});

			domain.getCommandStack().execute(cc);
		}
	}
}
