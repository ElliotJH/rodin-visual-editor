package ac.soton.eventb.emf.persistence;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eventb.emf.core.Project;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Machine;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;
import org.rodinp.core.RodinDBException;


public class MyEditingDomainFactory extends WorkspaceEditingDomainFactory {

	@Override
	public synchronized TransactionalEditingDomain createEditingDomain() {
		Logger.getAnonymousLogger().warning("Called 1");
		TransactionalEditingDomain createEditingDomain = super.createEditingDomain();
		createEditingDomain.addResourceSetListener(new MyResourceSetListener());
		return createEditingDomain;
	}

	@Override
	public synchronized TransactionalEditingDomain createEditingDomain(
			ResourceSet rset) {
		// TODO Auto-generated method stub
		Logger.getAnonymousLogger().warning("Called 2");
		TransactionalEditingDomain createEditingDomain = super.createEditingDomain(rset);
		return createEditingDomain;
	}

	@Override
	public synchronized TransactionalEditingDomain createEditingDomain(
			IOperationHistory history) {
		Logger.getAnonymousLogger().warning("Called 3");
		TransactionalEditingDomain createEditingDomain = super.createEditingDomain(history);
		createEditingDomain.addResourceSetListener(new MyResourceSetListener());
		return createEditingDomain;
	}

	@Override
	public synchronized TransactionalEditingDomain createEditingDomain(
			ResourceSet rset, IOperationHistory history) {
		Logger.getAnonymousLogger().warning("Called 4");
		TransactionalEditingDomain createEditingDomain = super.createEditingDomain(rset, history);
		return createEditingDomain;
	}
	
}
class MyResourceSetListener extends ResourceSetListenerImpl {
	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		for(Resource r : event.getEditingDomain().getResourceSet().getResources()) {
			try {
				this.traverse(r.getAllContents());
			} catch (RodinDBException e) {
				// TODO Auto-generated catch block
				Logger.getAnonymousLogger().log(Level.SEVERE, "Rodin Database Error", e);
			}
		}
		super.resourceSetChanged(event);
	}
	private void traverse(TreeIterator<EObject> t) throws RodinDBException {
		 
		if(t.next() instanceof Project) {
			IRodinProject[] rodinProjectList = RodinCore.getRodinDB().getRodinProjects();
			for(IRodinProject irp : rodinProjectList) {
				//If it's the correct name then save to it.
			}
			while(t.hasNext()) {
				EObject e = t.next();
				if(e instanceof Machine) {
					Machine m = (Machine)e;
					
					
				} else if (e instanceof Context) {
				}
				//We'll hand off to a plugin to attempt to save this new thing
			}
		}
	}
}
