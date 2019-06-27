package dev.hakiki.apps.nedtedrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

import dev.hakiki.apps.nedtedrecyclerview.R;
import dev.hakiki.apps.nedtedrecyclerview.models.AlbumParent;

public class AdapterRParent extends RecyclerView.Adapter<AdapterRParent.ADPViewHolder>{
    Context ctx;
    List<AlbumParent> album;

    public  AdapterRParent(Context ctx, List<AlbumParent> parentAlbum){
        this.ctx = ctx;
        this.album = parentAlbum;
    }

    @NonNull
    @Override
    public ADPViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_album_main, parent,false);
        return new ADPViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ADPViewHolder holder, int position) {
        AlbumParent adp = album.get(position);
        holder.title.setText(adp.getTitle());
        holder.description.setText(adp.getDescription());

        LinearLayoutManager lm = new LinearLayoutManager(ctx,LinearLayoutManager.HORIZONTAL,false);
        holder.recyclerViewAlbum.setLayoutManager(lm);
        AdapterRChild adapter = new AdapterRChild(ctx,adp.getAlbums());
        holder.recyclerViewAlbum.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return album.size();
    }


    class  ADPViewHolder extends RecyclerView.ViewHolder {
        TextView title, description;
        RecyclerView recyclerViewAlbum;

        public ADPViewHolder(View view) {
            super(view);

            title  = (TextView) view.findViewById(R.id.TVTitle);
            description = (TextView) view.findViewById(R.id.TVDescription);
            recyclerViewAlbum = (RecyclerView) view.findViewById(R.id.recyclerAlbum);


        }
    }
}
