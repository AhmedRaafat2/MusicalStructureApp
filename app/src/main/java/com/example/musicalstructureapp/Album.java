package com.example.musicalstructureapp;

public class Album {
    private String album_name;
    private String artist_name;
    private int album_image;

    public Album(String album_name, String artist_name, int album_image) {
        this.album_name = album_name;
        this.artist_name = artist_name;
        this.album_image = album_image;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public int getAlbum_image() {
        return album_image;
    }

    public void setAlbum_image(int album_image) {
        this.album_image = album_image;
    }
}