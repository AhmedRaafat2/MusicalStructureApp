package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity implements View.OnClickListener {
    private Button artists_btn;
    private Button albums_btn;
    private Button now_playing_btn;
    private ListView songs_list;
    private ArrayList<Song> songs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        artists_btn = findViewById(R.id.artists_btn);
        albums_btn = findViewById(R.id.albums_btn);
        now_playing_btn = findViewById(R.id.now_playing_btn);
        songs_list = findViewById(R.id.songs_list);
        artists_btn.setOnClickListener(this);
        albums_btn.setOnClickListener(this);
        now_playing_btn.setOnClickListener(this);

        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music));

        SongAdapter songAdapter = new SongAdapter(this,R.layout.song_item,songs);
        songs_list.setAdapter(songAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.artists_btn:
                Intent intent2 = new Intent(this,ArtistActivity.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.now_playing_btn:
                Intent intent3 = new Intent(this,NowPlaying.class);
                startActivity(intent3);
                finish();
                break;
            case R.id.albums_btn:
                Intent intent4 = new Intent(this,AlbumsActivity.class);
                startActivity(intent4);
                finish();
                break;
        }
    }
}