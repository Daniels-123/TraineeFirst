package com.danielbuitrago.trainee1.AdapterArtists;

public class Image {

    private String Text;
    private String size;

    public Image() {
    }

    public Image(String text, String size) {
        Text = text;
        this.size = size;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
