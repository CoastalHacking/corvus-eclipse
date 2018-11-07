package us.coastalhacking.corvus.eclipse.resources;

import java.util.Map;

public class BaseMarkerProvider implements MarkerProvider {

	protected String key;
	protected String value;

	protected void baseActivate(Map<String, Object> props) {
		key = (String) props.get(EclipseResourcesApi.MarkerProvider.Properties.KEY);
		value = (String) props.get(EclipseResourcesApi.MarkerProvider.Properties.VALUE);
	}
	
	@Override
	public String getKey() {
		return key;
	}

	@Override
	public String getValue() {
		return value;
	}
}
