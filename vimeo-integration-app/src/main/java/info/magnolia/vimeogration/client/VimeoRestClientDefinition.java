package info.magnolia.vimeogration.client;

import info.magnolia.rest.client.RestClientDefinition;
import info.magnolia.rest.client.call.AbstractRestCall;
import info.magnolia.rest.client.factory.ClientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by kdewitte on 05/06/15.
 */
public class VimeoRestClientDefinition implements RestClientDefinition {

    private final String VIMEO_API_URL = "https://api.vimeo.com";
    private static final Logger log = LoggerFactory.getLogger(VimeoRestClientDefinition.class);
    private String token = "b9d095ca6b41703cb5f98c70b2f3274c";
    private String tokenType = "bearer";
    public final static String VIMEO_URL = "https://www.vimeo.com";

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public Class<? extends ClientFactory> getClientFactoryClass() {
        return null;
    }

    @Override
    public String getBaseUrl() {
        return null;
    }

    @Override
    public Map<String, AbstractRestCall<?>> getRestCalls() {
        return null;
    }
}
