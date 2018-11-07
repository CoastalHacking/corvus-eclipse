package us.coastalhacking.corvus.eclipse.transaction;

import java.util.Map;

import org.eclipse.emf.common.util.URI;

public abstract class BaseResourceInitializer implements ResourceInitializer {

	protected URI logical;
	protected URI physical;

	protected void baseActivate(Map<String, Object> props, String logicalKey, String physicalKey) {
		final String logicalUri = (String) props.get(logicalKey);
		final String physicalUri = (String) props.get(physicalKey);
		logical = URI.createURI(logicalUri);
		physical = URI.createPlatformResourceURI(physicalUri, true);
	}

	@Override
	public URI getLogical() {
		return logical;
	}

	@Override
	public URI getPhysical() {
		return physical;
	}

}
