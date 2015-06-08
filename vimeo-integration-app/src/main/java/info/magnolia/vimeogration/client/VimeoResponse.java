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
    private int perPage;
    private Collection<VimeoData> videos;

    public VimeoResponse(int total, int page, int perPage, Collection<VimeoData> videos) {
        this.total = total;
        this.page = page;
        this.perPage = perPage;
        this.videos = videos;
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

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public Collection<VimeoData> getVideos() {
        return videos;
    }

    public void setVideos(Collection<VimeoData> videos) {
        this.videos = videos;
    }
}
