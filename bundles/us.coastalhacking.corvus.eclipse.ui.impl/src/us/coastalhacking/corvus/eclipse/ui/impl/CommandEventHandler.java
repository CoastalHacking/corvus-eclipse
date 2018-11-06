package us.coastalhacking.corvus.eclipse.ui.impl;

import org.eclipse.core.resources.IResource;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

import us.coastalhacking.corvus.eclipse.resources.MarkerSupport;
import us.coastalhacking.corvus.eclipse.resources.MarkerSupport.Coordinate;
import us.coastalhacking.corvus.eclipse.ui.EclipseUiApi;
import us.coastalhacking.corvus.eclipse.ui.MarkerUiSupport;

@Component(service = EventHandler.class, property = {
		EventConstants.EVENT_TOPIC + "=" + EclipseUiApi.Event.Marker.TOPIC_ALL })
public class CommandEventHandler implements EventHandler {

	@Reference
	MarkerSupport markerSupport;
	
	@Reference
	MarkerUiSupport markerUiSupport;

	@Override
	public void handleEvent(Event event) {
		final String markerKey = (String) event.getProperty(EclipseUiApi.Event.Marker.PROP_TYPE);

		Coordinate coordinate;
		try {
			coordinate = markerUiSupport.getSelectedCoordinate().get();
			IResource resource = markerUiSupport.getActiveEditorResource().get();
			switch (event.getTopic()) {
			case EclipseUiApi.Event.Marker.TOPIC_ADD:
				markerSupport.createMarker(coordinate, resource.getFullPath().toPortableString(), markerKey);
				break;
			default:
				throw new UnsupportedOperationException("Invalid topic: " + event.getTopic());			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}

}
