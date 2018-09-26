package com.example.android.quakereport;

import java.net.URL;

public class DataSource {

    private double mMag;
    private String mLocation;
    private long mDate;
    private String mURL;

    DataSource(double mag, String location, long date, String url){

        mMag = mag;
        mLocation = location;
        mDate = date;
        mURL = url;
    }

    public double getmMag() {
        return mMag;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmDate() {
        return mDate;
    }

    public String getmURL(int dataSource) {
        return mURL;
    }
}
