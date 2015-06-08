package info.magnolia.vimeogration.client.filters;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import java.io.IOException;

/**
 * Created by kdewitte on 05/06/15.
 */
public class AuthenticationFilter implements ClientRequestFilter {

    protected String token;
    protected String tokenType;

    @Override
    public void filter(ClientRequestContext clientRequestContext) throws IOException {

        clientRequestContext.getHeaders().add("Authorization",tokenType+" "+token);

    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
