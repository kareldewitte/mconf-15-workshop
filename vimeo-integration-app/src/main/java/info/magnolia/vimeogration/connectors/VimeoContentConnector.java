package info.magnolia.vimeogration.connectors;

import com.google.inject.Inject;
import com.vaadin.data.Item;
import info.magnolia.objectfactory.ComponentProvider;
import info.magnolia.registry.RegistrationException;
import info.magnolia.rest.client.registry.RestClientRegistry;
import info.magnolia.resteasy.client.RestEasyClient;
import info.magnolia.ui.vaadin.integration.contentconnector.AbstractContentConnector;
import info.magnolia.ui.vaadin.integration.contentconnector.ContentConnector;
import info.magnolia.ui.vaadin.integration.contentconnector.ContentConnectorDefinition;
import info.magnolia.vimeogration.beans.VimeoData;
import info.magnolia.vimeogration.beans.VimeoItem;
import info.magnolia.vimeogration.client.VimeoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kdewitte on 05/06/15.
 */
public class VimeoContentConnector extends AbstractContentConnector {

    private static final Logger log = LoggerFactory.getLogger(VimeoContentConnector.class);
    VimeoService vimeoService;

    @Inject
    public VimeoContentConnector(ContentConnectorDefinition contentConnectorDefinition, ComponentProvider componentProvider,RestClientRegistry registry) {
        super(contentConnectorDefinition, componentProvider);
        try {
            vimeoService = ((RestEasyClient)registry.getRestClient(vimeoService.REST_CLIENT)).getClientService(VimeoService.class);
        } catch (RegistrationException e) {
            log.error("VIMEO client could not be set up: {}",e.getMessage());
        }
    }

    @Override
    public ContentConnectorDefinition getContentConnectorDefinition() {
        return super.getContentConnectorDefinition();
    }

    @Override
    public String getItemUrlFragment(Object itemId) {
        return String.valueOf(itemId);
    }

    @Override
    public Object getItemIdByUrlFragment(String urlFragment) {
        return urlFragment;
    }

    @Override
    public Object getDefaultItemId() {
        return "";
    }

    @Override
    public Item getItem(Object itemId) {
        log.info("itemID:"+(String)itemId);
        if(itemId==null || ((String) itemId).isEmpty() || itemId.equals("/")) {
            return null;
        }
        String id = ((String) itemId).split("/")[2];
        VimeoData data = vimeoService.getVideoForItemId(id);
        return new VimeoItem(data);
    }

    @Override
    public Object getItemId(Item item) {
        return item.getItemProperty("uri");
    }

    @Override
    public boolean canHandleItem(Object itemId) {
        return true;
    }
}
