package us.coastalhacking.corvus.eclipse.resources.provider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.MultiRule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.ChangeFactory;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.transaction.TransactionChangeDescription;
import org.junit.jupiter.api.Test;

class ResourceModifiedListenerBaseTest {

	@Test
	void shouldGetRule() throws Exception {
		// Mock and setup
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProject project = workspace.getRoot().getProject(getClass().getName());
		project.create(null);
		project.open(null);
		final IFile file = project.getFile("shouldGetRule");
		String expectedText = "This is text";
		file.create(new ByteArrayInputStream(expectedText.getBytes()), false, null);

		URI physical = URI.createPlatformResourceURI(file.getFullPath().toPortableString(), true);
		assertTrue(physical.isPlatform());
		Set<URI> uris = new HashSet<>();
		uris.add(physical);

		ISchedulingRule modifyResource = workspace.getRuleFactory().modifyRule(file);

		ResourceModifiedListenerBase base = new ResourceModifiedListenerBase() {
			@Override
			protected IWorkspace getWorkspace() {
				return workspace;
			}
		};

		// Execute and verify
		ISchedulingRule rule = base.getRule(uris);
		assertTrue(rule instanceof MultiRule);
		MultiRule multiRule = (MultiRule) rule;
		assertTrue(multiRule.contains(modifyResource));
	}

	@Test
	void shouldAddUris() {
		URI physical = mock(URI.class);
		when(physical.isPlatform()).thenReturn(true);
		URI logical = mock(URI.class);
		URIConverter converter = mock(URIConverter.class);
		when(converter.normalize(logical)).thenReturn(physical);
		ResourceSet rs = mock(ResourceSet.class);
		when(rs.getURIConverter()).thenReturn(converter);
		Resource resource = mock(Resource.class);
		when(resource.getURI()).thenReturn(logical);
		when(resource.getResourceSet()).thenReturn(rs);
		EObject eObject = mock(EObject.class);
		when(eObject.eResource()).thenReturn(resource);

		TransactionChangeDescription changeDescription = mock(TransactionChangeDescription.class);
		ChangeDescription description = ChangeFactory.eINSTANCE.createChangeDescription();
		Map.Entry<EObject, EList<FeatureChange>> entry = ChangeFactory.eINSTANCE
				.createEObjectToChangesMapEntry(eObject);
		description.getObjectChanges().add(entry);
		when(changeDescription.getObjectChanges()).thenReturn(description.getObjectChanges());

		// Call & verify
		Set<URI> set = new HashSet<>();
		ResourceModifiedListenerBase base = new ResourceModifiedListenerBase();
		base.addUris(set, changeDescription);
		assertEquals(1, set.size());
		assertTrue(set.contains(physical));
	}

}
