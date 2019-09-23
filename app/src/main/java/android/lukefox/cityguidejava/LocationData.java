package android.lukefox.cityguidejava;

import java.util.Date;

public class LocationData {

    public double latitude;
    public double longitude;
    public String time;

    public LocationData(){}

    public LocationData(double latitude, double longitude){
        this.latitude=latitude;
        this.longitude=longitude;
        this.time = String.valueOf(new Date().getTime());
    }
}

