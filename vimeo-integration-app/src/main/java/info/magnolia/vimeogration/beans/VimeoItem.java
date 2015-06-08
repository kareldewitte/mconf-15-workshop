package info.magnolia.vimeogration.beans;

import com.vaadin.data.util.BeanItem;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by kdewitte on 05/06/15.
 */
public class VimeoItem extends BeanItem<VimeoData> {

    public VimeoItem(VimeoData bean) {
        super(bean);
    }


    public static Collection<?> getPropertyIds(){
        Field[] fields = VimeoData.class.getDeclaredFields();
        List<String> props= new ArrayList<String>();
        for(Field field:fields){
            props.add(field.getName());
        }
        return props;
    }


    public VimeoData getVideo(){
        return getBean();
    }

}
