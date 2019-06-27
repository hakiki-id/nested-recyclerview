package dev.hakiki.apps.nedtedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import dev.hakiki.apps.nedtedrecyclerview.adapter.AdapterRParent;
import dev.hakiki.apps.nedtedrecyclerview.models.Album;
import dev.hakiki.apps.nedtedrecyclerview.models.AlbumParent;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcParent;
    List<AlbumParent> listAlbumsParent = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();

        rcParent = (RecyclerView) findViewById(R.id.parentRecyclerView);
        rcParent.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        AdapterRParent adapter = new AdapterRParent(this,listAlbumsParent);

        rcParent.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }


    public void loadData() {
        List<Album> albums1 = new ArrayList<>();
        List<Album> albums2 = new ArrayList<>();
        List<Album> albums3 = new ArrayList<>();
        List<Album> albums4 = new ArrayList<>();
        List<Album> albums5 = new ArrayList<>();


        for (int i = 0;  i < 10; i++) {
            albums1.add(new Album("AB1-"+i));
        }

        for (int i = 0;  i < 3; i++) {
            albums2.add(new Album("AB2-"+i));
        }

        for (int i = 0;  i < 6; i++) {
            albums3.add(new Album("AB3-"+i));
        }
        for (int i = 0;  i < 20; i++) {
            albums4.add(new Album("AB4-"+i));
        }
        for (int i = 0;  i < 13; i++) {
            albums5.add(new Album("AB5-"+i));
        }


        listAlbumsParent.add(new AlbumParent("Album 1 " , "Description from album 1", albums1));
        listAlbumsParent.add(new AlbumParent("Album 2 " , "Description from album 2", albums2));
        listAlbumsParent.add(new AlbumParent("Album 3 " , "Description from album 3", albums3));
        listAlbumsParent.add(new AlbumParent("Album 4 " , "Description from album 4", albums4));
        listAlbumsParent.add(new AlbumParent("Album 5 " , "Description from album 5", albums5));


    }
}
