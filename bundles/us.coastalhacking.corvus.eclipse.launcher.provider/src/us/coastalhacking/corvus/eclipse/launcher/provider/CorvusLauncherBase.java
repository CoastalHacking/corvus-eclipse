package us.coastalhacking.corvus.eclipse.launcher.provider;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.commands.operations.ObjectUndoContext;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;

import us.coastalhacking.corvus.eclipse.transaction.EclipseTransactionApi;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

public abstract class CorvusLauncherBase {

	protected TransactionalEditingDomain domain;
	protected IOperationHistory operationHistory;
	protected IUndoContext undoContext;
	protected ResourceSet resourceSet;
	protected String transactionId;

	protected void baseActivate(Map<String, ?> props) throws Exception {
		this.transactionId = (String) props.get(EclipseTransactionApi.Properties.CORVUS_TRANSACTION_ID);

		for (ResourceInitializer ri : getInitializers()) {

			final String pathValue = (String) props.get(ri.getPathKey());
			final IUndoableOperation operation = new AbstractEMFOperation(getDomain(),
					MessageFormat.format("Initalizing Corvus Launcher URI {0}", ri.getUriKey())) {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					try {
						URI key = URI.createURI(ri.getUriKey());
						URI value = URI.createFileURI(pathValue);
						getResourceSet().getURIConverter().getURIMap().put(key, value);

						Resource resource;
						try {
							resource = getResourceSet().getResource(key, true);
						} catch (Exception e) {
							resource = getResourceSet().getResource(key, false);
						}
						resource.getContents().add(ri.getRoot());
						// TODO: get XMI options and pass here via properties
						resource.save(null);
						return Status.OK_STATUS;
					} catch (Exception e) {
						throw new ExecutionException(e.getMessage(), e);
					}
				}
			};
			operation.addContext(getUndoContext());
			getOperationHistory().execute(operation, new NullProgressMonitor(), null);
		}

	}

	protected void baseDeactivate(Map<String, ?> props) {
		getDomainRegistry().remove(transactionId);
		getDomain().dispose();
	}

	protected ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		return resourceSet;
	}

	protected IOperationHistory getOperationHistory() {
		if (operationHistory == null) {
			operationHistory = OperationHistoryFactory.getOperationHistory();
		}
		return operationHistory;
	}

	protected TransactionalEditingDomain getDomain() {
		if (domain == null) {
			domain = getDomainFactory().createEditingDomain(getResourceSet(), getOperationHistory());
			getDomainRegistry().add(transactionId, domain);
		}
		return domain;
	}

	protected IUndoContext getUndoContext() {
		if (undoContext == null) {
			undoContext = new ObjectUndoContext(this);
		}
		return undoContext;
	}

	protected abstract WorkspaceEditingDomainFactory getDomainFactory();

	protected abstract TransactionalEditingDomain.Registry getDomainRegistry();

	protected abstract Collection<ResourceInitializer> getInitializers();
}
