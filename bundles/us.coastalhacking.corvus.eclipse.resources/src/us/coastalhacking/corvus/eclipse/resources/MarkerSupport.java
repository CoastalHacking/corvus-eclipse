package us.coastalhacking.corvus.eclipse.resources;

import java.util.concurrent.Future;

public interface MarkerSupport {

	interface Coordinate {

		/**
		 * Zero-relative and inclusive
		 * 
		 * @see org.eclipse.core.resources.IMarker#CHAR_START IMarker.CHAR_START
		 */
		int charStart();

		/**
		 * Zero-relative and exclusive
		 * 
		 * @see org.eclipse.core.resources.IMarker#CHAR_END IMarker.CHAR_END
		 */
		int charEnd();

		/**
		 * The line number, 1-relative
		 * 
		 * @return For non-line terminating documents (i.e. binary), returns
		 *         <code>1</code>
		 * @see org.eclipse.core.resources.IMarker#LINE_NUMBER IMarker.LINE_NUMBER
		 */
		int lineNumber();
		
		/**
		 * The selected text
		 * 
		 * @return the selected text
		 */
		String selected();
	}

	/**
	 * Given a marker key, return if the key is supported or not
	 * 
	 * @return
	 */
	boolean isSupported(String markerKey);

	/**
	 * Given a supported marker key, return its extension ID
	 * 
	 * The extension ID is defined via the Eclipse plugin
	 * 
	 * @param markerKey
	 * @return Optionally a marker type ID or empty
	 * @see <a href=
	 *      "https://help.eclipse.org/oxygen/topic/org.eclipse.platform.doc.isv/reference/extension-points/org_eclipse_core_resources_markers.html?cp=2_1_1_19">org.eclipse.core.resources.markers</a>
	 */
	String getMarkerId(String markerKey);

	String getMarkerKey(String markerId);

	Future<Void> createMarker(Coordinate coordinate, String resourceFullPath, String markerKey);	
}
