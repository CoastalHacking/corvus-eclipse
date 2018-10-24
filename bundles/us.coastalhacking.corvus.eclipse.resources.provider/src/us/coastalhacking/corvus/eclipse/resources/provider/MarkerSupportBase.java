package us.coastalhacking.corvus.eclipse.resources.provider;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.WorkspaceJob;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.Streams;

import us.coastalhacking.corvus.eclipse.resources.MarkerResourceJob;
import us.coastalhacking.corvus.eclipse.resources.MarkerSupport;

public abstract class MarkerSupportBase implements MarkerSupport {

	protected String id;

	protected BiMap<String, String> markerKeysIds;

	protected abstract IWorkspace getWorkspace();



	protected void activate(String[] markerKeys, String[] markerIds) {
		assert markerKeys.length == markerIds.length;
		markerKeysIds = ImmutableBiMap.copyOf(Streams
				.zip(Arrays.stream(markerKeys), Arrays.stream(markerIds),
						(key, id) -> new AbstractMap.SimpleEntry<String, String>(key, id))
				.collect(Collectors.toList()));
	}

	protected void deactivate() {
		markerKeysIds = null;
	}

	@Override
	public boolean isSupported(String markerKey) {
		return markerKeysIds.containsKey(markerKey);
	}

	@Override
	public String getMarkerId(String markerKey) {
		return markerKeysIds.get(markerKey);
	}

	@Override
	public String getMarkerKey(String markerId) {
		return markerKeysIds.inverse().get(markerId);
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
				throw new UnsupportedOperationException("Unsupported marker key " + markerKey);
			}

			final String markerId = getMarkerId(markerKey);
			final IResource resource = getWorkspace().getRoot().findMember(resourceFullPath);
			final WorkspaceJob job = new MarkerResourceJob(id, future, markerId, resource, coordinate);
			job.setRule(resource);
			job.schedule();
		} catch (Exception e) {
			future.completeExceptionally(e);
		}
		return future;
	}
}
