package com.example.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumHolder>{
    private Context context;
    private ArrayList<Album> albums;

    public AlbumAdapter(Context context, ArrayList<Album> albums) {
        this.context = context;
        this.albums = albums;
    }

    @NonNull
    @Override
    public AlbumHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AlbumHolder(LayoutInflater.from(context).inflate(R.layout.album_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumHolder holder, int position) {

        Album currentAlbum = albums.get(position);
        holder.artist_name.setText(currentAlbum.getArtist_name());
        holder.album_name.setText(currentAlbum.getAlbum_name());
        holder.album_image.setImageResource(currentAlbum.getAlbum_image());
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    class AlbumHolder extends RecyclerView.ViewHolder{

        TextView artist_name;
        TextView album_name;
        ImageView album_image;
        public AlbumHolder(@NonNull View itemView) {
            super(itemView);
            artist_name = itemView.findViewById(R.id.artist_name);
            album_name = itemView.findViewById(R.id.album_name);
            album_image = itemView.findViewById(R.id.album_image);
        }
    }

}