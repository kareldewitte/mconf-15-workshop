package info.magnolia.vimeogration.containers;


import com.vaadin.data.Property;
import com.vaadin.data.util.AbstractInMemoryContainer;
import info.magnolia.vimeogration.beans.VimeoItem;
import info.magnolia.ui.workbench.container.Refreshable;

import java.util.Collection;

/**
 * Created by kdewitte on 05/06/15.
 */
public class VimeoListContainer extends AbstractInMemoryContainer<String, String, VimeoItem> implements Refreshable {

    @Override
    protected VimeoItem getUnfilteredItem(Object o) {
        return null;
    }

    @Override
    public void refresh() {

    }

    @Override
    public Collection<?> getContainerPropertyIds() {
        return null;
    }

    @Override
    public Property getContainerProperty(Object o, Object o2) {
        return null;
    }

    @Override
    public Class<?> getType(Object o) {
        return null;
    }


    @Override
    public VimeoItem getItem(Object itemId) {
        return null;
    }
}
