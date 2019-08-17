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
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.ArtistHolder>{
    private Context context;
    private ArrayList<Artist> artists;

    public ArtistAdapter(Context context, ArrayList<Artist> artists) {
        this.context = context;
        this.artists = artists;
    }

    @NonNull
    @Override
    public ArtistHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ArtistHolder(LayoutInflater.from(context).inflate(R.layout.artist_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistHolder holder, int position) {
        Artist current_artist = artists.get(position);
        holder.artist_name.setText(current_artist.getArtist_name());
        holder.track_name.setText(current_artist.getTrack_name());
        holder.artist_image.setImageResource(current_artist.getArtist_image());
    }

    @Override
    public int getItemCount() {
        return artists.size();
    }



    class ArtistHolder extends RecyclerView.ViewHolder{

        TextView artist_name;
        TextView track_name;
        ImageView artist_image;
        public ArtistHolder(@NonNull View itemView) {
            super(itemView);
            artist_name = itemView.findViewById(R.id.artist_name);
            track_name = itemView.findViewById(R.id.track_name);
            artist_image = itemView.findViewById(R.id.artist_image);
        }
    }
}