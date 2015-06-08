package info.magnolia.vimeogration.commands;

import com.google.inject.Inject;
import info.magnolia.commands.MgnlCommand;
import info.magnolia.context.Context;
import info.magnolia.rest.client.registry.RestClientRegistry;
import info.magnolia.resteasy.client.RestEasyClient;
import info.magnolia.vimeogration.client.VimeoResponse;
import info.magnolia.vimeogration.client.VimeoService;

/**
 * Created by kdewitte on 07/06/15.
 */
public class VimeoRefreshCacheCommand extends MgnlCommand {


    private RestClientRegistry clientRegistry;

    @Inject
    public VimeoRefreshCacheCommand(RestClientRegistry clientRegistry) {

        this.clientRegistry = clientRegistry;
    }

    @Override
    public boolean execute(Context context) throws Exception {


        VimeoService service = ((RestEasyClient) clientRegistry.getRestClient(VimeoService.REST_CLIENT)).getClientService(VimeoService.class);
        VimeoResponse staffpicks = service.getVideosForChannel("staffpicks", 1);


        return false;
    }
}
