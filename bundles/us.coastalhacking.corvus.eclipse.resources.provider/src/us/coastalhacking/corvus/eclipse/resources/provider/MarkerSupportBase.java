package us.coastalhacking.corvus.eclipse.resources.provider;

import java.text.MessageFormat;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.WorkspaceJob;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;

import us.coastalhacking.corvus.eclipse.resources.MarkerProvider;
import us.coastalhacking.corvus.eclipse.resources.MarkerResourceJob;
import us.coastalhacking.corvus.eclipse.resources.MarkerSupport;

public class MarkerSupportBase implements MarkerSupport {

	protected String id;

	protected BiMap<String, String> markerKeysIds = Maps.synchronizedBiMap(
		       HashBiMap.<String, String>create());

	protected IWorkspace getWorkspace() {
		throw new UnsupportedOperationException("Not implemented");
	}

	protected void addMarkerProvider(MarkerProvider provider) {
		synchronized (markerKeysIds) {
			markerKeysIds.put(provider.getKey(), provider.getValue());
		}
	}
	
	protected void removeMarkerProvider(MarkerProvider provider) {
		synchronized (markerKeysIds) {
			markerKeysIds.remove(provider.getKey());
		}
	}

	@Override
	public boolean isSupported(String markerKey) {
		boolean result;
		synchronized (markerKeysIds) {
			result = markerKeysIds.containsKey(markerKey);
		}
		return result;
	}

	@Override
	public String getMarkerId(String markerKey) {
		String result;
		synchronized (markerKeysIds) {
			result = markerKeysIds.get(markerKey);
		}
		return result;
	}

	@Override
	public String getMarkerKey(String markerId) {
		String result;
		synchronized (markerKeysIds) {
			result = markerKeysIds.inverse().get(markerId);
		}
		return result;
	}

	@Override
	public Future<Void> createMarker(Coordinate coordinate, String resourceFullPath, String markerKey) {

		final CompletableFuture<Void> future = new CompletableFuture<>();
		// TODO: add a logging callback to the future via thenAccept
		future.exceptionally(ex -> {
			ex.printStackTrace();
			return null;
		});

		try {
			if (!isSupported(markerKey)) {
				throw new IllegalArgumentException(MessageFormat.format("Attempting to create a marker with an unsupported key {0}", markerKey));
			}

			final String markerId = getMarkerId(markerKey);
			final IResource resource = getWorkspace().getRoot().findMember(resourceFullPath);
			if (resource == null || !resource.exists()) {
				throw new IllegalArgumentException(MessageFormat.format("Attempting to create a marker on an non-existant resource {0}", resourceFullPath));				
			}
			
			final WorkspaceJob job = new MarkerResourceJob(id, future, markerId, resource, coordinate);
			job.setRule(resource);
			job.schedule();
		} catch (Exception e) {
			future.completeExceptionally(e);
		}
		return future;
	}
}
