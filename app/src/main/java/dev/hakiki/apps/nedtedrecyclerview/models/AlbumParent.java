package dev.hakiki.apps.nedtedrecyclerview.models;

import android.widget.AbsListView;

import java.util.List;

public class AlbumParent {

    String title ;
    String description;
    List<Album> albums ;

    public AlbumParent(String title, String description, List<Album> albums){
        this.title = title;
        this.description = description;
        this.albums = albums;
    }

    public AlbumParent(){}

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
