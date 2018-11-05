package us.coastalhacking.corvus.eclipse.resources.provider;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.core.resources.IResourceRuleFactory;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.MultiRule;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionChangeDescription;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import us.coastalhacking.corvus.eclipse.resources.ResourceModifiedListener;

public class ResourceModifiedListenerBase implements ResourceModifiedListener, ResourceSetListener {

	@Override
	public NotificationFilter getFilter() {
		return NotificationFilter.NOT_TOUCH;
	}

	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
		return null;
	}

	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		final Transaction tx = event.getTransaction();

		Optional.ofNullable(tx.getChangeDescription()).ifPresent(desc -> {
			final Set<URI> uris = new HashSet<>();

			addUris(uris, desc);
			if (!uris.isEmpty()) {
				SaveResourceJob job = new SaveResourceJob(uris, getDomain(), getOptions());
				job.setRule(getRule(uris));
				job.schedule();
			}
		});
	}

	void addUris(Set<URI> uris, TransactionChangeDescription description) {

		// bug somewhere in EMFT when getting the keySet versus iterator, so using
		// iterator
		EMap<EObject, EList<FeatureChange>> objectChanges = description.getObjectChanges();
		Iterator<Map.Entry<EObject, EList<FeatureChange>>> iter = objectChanges.iterator();
		iter.forEachRemaining(entry -> {
			Optional.ofNullable(entry.getKey().eResource()).ifPresent(r -> {
				URI physical = r.getResourceSet().getURIConverter().normalize(r.getURI());
				if (physical.isPlatform()) {
					uris.add(physical);
				}
			});
		});
	}	
	
	@Override
	public boolean isAggregatePrecommitListener() {
		return false;
	}

	@Override
	public boolean isPrecommitOnly() {
		return false;
	}

	@Override
	public boolean isPostcommitOnly() {
		return true;
	}

	protected TransactionalEditingDomain getDomain() {
		return null;
	}

	protected IWorkspace getWorkspace() {
		return null;
	}

	protected Map<String, Object> getOptions() {
		return Collections.emptyMap();
	}

	protected ISchedulingRule getRule(Set<URI> uris) {
		IWorkspaceRoot root = getWorkspace().getRoot();
		IResourceRuleFactory ruleFactory = getWorkspace().getRuleFactory();
		ISchedulingRule[] rules = uris.stream().filter(URI::isPlatform).map(u -> u.toPlatformString(true))
				.map(s -> root.findMember(s)).map(r -> ruleFactory.modifyRule(r)).toArray(ISchedulingRule[]::new);
		return new MultiRule(rules);
	}

	// TODO: re-use jobs if possible. the impls synchronize
	public static class SaveResourceJob extends WorkspaceJob {

		private final TransactionalEditingDomain domain;
		private final Map<String, Object> options;
		private final Collection<URI> uris;

		public SaveResourceJob(Collection<URI> uris, TransactionalEditingDomain domain, Map<String, Object> options) {
			super("Auto-save resources");
			this.domain = domain;
			this.options = options;
			this.uris = uris;
		}

		@Override
		public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
			final RecordingCommand command = new RecordingCommand(domain, "Marker change", "Marker change") {
				@Override
				protected void doExecute() {

					uris.stream().forEach(uri -> {
						Resource resource = domain.getResourceSet().getResource(uri, true);
						try {
							resource.save(options);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					});
				}
			};
			domain.getCommandStack().execute(command);
			return Status.OK_STATUS;
		}

	}
}
