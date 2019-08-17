package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity implements View.OnClickListener {
    private Button songs_btn;
    private Button artists_btn;
    private Button now_playing_btn;
    private RecyclerView albums_list;
    private ArrayList<Album> albums = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        songs_btn = findViewById(R.id.songs_btn);
        artists_btn = findViewById(R.id.artists_btn);
        now_playing_btn = findViewById(R.id.now_playing_btn);
        albums_list =findViewById(R.id.albums_list);
        songs_btn.setOnClickListener(this);
        artists_btn.setOnClickListener(this);
        now_playing_btn.setOnClickListener(this);

        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));
        albums.add(new Album("Album Name","Artist Name", R.drawable.music2 ));

        AlbumAdapter albumAdapter = new AlbumAdapter(this,albums);
        albums_list.setLayoutManager(new GridLayoutManager(this,3,RecyclerView.VERTICAL,false));
        albums_list.setAdapter(albumAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.songs_btn:
                Intent intent = new Intent(this,SongsActivity.class);
                startActivity(intent);
                finish();
                break;
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
        }
    }
}