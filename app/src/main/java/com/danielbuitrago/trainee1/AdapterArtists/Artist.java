package com.danielbuitrago.trainee1.AdapterArtists;

import org.w3c.dom.Text;
import com.danielbuitrago.trainee1.AdapterArtists.Image;
public class Artist {
    private String Name;
    private String Listeners;
    private String Mbid;
    private String Url;
    private String Streamable;
    private Image Image[];


    public Artist() {
    }

    public Artist(String name, String listeners, String mbid, String url, String streamable, com.danielbuitrago.trainee1.AdapterArtists.Image[] image) {
        Name = name;
        Listeners = listeners;
        Mbid = mbid;
        Url = url;
        Streamable = streamable;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getListeners() {
        return Listeners;
    }

    public void setListeners(String listeners) {
        Listeners = listeners;
    }

    public String getMbid() {
        return Mbid;
    }

    public void setMbid(String mbid) {
        Mbid = mbid;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getStreamable() {
        return Streamable;
    }

    public void setStreamable(String streamable) {
        Streamable = streamable;
    }

    public com.danielbuitrago.trainee1.AdapterArtists.Image[] getImage() {
        return Image;
    }

    public void setImage(com.danielbuitrago.trainee1.AdapterArtists.Image[] image) {
        Image = image;
    }
}
