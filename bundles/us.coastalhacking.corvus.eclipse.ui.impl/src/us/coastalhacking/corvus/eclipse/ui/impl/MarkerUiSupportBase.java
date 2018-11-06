package us.coastalhacking.corvus.eclipse.ui.impl;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import org.eclipse.core.resources.IResource;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.ide.ResourceUtil;

import us.coastalhacking.corvus.eclipse.resources.MarkerSupport;
import us.coastalhacking.corvus.eclipse.resources.MarkerSupport.Coordinate;
import us.coastalhacking.corvus.eclipse.ui.MarkerUiSupport;

class MarkerUiSupportBase implements MarkerUiSupport {

	protected MarkerSupport getMarkerSupport() {
		throw new UnsupportedOperationException("Not implemented");
	}

	protected IEclipseContext getEclipseContext() {
		throw new UnsupportedOperationException("Not implemented");
	}

	@Override
	public Future<IResource> getActiveEditorResource() {
		final CompletableFuture<IResource> future = new CompletableFuture<>();
		try {
			UISynchronize uiSync = getEclipseContext().get(UISynchronize.class);
			// The active window only can be obtained via the UI thread
			uiSync.asyncExec(() -> {
				populateResource(future);
			});
		} catch (Exception e) {
			future.completeExceptionally(e);
		}
		return future;
	}

	void populateResource(CompletableFuture<IResource> future) {
		try {
			final IWorkbench workbench = getEclipseContext().get(IWorkbench.class);
			final IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
			final IWorkbenchPage page = window.getActivePage();
			final IEditorPart editor = page.getActiveEditor();
			IResource resource = ResourceUtil.getResource(editor.getEditorInput());
			if (resource != null) {
				future.complete(resource);
			} else {
				future.completeExceptionally(new NullPointerException(
						"ResourceUtil.getResource returned null for the active editor input."));
			}
		} catch (Exception e) {
			future.completeExceptionally(e);
		}
	}

	@Override
	public Optional<Coordinate> getSelectedCoordinate() throws Exception {

		ESelectionService selectionService = getEclipseContext().get(ESelectionService.class);
		Object selection = selectionService.getSelection();
		if (selection instanceof ITextSelection) {
			return Optional.of(new TextSelectionCoordinate((ITextSelection) selection));
		}
		return Optional.empty();
	}

	protected class TextSelectionCoordinate implements Coordinate {

		private final int charStart;
		private final int charEnd;
		private final int lineStart;
		private final String message;

		public TextSelectionCoordinate(ITextSelection textSelection) {
			charStart = textSelection.getOffset();
			charEnd = textSelection.getOffset() + textSelection.getLength();
			lineStart = textSelection.getStartLine();
			message = textSelection.getText();
		}

		@Override
		public int charStart() {
			return charStart;
		}

		@Override
		public int charEnd() {
			return charEnd;
		}

		@Override
		public int lineNumber() {
			return lineStart;
		}

		@Override
		public String selected() {
			return message;
		}
	}

}
