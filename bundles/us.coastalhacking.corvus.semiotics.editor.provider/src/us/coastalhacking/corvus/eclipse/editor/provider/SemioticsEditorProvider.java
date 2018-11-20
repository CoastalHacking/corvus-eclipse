package us.coastalhacking.corvus.eclipse.editor.provider;

import java.text.MessageFormat;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.adapter.Adapter;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.TransactionalEditingDomain.Registry;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import us.coastalhacking.corvus.emf.EmfApi;
import us.coastalhacking.corvus.semiotics.editor.SemioticsEditor;

@SuppressWarnings("restriction")
@Component(factory = "us.coastalhacking.corvus.semiotics.editor.SemioticsEditor")
public class SemioticsEditorProvider extends SemioticsEditor {

	@Reference
	IWorkbench workbench;
	// Set by above
	IEclipseContext e4Context;
	ESelectionService selectionService;

	@Reference(name = EmfApi.CorvusTransactionalRegistry.Reference.NAME)
	Registry registry;

	@Activate
	void activate(Map<String, Object> props) {
		e4Context = workbench.getApplication().getContext();
		selectionService = e4Context.get(ESelectionService.class);
		Object selection = selectionService.getSelection();
		Adapter adapter = e4Context.get(Adapter.class);
		IStructuredSelection structured = adapter.adapt(selection, IStructuredSelection.class);
		IResource resource = adapter.adapt(structured.getFirstElement(), IResource.class);
		if (resource != null) {
			// TODO: move to util project
			// also see CorvusTabProvider.performApply
			String projectName = resource.getProject().getFullPath().toPortableString();
			String encodedProjectName = URI.encodeSegment(projectName, true);
			EditingDomain transactional = registry.getEditingDomain(encodedProjectName);
			if (transactional == null) {
				throw new IllegalStateException(
						MessageFormat.format("No editing domain found for project {0}", projectName));
			} else {
				if (transactional instanceof AdapterFactoryEditingDomain) {
					editingDomain = (AdapterFactoryEditingDomain) transactional;
					if (editingDomain.getAdapterFactory() instanceof ComposedAdapterFactory) {
						adapterFactory = (ComposedAdapterFactory) editingDomain.getAdapterFactory();
					} else {
						throw new IllegalStateException(MessageFormat.format(
								"Editing domain for project {0} does not used composed adapter factories",
								projectName));
					}
				} else {
					throw new IllegalStateException(MessageFormat.format(
							"Editing domain for project {0} is not an instance of AdapterFactoryEditingDomain",
							projectName));
				}
			}
		} else {
			throw new IllegalStateException("No resource selected, no way to determine project");
		}
	}

	@Override
	protected void initializeEditingDomain() {
		// Do nothing, initialized during activation\
	}
 }
