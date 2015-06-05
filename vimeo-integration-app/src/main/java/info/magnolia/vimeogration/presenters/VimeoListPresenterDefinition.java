package info.magnolia.vimeogration.presenters;

import info.magnolia.ui.workbench.list.ListPresenterDefinition;

/**
 * Created by kdewitte on 05/06/15.
 */
public class VimeoListPresenterDefinition extends ListPresenterDefinition {


    public VimeoListPresenterDefinition() {
        this.setImplementationClass(VimeoListPresenter.class);
        setViewType(VIEW_TYPE);
        setActive(false);
        setIcon("icon-view-list");
    }
}
