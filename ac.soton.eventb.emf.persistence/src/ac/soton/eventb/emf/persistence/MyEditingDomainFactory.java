package ac.soton.eventb.emf.persistence;

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
			this.traverse(r.getAllContents());
		}
		super.resourceSetChanged(event);
	}
	private void traverse(TreeIterator<EObject> t) {
		if(t.next() instanceof Project) {
			Logger.getAnonymousLogger().severe("Yes");
		}
	}
}
