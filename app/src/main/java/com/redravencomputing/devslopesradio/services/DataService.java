package com.redravencomputing.devslopesradio.services;

import com.redravencomputing.devslopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by bruceburgess on 4/10/17.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeatureStations() {
        //Pretrend we just downloaded feature stations from the Internet

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)","flightplanmusic"));
        list.add(new Station("Two-Wheelin'  (Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children","kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations() {
        ArrayList<Station> list = new ArrayList<>();
        return list;
    }

    public ArrayList<Station> getPartyStations() {
        ArrayList<Station> list = new ArrayList<>();
        return list;
    }
}
