import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
public class SongTest {
    Song song = new Song(0,"title","artist","album", 10);

    @Test
    public void testGetTitle() {
        String expected = "title";
        String actual = song.getTitle();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetArtist() {
        String expected = "artist";
        String actual = song.getArtist();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetAlbum() {
        String expected = "album";
        String actual = song.getAlbum();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetDuration() {
        int expected = 10;
        int actual = song.getDuration();
        assertEquals(expected, actual);
    }
}
