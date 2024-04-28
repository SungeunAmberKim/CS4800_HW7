public class Song {
    private int ID;
    private String title;
    private String artist;
    private String album;
    private int duration;
    public Song(int ID, String title, String artist, String album, int duration) {
        this.ID = ID;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }
    public int getID() {
        return ID;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public String getAlbum() {
        return album;
    }
    public int getDuration() {
        return duration;
    }
    public String toString() {
        return title + "; " + artist + "; " + album + "; " + duration;
    }

}
