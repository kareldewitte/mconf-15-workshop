package info.magnolia.vimeogration.presenters;

import com.google.inject.Inject;
import info.magnolia.objectfactory.ComponentProvider;
import info.magnolia.ui.workbench.ContentPresenter;
import info.magnolia.ui.workbench.list.ListPresenter;
import info.magnolia.ui.workbench.list.ListView;

/**
 * Created by kdewitte on 05/06/15.
 */
public class VimeoListPresenter extends ListPresenter {

    @Inject
    public VimeoListPresenter(ListView view, ComponentProvider componentProvider) {
        super(view, componentProvider);
    }
}
