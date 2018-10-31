package us.coastalhacking.corvus.eclipse.transaction;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public interface ResourceInitializer {

	EObject getRoot();

	/**
	 * Return the logical URI
	 * 
	 * @return the logical URI
	 */
	URI getLogical();

	/**
	 * Return the physical URI 
	 * 
	 * @return the physical URI
	 */
	URI getPhysical();

}
