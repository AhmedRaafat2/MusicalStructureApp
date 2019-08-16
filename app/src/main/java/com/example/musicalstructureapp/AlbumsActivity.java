package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlbumsActivity extends AppCompatActivity implements View.OnClickListener {
    private Button songs_btn;
    private Button artists_btn;
    private Button now_playing_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        songs_btn = findViewById(R.id.songs_btn);
        artists_btn = findViewById(R.id.artists_btn);
        now_playing_btn = findViewById(R.id.now_playing_btn);
        songs_btn.setOnClickListener(this);
        artists_btn.setOnClickListener(this);
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
        }

    }
}