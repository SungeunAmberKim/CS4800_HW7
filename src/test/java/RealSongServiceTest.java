import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class RealSongServiceTest {
    RealSongService rss = new RealSongService();
    @Test
    public void testSearchById() {
        String expected = "song; artist 5; album 5; 25";
        Song actualSong = rss.searchById(5);
        String actual = actualSong.toString();
        assertEquals(expected,actual);
    }
    @Test
    public void testSearchByTitle () {
        List<String> expected = new ArrayList<>();
        expected.add("title; artist 1; album 1; 5");
        expected.add("title; artist 2; album 2; 10");
        expected.add("title; artist 3; album 3; 15");
        List<Song> actualSong = rss.searchByTitle("title");
        List<String> actual = new ArrayList<>();
        for (Song song: actualSong) {
            actual.add(song.toString());
        }
        assertEquals(expected,actual);
    }
    @Test
    public void testSearchByAlbum () {
        List<String> expected = new ArrayList<>();
        expected.add("title; artist 3; album 3; 15");
        expected.add("music; artist 4; album 3; 20");
        List<Song> actualSong = rss.searchByAlbum("album 3");
        List<String> actual = new ArrayList<>();
        for (Song song: actualSong) {
            actual.add(song.toString());
        }
        assertEquals(expected,actual);
    }

}
