package com.nikhil.top10downloader;

public class FeedEntry {

    private String name, artist, releaseDate, summary, imageURL;
    private int position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return
                ", Position: #" + position + "\n" +
                        "name= " + name + '\n' +
                        ", artist= " + artist + '\n' +
                        ", releaseDate= " + releaseDate + '\n' +
                        ", imageURL= " + imageURL + "\n";
    }

}
