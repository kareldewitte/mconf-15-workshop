package info.magnolia.vimeogration.connectors;

import info.magnolia.ui.vaadin.integration.contentconnector.ConfiguredContentConnectorDefinition;

/**
 * Created by kdewitte on 05/06/15.
 */
public class VimeoContentConnectorDefintion extends ConfiguredContentConnectorDefinition {
    public VimeoContentConnectorDefintion() {
        setImplementationClass(VimeoContentConnector.class);
    }


    protected String channel;


    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }


}
