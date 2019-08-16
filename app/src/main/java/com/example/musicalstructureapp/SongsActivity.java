package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SongsActivity extends AppCompatActivity implements View.OnClickListener {
    private Button songs_btn;
    private Button artists_btn;
    private Button albums_btn;
    private Button now_playing_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        songs_btn = findViewById(R.id.songs_btn);
        artists_btn = findViewById(R.id.artists_btn);
        albums_btn = findViewById(R.id.albums_btn);
        now_playing_btn = findViewById(R.id.now_playing_btn);
        songs_btn.setOnClickListener(this);
        artists_btn.setOnClickListener(this);
        albums_btn.setOnClickListener(this);
        now_playing_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.songs_btn:
                Intent intent = new Intent(this,SongsActivity.class);
                startActivity(intent);
                break;
            case R.id.artists_btn:
                Intent intent2 = new Intent(this,ArtistActivity.class);
                startActivity(intent2);
                break;
            case R.id.now_playing_btn:
                Intent intent3 = new Intent(this,NowPlaying.class);
                startActivity(intent3);
                break;
            case R.id.albums_btn:
                Intent intent4 = new Intent(this,AlbumsActivity.class);
                startActivity(intent4);
                break;
        }
    }
}