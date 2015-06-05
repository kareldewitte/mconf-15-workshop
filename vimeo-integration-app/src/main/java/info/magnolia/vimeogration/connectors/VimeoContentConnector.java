package info.magnolia.vimeogration.connectors;

import com.google.inject.Inject;
import com.vaadin.data.Item;
import info.magnolia.objectfactory.ComponentProvider;
import info.magnolia.ui.vaadin.integration.contentconnector.AbstractContentConnector;
import info.magnolia.ui.vaadin.integration.contentconnector.ContentConnector;
import info.magnolia.ui.vaadin.integration.contentconnector.ContentConnectorDefinition;

/**
 * Created by kdewitte on 05/06/15.
 */
public class VimeoContentConnector extends AbstractContentConnector {

    @Inject
    public VimeoContentConnector(ContentConnectorDefinition contentConnectorDefinition, ComponentProvider componentProvider) {
        super(contentConnectorDefinition, componentProvider);
    }

    @Override
    public String getItemUrlFragment(Object o) {
        return null;
    }

    @Override
    public Object getItemIdByUrlFragment(String s) {
        return null;
    }

    @Override
    public Object getDefaultItemId() {
        return null;
    }

    @Override
    public Item getItem(Object o) {
        return null;
    }

    @Override
    public Object getItemId(Item item) {
        return null;
    }

    @Override
    public boolean canHandleItem(Object o) {
        return false;
    }
}
