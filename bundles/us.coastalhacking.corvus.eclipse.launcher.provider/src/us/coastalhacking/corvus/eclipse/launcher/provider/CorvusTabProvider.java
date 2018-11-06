package us.coastalhacking.corvus.eclipse.launcher.provider;

import java.nio.file.Paths;
import java.time.Instant;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import us.coastalhacking.corvus.eclipse.launcher.CorvusLaunchApi;
import us.coastalhacking.corvus.eclipse.launcher.CorvusTab;

@Component(service=CorvusTab.class, scope=ServiceScope.PROTOTYPE)
public class CorvusTabProvider extends AbstractLaunchConfigurationTab implements CorvusTab {

	@Reference
	IWorkspace workspace;
	
	ButtonListener buttonListener = new ButtonListener();
	
	private static final String PROJECT_NAME = "corvus.tab.provider.project";

	Text projectText;
	
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// called once
		String transactionId = String.format("corvus.transaction.%s", Instant.now().toEpochMilli());
		configuration.rename(transactionId);
		configuration.setAttribute(CorvusLaunchApi.TransactionalEditingDomain.Properties.ID, transactionId);
		configuration.setAttribute(CorvusLaunchApi.EclipseResourcesInitializer.Properties.LOGICAL, CorvusLaunchApi.EclipseResourcesInitializer.Properties.DEFAULT_LOGICAL);
		configuration.setAttribute(CorvusLaunchApi.EclipseResourcesChangeListener.Properties.MARKER_TYPE, CorvusLaunchApi.BASE_MARKER);
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		// called once
		String projectName = null;
		try {
			projectName = configuration.getAttribute(PROJECT_NAME, projectName);
			if (projectName != null) {
				IProject maybeProject = workspace.getRoot().getProject(projectName);
				if (maybeProject != null) {
					projectText.setText(projectName);
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		if (!projectText.getText().isEmpty()) {
			String projectName = projectText.getText();
			// TODO: use eclipse resources here instead of JRE
			// TODO: change URI from file to project in resource initializer when creating URIs
			java.nio.file.Path path = Paths.get(projectName, "corvus.eclipseResources");
			configuration.setAttribute(CorvusLaunchApi.EclipseResourcesInitializer.Properties.PHYSICAL, path.toAbsolutePath().toString());
			configuration.setAttribute(PROJECT_NAME, projectName);

		}
	}

	@Override
	public String getName() {
		return "Corvus";
	}

	@Override
	public void createControl(Composite parent) {
        Composite comp = new Group(parent, SWT.BORDER);
        setControl(comp);

        GridLayoutFactory.swtDefaults().numColumns(3).applyTo(comp);

        // Project
        Label label = new Label(comp, SWT.NONE);
        label.setText("Project:");
        GridDataFactory.swtDefaults().applyTo(label);

        projectText = new Text(comp, SWT.BORDER);
        projectText.addModifyListener(buttonListener);
        GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(true,false).applyTo(projectText);
        
        Button button = new Button(comp, SWT.PUSH);
        button.setFont(comp.getFont());
        button.setText("Browse...");
        button.addSelectionListener(buttonListener);
        GridDataFactory.swtDefaults().applyTo(button);        
	}
	
	public class ButtonListener implements SelectionListener, ModifyListener {

		@Override
		public void modifyText(ModifyEvent e) {
			updateLaunchConfigurationDialog();
		}

		@Override
		public void widgetSelected(SelectionEvent e) {
			ILabelProvider labelProvider = new ProjectLabelProvider();
			ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), labelProvider);
			dialog.setTitle("Corvus Project Selection");
			dialog.setMessage("Select a project to store Corvus files");

			dialog.setElements(workspace.getRoot().getProjects());
			if (dialog.open() == Window.OK) {
				IProject project = (IProject) dialog.getFirstResult();
				if (project != null) {
					String projectName = project.getFullPath().toPortableString();
					CorvusTabProvider.this.projectText.setText(projectName);
				}
			}
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		}
	}

	public class ProjectLabelProvider extends LabelProvider { 
		@Override
		public String getText(Object element) {
			if (element instanceof IProject) {
				return ((IProject)element).getFullPath().toPortableString();
			}
			return null;
		}
	}

	
}
