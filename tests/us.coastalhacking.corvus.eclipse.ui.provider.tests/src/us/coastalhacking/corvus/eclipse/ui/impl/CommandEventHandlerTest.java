package us.coastalhacking.corvus.eclipse.ui.impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Future;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.junit.jupiter.api.Test;
import org.osgi.framework.Constants;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

import us.coastalhacking.corvus.eclipse.resources.MarkerSupport;
import us.coastalhacking.corvus.eclipse.resources.MarkerSupport.Coordinate;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractCMTest;
import us.coastalhacking.corvus.eclipse.ui.EclipseUiApi;
import us.coastalhacking.corvus.eclipse.ui.MarkerUiSupport;

class CommandEventHandlerTest extends AbstractCMTest {

	public CommandEventHandlerTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {
		// Verify dependencies
		MarkerSupport markerSupport = serviceTrackerHelper(MarkerSupport.class);
		assertNotNull(markerSupport);
		MarkerUiSupport uiSupport = serviceTrackerHelper(MarkerUiSupport.class);
		assertNotNull(uiSupport);
		
		Map<String, Object> props = new HashMap<>();
		props.put(EventConstants.EVENT_TOPIC, EclipseUiApi.Event.Marker.TOPIC_ALL);
		props.put(Constants.OBJECTCLASS, EventHandler.class.getName());
		Object object = serviceTrackerHelper(props);
		assertNotNull(object);
		assertTrue(object instanceof EventHandler);
	}
	
	@Test
	void shouldHandleEvent() throws Exception {

		// Prep & mock
		Coordinate coordinate = mock(Coordinate.class);
		Optional<Coordinate> maybeCoordinate = Optional.of(coordinate);
		MarkerUiSupport uiSupport = mock(MarkerUiSupport.class);
		when(uiSupport.getSelectedCoordinate()).thenReturn(maybeCoordinate);
		IPath path = mock(IPath.class);
		String fullPath = "/project/resource";
		when(path.toPortableString()).thenReturn(fullPath);
		IResource resource = mock(IResource.class);
		when(resource.getFullPath()).thenReturn(path);
		@SuppressWarnings("unchecked")
		Future<IResource> future = mock(Future.class);
		when(future.get()).thenReturn(resource);
		when(uiSupport.getActiveEditorResource()).thenReturn(future);
		Map<String, Object> map = new HashMap<>();
		String markerKey = "markerKey";
		map.put(EclipseUiApi.Event.Marker.PROP_TYPE, markerKey);
		MarkerSupport support = mock(MarkerSupport.class);
		CommandEventHandler eventHandler = new CommandEventHandler();
		eventHandler.markerSupport = support;
		eventHandler.markerUiSupport = uiSupport;
		Event event = new Event(EclipseUiApi.Event.Marker.TOPIC_ADD, map);

		// Call & verify
		eventHandler.handleEvent(event);		
		verify(support, times(1)).createMarker(coordinate, fullPath, markerKey);
	}

}
