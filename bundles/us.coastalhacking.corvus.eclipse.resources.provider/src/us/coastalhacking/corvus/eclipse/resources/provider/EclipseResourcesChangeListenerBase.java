package us.coastalhacking.corvus.eclipse.resources.provider;

import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesChangeListener;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesFactory;
import us.coastalhacking.corvus.eclipse.resources.IMarker;
import us.coastalhacking.corvus.eclipse.resources.IResource;
import us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot;

class EclipseResourcesChangeListenerBase implements EclipseResourcesChangeListener {

	private String markerType;
	private TransactionalEditingDomain domain;
	private URI uri;
	private EclipseResourcesFactory factory = EclipseResourcesFactory.eINSTANCE;
	static final String UNCONTAINED = "/-1";
	static final String EMPTY = "";

	/**
	 * Shall be called prior to any other methods
	 */
	void baseActivate(String markerType, TransactionalEditingDomain domain, String uriKey) {
		this.markerType = markerType;
		this.domain = domain;
		this.uri = URI.createURI(uriKey);
	}

	// TODO: process IResource changes.
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		if (event.getType() != IResourceChangeEvent.POST_CHANGE) {
			return;
		}

		final IMarkerDelta[] deltas = event.findMarkerDeltas(markerType, true);
		if (deltas.length == 0) {
			return;
		}

		final RecordingCommand command = new RecordingCommand(domain, "Marker change", "Marker change") {
			@Override
			protected void doExecute() {
				final Resource existingResource = domain.getResourceSet().getResource(uri, true);
				processIMarkerDeltas(deltas, factory, existingResource);
			}
		};
		domain.getCommandStack().execute(command);
	}

	void processIMarkerDeltas(IMarkerDelta[] deltas, EclipseResourcesFactory factory, Resource existingResource) {
		final IWorkspaceRoot modelRoot = factory.createIWorkspaceRoot();
		final Resource modelResource = new ResourceImpl();
		modelResource.getContents().add(modelRoot);

		final IWorkspaceRoot existingRoot = (IWorkspaceRoot) existingResource.getContents().get(0);

		for (IMarkerDelta delta : deltas) {
			final org.eclipse.core.resources.IResource deltaResource = delta.getResource();
			final String portableFullPath = deltaResource.getFullPath().toPortableString();
			final IResource modelIResource = factory.createIResource();
			modelIResource.setFullPath(portableFullPath);
			modelIResource.setRoot(modelRoot);

			// Now process the marker change
			final IMarker modelMarker = factory.createIMarker();
			modelMarker.setId(delta.getId());

			switch (delta.getKind()) {
			case IResourceDelta.ADDED: {
				final String fragment = getFragment(modelRoot, modelIResource);
				final IResource existingIResource = getOrCreateExistingResource(fragment, existingRoot, modelIResource);
				added(delta, existingIResource, modelMarker);
				break;
			}
			case IResourceDelta.REMOVED: {
				Optional<IMarker> maybeMarker = getExistingMarker(existingResource, modelIResource, modelMarker);
				removed(maybeMarker);
				break;
			}
			case IResourceDelta.CHANGED: {
				Optional<IMarker> maybeMarker = getExistingMarker(existingResource, modelIResource, modelMarker);
				changed(delta, maybeMarker);
				break;
			}
			default:
				// TODO log - unsupported
			}
		}
	}

	Optional<IMarker> getExistingMarker(Resource existingResource, IResource modelIResource,
			IMarker modelMarker) {

		// Hack to generate the fragment
		modelIResource.getMarkers().add(modelMarker);
		String markerFragment = modelIResource.eResource().getURIFragment(modelMarker);
		modelIResource.getMarkers().remove(modelMarker);

		try {
			return Optional.of((IMarker) existingResource.getEObject(markerFragment));
		} catch (Exception e) {
		}
		return Optional.empty();
	}

	String getFragment(IWorkspaceRoot root, IResource iResource) {
		// Hack: Add to our local resource so we can generate the expected fragment
		String fragment = root.eResource().getURIFragment(iResource);
		if (UNCONTAINED.equals(fragment)) {
			root.getMembers().add(iResource);
			fragment = root.eResource().getURIFragment(iResource);
		}
		return fragment;
	}

	IResource getOrCreateExistingResource(String fragment, IWorkspaceRoot existingRoot, IResource modelIResource) {
		IResource existingIResource;
		try {
			existingIResource = (IResource) existingRoot.eResource().getEObject(fragment);
		} catch (Exception e) {
			existingIResource = null;
		}
		if (existingIResource == null) {
			final Copier copier = new Copier();
			existingIResource = (IResource) copier.copy(modelIResource);
			copier.copyReferences();
			existingRoot.getMembers().add(existingIResource);
		}
		return existingIResource;
	}

	void added(IMarkerDelta delta, IResource existingIResource, IMarker modelMarker) {

		// attributes
		for (Map.Entry<String, Object> entry : delta.getAttributes().entrySet()) {
			modelMarker.getAttributes().put(entry.getKey(), entry.getValue().toString());
		}

		// type
		modelMarker.setType(delta.getType());

		// creation time (from existing marker)
		try {
			modelMarker.setCreationTime(delta.getMarker().getCreationTime());
		} catch (CoreException e) {
			// TODO log - post-change event but couldn't get creation time
		}

		// Then add to the resource
		modelMarker.setResource(existingIResource);
	}

	void removed(Optional<IMarker> maybeMarker) {
		if (maybeMarker.isPresent()) {
			EcoreUtil.delete(maybeMarker.get());
		} else {
			// TODO log - attempted to delete a marker that doesn't exist
		}
	}

	// TODO: refactor to remove explicit resource params if possible via .eResource()
	void changed(IMarkerDelta delta, Optional<IMarker> maybeMarker) {
		if (maybeMarker.isPresent()) {
			IMarker existingMarker = maybeMarker.get();

			// type
			try {
				if (!delta.getMarker().getType().equals(delta.getType())) {
					existingMarker.setType(delta.getMarker().getType());
				}
			} catch (CoreException e) {
				// TODO log - post-change event but couldn't get existing marker type
			}

			// attributes
			try {
				Map<String, Object> newAttr = delta.getMarker().getAttributes();
				Map<String, Object> oldAttr = delta.getAttributes();

				// Remove
				Set<String> toRemove = new HashSet<>(oldAttr.keySet());
				toRemove.removeIf(s -> newAttr.containsKey(s));
				existingMarker.getAttributes().removeIf(e -> toRemove.contains(e.getKey()));

				// Add and Change
				Set<String> toAddChange = new HashSet<>(oldAttr.keySet());
				toAddChange.removeAll(toRemove);
				toAddChange
				.removeIf(s -> Optional.ofNullable(oldAttr.get(s)).equals(Optional.ofNullable(newAttr.get(s))));

				Set<String> toAdd = new HashSet<>(newAttr.keySet());
				toAdd.removeIf(s -> oldAttr.containsKey(s));
				toAddChange.addAll(toAdd);

				for (String key : toAddChange) {
					Object valueObj = newAttr.get(key);
					String value = valueObj == null ? EMPTY : valueObj.toString();
					existingMarker.getAttributes().put(key, value);
				}
			} catch (CoreException e) {
				// TODO log - could not get attributes from an existing marker
				return;
			}

		} else {
			// TODO log - attempted to change a marker that doesn't exist
		}
	}

}
