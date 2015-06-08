package info.magnolia.vimeogration.beans;

import java.util.Collection;

/**
 * Created by kdewitte on 08/06/15.
 */
public class VimeoPictures {
    private String uri;
    private boolean active;
    private Collection<PictureSize> sizes;


    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Collection<PictureSize> getSizes() {
        return sizes;
    }

    public void setSizes(Collection<PictureSize> sizes) {
        this.sizes = sizes;
    }


}
