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

public class AlbumAdapter extends ArrayAdapter<Album> {
    private Context context;
    private ArrayList<Album> albums;
    public AlbumAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Album> albums) {
        super(context, resource, albums);
        this.context = context;
        this.albums = albums;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.album_item,null);
        Album currentAlbum = albums.get(position);
        TextView artist_name = convertView.findViewById(R.id.artist_name);
        TextView album_name = convertView.findViewById(R.id.album_name);
        ImageView album_image = convertView.findViewById(R.id.album_image);
        artist_name.setText(currentAlbum.getArtist_name());
        album_name.setText(currentAlbum.getAlbum_name());
        album_image.setImageResource(currentAlbum.getAlbum_image());
        return convertView;
    }
}