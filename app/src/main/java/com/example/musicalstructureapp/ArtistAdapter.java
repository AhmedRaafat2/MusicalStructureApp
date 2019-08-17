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

public class ArtistAdapter extends ArrayAdapter<Artist> {
    private Context context;
    private ArrayList<Artist> artists;

    public ArtistAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Artist> artists) {
        super(context, resource, artists);
        this.context = context;
        this.artists = artists;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.artist_item,null);
        TextView artist_name = convertView.findViewById(R.id.artist_name);
        TextView track_name = convertView.findViewById(R.id.track_name);
        ImageView artist_image = convertView.findViewById(R.id.artist_image);
        Artist current_artist = artists.get(position);
        artist_name.setText(current_artist.getArtist_name());
        track_name.setText(current_artist.getTrack_name());
        artist_image.setImageResource(current_artist.getArtist_image());
        return convertView;
    }
}