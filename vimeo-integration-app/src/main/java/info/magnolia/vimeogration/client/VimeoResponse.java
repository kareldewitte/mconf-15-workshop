package info.magnolia.vimeogration.client;

import info.magnolia.vimeogration.beans.VimeoData;

import java.util.Collection;

/**
 * Created by kdewitte on 09/01/15.
 */
public class VimeoResponse {
    private int total;
    private int page;
    //Add correct getters setters
    private int per_page;
    private Collection<VimeoData> data;
    private Object paging;

    public VimeoResponse(int total, int page, int per_page, Collection<VimeoData> data) {
        this.total = total;
        this.page = page;
        this.per_page = per_page;
        this.data = data;
    }

    public VimeoResponse() {

    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public Collection<VimeoData> getData() {
        return data;
    }

    public void setData(Collection<VimeoData> data) {
        this.data = data;
    }

    public Object getPaging() {
        return paging;
    }

    public void setPaging(Object paging) {
        this.paging = paging;
    }
}
