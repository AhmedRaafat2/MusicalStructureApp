package com.example.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    private Context context;
    private ArrayList<Song> songs;

    public SongAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Song> songs) {
        super(context, resource, songs);
        this.context = context;
        this.songs = songs;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.song_item,null);
        Song currentSong = songs.get(position);
        ImageView songImage = convertView.findViewById(R.id.song_image);
        TextView songArtist = convertView.findViewById(R.id.atrist_name);
        TextView songName = convertView.findViewById(R.id.track_name);
        songImage.setImageResource(currentSong.getSong_image());
        songArtist.setText(currentSong.getSong_artist());
        songName.setText(currentSong.getSong_name());
        return convertView;
    }
}