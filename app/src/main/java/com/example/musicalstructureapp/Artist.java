package com.example.musicalstructureapp;

public class Artist {
    private String artist_name;
    private String track_name;
    private int artist_image;

    public Artist(String artist_name, String track_name, int artist_image) {
        this.artist_name = artist_name;
        this.track_name = track_name;
        this.artist_image = artist_image;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getTrack_name() {
        return track_name;
    }

    public void setTrack_name(String track_name) {
        this.track_name = track_name;
    }

    public int getArtist_image() {
        return artist_image;
    }

    public void setArtist_image(int artist_image) {
        this.artist_image = artist_image;
    }
}
