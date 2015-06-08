package info.magnolia.vimeogration.containers;


import com.google.inject.Inject;
import com.vaadin.data.Property;
import com.vaadin.data.util.AbstractInMemoryContainer;
import info.magnolia.registry.RegistrationException;
import info.magnolia.rest.client.registry.RestClientRegistry;
import info.magnolia.resteasy.client.RestEasyClient;
import info.magnolia.ui.vaadin.integration.contentconnector.ContentConnector;
import info.magnolia.ui.vaadin.integration.contentconnector.ContentConnectorDefinition;
import info.magnolia.vimeogration.beans.VimeoData;
import info.magnolia.vimeogration.beans.VimeoItem;
import info.magnolia.ui.workbench.container.Refreshable;
import info.magnolia.vimeogration.client.VimeoResponse;
import info.magnolia.vimeogration.client.VimeoRestClientDefinition;
import info.magnolia.vimeogration.client.VimeoService;
import info.magnolia.vimeogration.connectors.VimeoContentConnectorDefintion;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kdewitte on 05/06/15.
 */
public class VimeoListContainer extends AbstractInMemoryContainer<String, String, VimeoItem> implements Refreshable {

    private Map<String,VimeoItem> items;


    public VimeoListContainer(RestClientRegistry clientRegistry,ContentConnectorDefinition contentConnectorDefinition) {

        VimeoService clientService = null;
        items = new HashMap<>();
        try {

            VimeoContentConnectorDefintion def = (VimeoContentConnectorDefintion) contentConnectorDefinition;
            clientService = ((RestEasyClient) clientRegistry.getRestClient(VimeoService.REST_CLIENT)).getClientService(VimeoService.class);
            VimeoResponse videosForChannel = clientService.getVideosForChannel(def.getChannel(), 1);

            for(VimeoData vimeoData:videosForChannel.getData()){
                this.internalAddItemAtEnd(vimeoData.getUri(),new VimeoItem(vimeoData),false);
                items.put(vimeoData.getUri(),new VimeoItem(vimeoData));
            }
        } catch (RegistrationException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected VimeoItem getUnfilteredItem(Object id) {
        return items.get(id);
    }


    @Override
    public void refresh() {

    }

    @Override
    public Collection<?> getContainerPropertyIds() {
        return VimeoItem.getPropertyIds();
    }

    @Override
    public Property getContainerProperty(Object itemId, Object propertyId) {
        return getItem(itemId).getItemProperty(propertyId);
    }

    @Override
    public Class<?> getType(Object o) {
        return o.getClass();
    }


    @Override
    public VimeoItem getItem(Object itemId) {
        return items.get(itemId);
    }
}
