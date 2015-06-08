package info.magnolia.vimeogration.beans;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by kdewitte on 05/06/15.
 */

/**
 *
 * uri : "/videos/129710408"
 name : "Inner Space Artifacts"
 description : ""Artifacts from inner space transformed into moving digital sculptures." SPECIAL PRESENTATION: SIGGRAPH 2015 Dailies | Los Angeles Convention Center | August 9-13 Selected Screening: Fest Anca, Žilina, Slovakia | June 24-28, 2015 Selected Screening/Installation: Currents 2015 New Media Festival, Santa Fe, New Mexico, June 2015 Garden of Fernal Delights, San Francisco, CA | May 30 - June 30, 2015 Selected Screening: Northwest Animation Festival, Portland, Oregon, May 2015 Video Projection: Symbiosis, Oakdale, CA - September 17-20, 2015 Video Projection: Lucidity Festival 2015, Santa Barbara, CA, Projections by Satsi Jaquith, May 2015 Video Projection: Lightning in a Bottle, Bradley, CA | May 21-25 When creating experimental animations I often use intuition and visualization techniques to come up with ideas. Often times these ideas come to me as a flash of insight. Other times I must plumb the depths of my psyche to find novel approaches to making moving images. The film “Inner Space Artifacts” was a journey of deep excavation into the world of abstract ideas. The moving objects in the animation I regard as “artifacts” that I uncovered and shaped into ephemeral moving digital sculptures."
 link : "https://vimeo.com/129710408"
 duration : 130
 width : 1920
 language : "none"
 height : 1080
 embed
 created_time : "2015-06-03T20:30:37+00:00"
 modified_time : "2015-06-08T07:17:51+00:00"
 content_rating
 license : null
 privacy
 pictures
 tags
 stats
 metadata
 user
 app : null
 status : "available"
 embed_presets : null
 *
 */



@JsonIgnoreProperties({ "name", "description","link","duration","width","language",
        "height","embed","created_time","modified_time","content_rating","license",
        "privacy","pictures","tags","stats","metadata",
        "user","app","status","embed_presets"})
public class VimeoData {

    private String  uri;


    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
