package us.coastalhacking.corvus.eclipse.launcher;

import org.eclipse.emf.ecore.EObject;

public interface ResourceInitializer {

	EObject getRoot();

	String getUriKey();

	String getPathKey();

}
