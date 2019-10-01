package com.pandev.academy.mysubmissionapplication;

import android.graphics.Bitmap;

public class ClubFootball {
    private String clubName;
    private String clubNickName;
    private String clubSince;
    private String clubStadium;
    private String clubManager;
    private String clubLeague;
    private String clubPhoto;
    private String clubAbout;

    //------------------------------------------------

    private Bitmap bitmap = null;
    private static final ClubFootball instance = new ClubFootball();

    public ClubFootball() {

    }

    public static ClubFootball getInstance() {
        return instance;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    //---------------------------------------------------

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubNickName() {
        return clubNickName;
    }

    public void setClubNickName(String clubNickName) {
        this.clubNickName = clubNickName;
    }

    public String getClubSince() {
        return clubSince;
    }

    public void setClubSince(String clubSince) {
        this.clubSince = clubSince;
    }

    public String getClubStadium() {
        return clubStadium;
    }

    public void setClubStadium(String clubStadium) {
        this.clubStadium = clubStadium;
    }

    public String getClubManager() {
        return clubManager;
    }

    public void setClubManager(String clubManager) {
        this.clubManager = clubManager;
    }

    public String getClubLeague() {
        return clubLeague;
    }

    public void setClubLeague(String clubLeague) {
        this.clubLeague = clubLeague;
    }

    public String getClubPhoto() {
        return clubPhoto;
    }

    public void setClubPhoto(String clubPhoto) {
        this.clubPhoto = clubPhoto;
    }

    public String getClubAbout() {
        return clubAbout;
    }

    public void setClubAbout(String clubAbout) {
        this.clubAbout = clubAbout;
    }
}
