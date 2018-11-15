package us.coastalhacking.corvus.eclipse.provider.entrypoint;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain.Registry;
import org.eclipse.emf.transaction.TriggerListener;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import us.coastalhacking.corvus.eclipse.EclipseApi;
import us.coastalhacking.corvus.emf.EmfApi;
import us.coastalhacking.corvus.semiotics.IMarker;
import us.coastalhacking.corvus.semiotics.MarkerEntryPoint;
import us.coastalhacking.corvus.semiotics.Root;
import us.coastalhacking.corvus.semiotics.SemioticsFactory;
import us.coastalhacking.corvus.semiotics.SemioticsPackage;

@Component(service = TriggerListener.class, configurationPid = EclipseApi.TriggerListener.EntryPoint.Component.CONFIG_PID, configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public class MarkerToEntryPointProvider extends TriggerListener {

	private String transId;
	private TransactionalEditingDomain domain;
	private NotificationFilter filter;
	URI epLogicalUri;

	public MarkerToEntryPointProvider() {
		filter = NotificationFilter.createFeatureFilter(SemioticsPackage.Literals.IRESOURCE__MARKERS);
		epLogicalUri = URI.createURI(EmfApi.ResourceInitializer.EntryPoint.Properties.LOGICAL);
	}

	@Reference(name = EmfApi.CorvusTransactionalRegistry.Reference.NAME)
	Registry registry;

	@Activate
	void activate(Map<String, Object> props) {
		transId = (String) props.get(EmfApi.TransactionalEditingDomain.Properties.ID);
		domain = registry.getEditingDomain(transId);
		domain.addResourceSetListener(this);
	}

	@Deactivate
	void deactivate() {
		domain.removeResourceSetListener(this);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Command trigger(TransactionalEditingDomain domain, Notification notification) {

		switch (notification.getEventType()) {
		case Notification.ADD_MANY:
		case Notification.ADD: {
			if (notification.getFeature().equals(SemioticsPackage.Literals.IRESOURCE__MARKERS)) {
				Collection<IMarker> markers;
				if (notification.getEventType() == Notification.ADD_MANY) {
					markers = (List<IMarker>) notification.getNewValue();
				} else {
					markers = Collections.singleton((IMarker) notification.getNewValue());
				}
				return generateForMarkers(domain, epLogicalUri, markers);
			}
		}
		default: {
			break;
		}
		}
		return null;
	}

	Command generateForMarkers(TransactionalEditingDomain domain, URI uri, Collection<IMarker> markers) {
		// TODO: ensure resource caching is enabled
		final Resource epResource = domain.getResourceSet().getResource(uri, true);
		final Root root = (Root) epResource.getContents().get(0);
		final CompoundCommand result = new CompoundCommand();
		for (IMarker marker : markers) {
			MarkerEntryPoint ep = SemioticsFactory.eINSTANCE.createMarkerEntryPoint();
			result.append(AddCommand.create(domain, root, SemioticsPackage.Literals.ROOT__SEMIOTICS, ep));
			result.append(AddCommand.create(domain, ep, SemioticsPackage.Literals.SIGNIFIED__SIGNIFIERS, marker));
			result.append(AddCommand.create(domain, marker, SemioticsPackage.Literals.SIGNIFIER__SIGNIFIEDS, ep));
		}
		return result;
	}

	@Override
	public NotificationFilter getFilter() {
		return filter;
	}
}
