package us.coastalhacking.corvus.eclipse.transaction;

import org.eclipse.emf.common.util.URI;

public abstract class BaseResourceInitializer implements ResourceInitializer {

	protected URI logical;
	protected URI physical;

	protected void baseActivate(String logicalUri, String physicalUri) {
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
