package com.example.musicalstructureapp;

public class Song {
    private String song_name;
    private String song_artist;
    private int song_image;

    public Song(String song_name, String song_artist, int song_image) {
        this.song_name = song_name;
        this.song_artist = song_artist;
        this.song_image = song_image;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getSong_artist() {
        return song_artist;
    }

    public void setSong_artist(String song_artist) {
        this.song_artist = song_artist;
    }

    public int getSong_image() {
        return song_image;
    }

    public void setSong_image(int song_image) {
        this.song_image = song_image;
    }
}