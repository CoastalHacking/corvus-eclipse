package us.coastalhacking.corvus.eclipse.ui;

import java.util.Optional;
import java.util.concurrent.Future;

import org.eclipse.core.resources.IResource;

import us.coastalhacking.corvus.eclipse.resources.MarkerSupport.Coordinate;;

public interface MarkerUiSupport {

	/**
	 * Obtain the resource via the active editor
	 * 
	 * @return A future which completes with either the resource or exceptionally
	 *  
	 * @throws Exception
	 */
	Future<IResource> getActiveEditorResource();

	Optional<Coordinate> getSelectedCoordinate() throws Exception;
	
}
