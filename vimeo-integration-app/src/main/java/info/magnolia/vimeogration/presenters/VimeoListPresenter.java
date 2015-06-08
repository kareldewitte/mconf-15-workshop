package info.magnolia.vimeogration.presenters;

import com.google.inject.Inject;
import com.vaadin.data.Container;
import info.magnolia.objectfactory.ComponentProvider;
import info.magnolia.rest.client.registry.RestClientRegistry;
import info.magnolia.ui.vaadin.integration.contentconnector.ContentConnector;
import info.magnolia.ui.workbench.ContentPresenter;
import info.magnolia.ui.workbench.list.ListPresenter;
import info.magnolia.ui.workbench.list.ListView;
import info.magnolia.vimeogration.connectors.VimeoContentConnector;
import info.magnolia.vimeogration.containers.VimeoListContainer;

/**
 * Created by kdewitte on 05/06/15.
 */
public class VimeoListPresenter extends ListPresenter {

    private VimeoListContainer listContainer;


    @Inject
    public VimeoListPresenter(ListView view, ComponentProvider componentProvider,RestClientRegistry registry,ContentConnector connector) {
        super(view, componentProvider);
        this.contentConnector = connector;
        listContainer = new VimeoListContainer(registry,((VimeoContentConnector) contentConnector).getContentConnectorDefinition());
    }



    @Override
    protected Container initializeContainer() {
        return listContainer;
    }


}
