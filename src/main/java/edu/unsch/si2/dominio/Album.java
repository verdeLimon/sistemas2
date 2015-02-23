package edu.unsch.si2.dominio;

/**
 * The {@link Album} is the domain model of a music record.
 */
public class Album {

    private int id;
    private String artist;
    private String title;
    private boolean classical;
    private String composer;

    public Album() {
        super();
    }

    public Album(String artist, String title, boolean classical, String composer) {
        super();
        this.artist = artist;
        this.title = title;
        this.classical = classical;
        this.composer = composer;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClassical() {
        return classical;
    }

    public void setClassical(boolean classical) {
        this.classical = classical;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    @Override
    public String toString() {
        return "Album [artist=" + artist + ", title=" + title + ", classical="
                + classical + ", composer=" + composer + "]";
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
