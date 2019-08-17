package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity implements View.OnClickListener {
    private Button artists_btn;
    private Button albums_btn;
    private Button now_playing_btn;
    private RecyclerView songs_list;
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

        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name2","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name3","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));
        songs.add(new Song("Track Name","Song Artist",R.drawable.music2));

        SongAdapter songAdapter = new SongAdapter(this,songs);
        songs_list.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
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