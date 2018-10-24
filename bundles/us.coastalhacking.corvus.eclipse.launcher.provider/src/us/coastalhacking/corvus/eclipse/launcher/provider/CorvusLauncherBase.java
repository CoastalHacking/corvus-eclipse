package us.coastalhacking.corvus.eclipse.launcher.provider;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import us.coastalhacking.corvus.eclipse.transaction.EclipseTransactionApi;
import us.coastalhacking.corvus.eclipse.transaction.InitializingCommand;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

public abstract class CorvusLauncherBase {

	protected TransactionalEditingDomain domain;
	protected IOperationHistory operationHistory;
	protected IUndoContext undoContext;
	protected ResourceSet resourceSet;
	protected String transactionId;

	// TODO: change to ctor when DS 1.4 is in target platform
	// TODO: refactor to just a Command and ignore workspace stuff
	protected void baseActivate(Map<String, ?> props) throws Exception {
		this.transactionId = (String) props.get(EclipseTransactionApi.Properties.CORVUS_TRANSACTION_ID);

		// TODO: make testable
		// Initialize resources
		for (ResourceInitializer ri : getInitializers()) {
			final String pathValue = (String) props.get(ri.getPathKey());
			URI key = URI.createURI(ri.getUriKey());
			URI value = URI.createFileURI(pathValue);

			final Command command = new InitializingCommand(getDomain(), key, value, ri.getRoot());
			getDomain().getCommandStack().execute(command);
		}

		// TODO: Add adapters

		// Add marker listener
//		getWorkspace().addResourceChangeListener(getChangeListener());
	}

	protected void baseDeactivate(Map<String, ?> props) {
//		getWorkspace().removeResourceChangeListener(getChangeListener());
		getDomainRegistry().remove(transactionId);
		getDomain().dispose();
	}

	protected ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		return resourceSet;
	}

	protected TransactionalEditingDomain getDomain() {
		if (domain == null) {
			domain = getDomainFactory().createEditingDomain(getResourceSet());
			getDomainRegistry().add(transactionId, domain);
		}
		return domain;
	}

	protected TransactionalEditingDomain.Factory getDomainFactory() {
		return TransactionalEditingDomain.Factory.INSTANCE;
	}

	protected TransactionalEditingDomain.Registry getDomainRegistry() {
		return TransactionalEditingDomain.Registry.INSTANCE;
	}

	protected abstract Collection<ResourceInitializer> getInitializers();
}
