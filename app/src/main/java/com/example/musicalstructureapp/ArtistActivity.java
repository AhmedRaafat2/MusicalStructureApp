package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity implements View.OnClickListener {
    private Button songs_btn;
    private Button albums_btn;
    private Button now_playing_btn;
    private GridView artists_list;
    private ArrayList<Artist> artists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        songs_btn = findViewById(R.id.songs_btn);
        now_playing_btn = findViewById(R.id.now_playing_btn);
        albums_btn = findViewById(R.id.albums_btn);
        artists_list = findViewById(R.id.artists_list);
        songs_btn.setOnClickListener(this);
        now_playing_btn.setOnClickListener(this);
        albums_btn.setOnClickListener(this);

        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));
        artists.add(new Artist("Artist Name","Track Name",R.drawable.music));

        ArtistAdapter artistAdapter = new ArtistAdapter(this,R.layout.artist_item,artists);
        artists_list.setAdapter(artistAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.songs_btn:
                Intent intent = new Intent(this,SongsActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.albums_btn:
                Intent intent2 = new Intent(this,AlbumsActivity.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.now_playing_btn:
                Intent intent3 = new Intent(this,NowPlaying.class);
                startActivity(intent3);
                finish();
                break;
        }
    }
}