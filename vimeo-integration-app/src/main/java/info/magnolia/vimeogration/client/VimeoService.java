package info.magnolia.vimeogration.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * Created by kdewitte on 05/06/15.
 */
public interface VimeoService {


    public static final String REST_CLIENT = "vimeoClient";

    @GET
    @Path("/channels/{channel}/videos")
    @Produces("application/json")
    public VimeoResponse getVideosForChannel(@PathParam("channel") long channel,@QueryParam("page") long page);
}
