package info.magnolia.vimeogration.providers;

import com.google.inject.Inject;
import com.vaadin.server.ExternalResource;
import info.magnolia.ui.imageprovider.DefaultImageProvider;
import info.magnolia.ui.imageprovider.definition.ImageProviderDefinition;
import info.magnolia.ui.vaadin.gwt.client.tabsheet.util.CollectionUtil;
import info.magnolia.ui.vaadin.integration.contentconnector.ContentConnector;
import info.magnolia.vimeogration.beans.PictureSize;
import info.magnolia.vimeogration.beans.VimeoItem;
import info.magnolia.vimeogration.connectors.VimeoContentConnector;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kdewitte on 08/06/15.
 */
public class VimeoImageProvider extends DefaultImageProvider {

    private final VimeoContentConnector vimeoConnector;

    @Inject
    public VimeoImageProvider(ImageProviderDefinition definition, ContentConnector contentConnector) {
        super(definition, contentConnector);
        vimeoConnector = (VimeoContentConnector) contentConnector;
    }


    @Override
    public String getThumbnailPath(Object itemId) {


        return null;
    }

    @Override
    public String getPortraitPath(Object itemId) {
        return null;
    }

    @Override
    public Object getThumbnailResource(Object itemId, String generator) {
        List<PictureSize> sizes = new ArrayList();
        sizes.addAll(((VimeoItem) vimeoConnector.getItem(itemId)).getVideo().getPictures().getSizes());
        return new ExternalResource(sizes.get(3).getLink());
    }
}
