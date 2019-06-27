package dev.hakiki.apps.nedtedrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.hakiki.apps.nedtedrecyclerview.R;
import dev.hakiki.apps.nedtedrecyclerview.models.Album;

public  class  AdapterRChild extends RecyclerView.Adapter<AdapterRChild.ARCHolder> {
    Context ctx ;
    List<Album> albums;

    public  AdapterRChild(Context ctx, List<Album> albums){
        this.ctx = ctx;
        this.albums = albums;
    }

    @NonNull
    @Override
    public ARCHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View infla = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_album,parent,false);
        return new ARCHolder(infla);
    }

    @Override
    public void onBindViewHolder(@NonNull ARCHolder holder, int position) {
        Album ab = albums.get(position);
        holder.title.setText(ab.getTitle());
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }


    class ARCHolder extends RecyclerView.ViewHolder {
        TextView title;
        public ARCHolder(View view){
            super(view);

            title = (TextView) view.findViewById(R.id.titleAlbum);
        }
    }
}

