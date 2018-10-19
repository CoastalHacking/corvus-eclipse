package us.coastalhacking.corvus.eclipse.transaction;

import org.eclipse.emf.ecore.EObject;

public class ResourceInitializerBase implements ResourceInitializer {

	protected String uriKey;
	protected String pathKey;
	protected EObject root;

	@Override
	public String getUriKey() {
		return uriKey;
	}

	public void setUriKey(String uriKey) {
		this.uriKey = uriKey;
	}

	@Override
	public String getPathKey() {
		return pathKey;
	}

	public void setPathKey(String pathKey) {
		this.pathKey = pathKey;
	}

	@Override
	public EObject getRoot() {
		return root;
	}

	public void setRoot(EObject root) {
		this.root = root;
	}

}
