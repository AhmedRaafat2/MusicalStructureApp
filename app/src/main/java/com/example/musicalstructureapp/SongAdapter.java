package com.example.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongHolder>{
    private Context context;
    private ArrayList<Song> songs;

    public SongAdapter(Context context, ArrayList<Song> songs) {
        this.context = context;
        this.songs = songs;
    }

    @NonNull
    @Override
    public SongHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SongHolder(LayoutInflater.from(context).inflate(R.layout.song_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SongHolder holder, int position) {

        Song currentSong = songs.get(position);
        holder.songImage.setImageResource(currentSong.getSong_image());
        holder.songArtist.setText(currentSong.getSong_artist());
        holder.songName.setText(currentSong.getSong_name());
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }


    class SongHolder extends RecyclerView.ViewHolder{

        ImageView songImage;
        TextView songArtist;
        TextView songName;
        public SongHolder(@NonNull View itemView) {
            super(itemView);
            songImage = itemView.findViewById(R.id.song_image);
            songArtist = itemView.findViewById(R.id.atrist_name);
            songName = itemView.findViewById(R.id.track_name);
        }
    }

}