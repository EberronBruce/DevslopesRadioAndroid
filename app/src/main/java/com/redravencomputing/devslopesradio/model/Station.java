package com.redravencomputing.devslopesradio.model;

/**
 * Created by bruceburgess on 4/10/17.
 */

public class Station {

    final String DRAWABLE    = "drawable/";

    private String stationTitle;
    private String imgUri;

    public Station(String stationTitle, String imgUri) {
        this.stationTitle = stationTitle;
        this.imgUri = imgUri;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImgUri() {
        return DRAWABLE + imgUri;
    }
}
