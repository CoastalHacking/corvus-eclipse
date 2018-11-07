package us.coastalhacking.corvus.eclipse.resources.provider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.Future;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.resources.MarkerProvider;
import us.coastalhacking.corvus.eclipse.resources.MarkerSupport;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractProjectTest;

class MarkerSupportBaseTest extends AbstractProjectTest {

	public MarkerSupportBaseTest() throws Exception {
		super();
	}

	final String expectedKey = "someKey";
	final String expectedValue = "us.coastalhacking.corvus.eclipse.resources.marker";
	final MarkerProvider provider = new MarkerProvider() {
		@Override
		public String getKey() {
			return expectedKey;
		}

		@Override
		public String getValue() {
			return expectedValue;
		}
	};

	@Test
	void shouldAddMarkerProvider() {
		MarkerSupportBase base = new MarkerSupportBase();
		synchronized (base.markerKeysIds) {
			assertTrue(base.markerKeysIds.isEmpty());
		}
		base.addMarkerProvider(provider);
		synchronized (base.markerKeysIds) {
			assertFalse(base.markerKeysIds.isEmpty());
			assertEquals(expectedValue, base.markerKeysIds.get(expectedKey));
		}
	}

	@Test
	void shouldRemoveMarkerProvider() {
		MarkerSupportBase base = new MarkerSupportBase();
		base.addMarkerProvider(provider);
		synchronized (base.markerKeysIds) {
			assertFalse(base.markerKeysIds.isEmpty());
		}
		base.removeMarkerProvider(provider);
		synchronized (base.markerKeysIds) {
			assertTrue(base.markerKeysIds.isEmpty());
		}
	}

	@Test
	void shouldBeSupported() {
		MarkerSupportBase base = new MarkerSupportBase();
		base.addMarkerProvider(provider);
		assertTrue(base.isSupported(expectedKey));
	}

	@Test
	void shouldGetMarkerId() {
		MarkerSupportBase base = new MarkerSupportBase();
		base.addMarkerProvider(provider);
		assertEquals(expectedValue, base.getMarkerId(expectedKey));
	}

	@Test
	void shouldGetMarkerKey() {
		MarkerSupportBase base = new MarkerSupportBase();
		base.addMarkerProvider(provider);
		assertEquals(expectedKey, base.getMarkerKey(expectedValue));
	}

	@Test
	void shouldCreateMarker() throws Exception {

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		MarkerSupportBase base = new MarkerSupportBase() {
			@Override
			protected IWorkspace getWorkspace() {
				return workspace;
			}
		};

		base.addMarkerProvider(provider);
		String selected = "This";
		int lineNumber = 1;
		int charStart = 0;
		int charEnd = 4;
		MarkerSupport.Coordinate coordinate = new MarkerSupport.Coordinate() {
			
			@Override
			public String selected() {
				return selected;
			}
			
			@Override
			public int lineNumber() {
				return lineNumber;
			}
			
			@Override
			public int charStart() {
				return charStart;
			}
			
			@Override
			public int charEnd() {
				return charEnd;
			}
		};
		String expectedText = "This is text";
		String filename = "shouldGetRule";
		final IFile file = createFile(filename, expectedText);
		
		// Call and verify
		IMarker[] markers = file.findMarkers(expectedValue, true, IResource.DEPTH_ZERO);
		assertEquals(0, markers.length);
		Future<Void> future = base.createMarker(coordinate, file.getFullPath().toPortableString(), expectedKey);
		future.get();
		assertTrue(future.isDone());
		markers = file.findMarkers(expectedValue, true, IResource.DEPTH_ZERO);
		assertEquals(1, markers.length);
		IMarker marker = markers[0];
		assertEquals(expectedValue, marker.getType());

	}

}
