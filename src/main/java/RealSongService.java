import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RealSongService implements SongService {
    private Map<Integer, Song> songs;

    public RealSongService() {
        songs = new HashMap<>();
        songs.put(1, new Song(1, "title", "artist 1", "album 1", 5));
        songs.put(2, new Song(2, "title", "artist 2", "album 2", 10));
        songs.put(3, new Song(3, "title", "artist 3", "album 3", 15));
        songs.put(4, new Song(4, "music", "artist 4", "album 3", 20));
        songs.put(5, new Song(5, "song", "artist 5", "album 5", 25));
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return songs.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<Song> result = new ArrayList<>();
        for (Song song : songs.values()) {
            if (song.getTitle().equals(title))
                result.add(song);
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<Song> result = new ArrayList<>();
        for (Song song : songs.values()) {
            if (song.getAlbum().equals(album))
                result.add(song);
        }
        return result;
    }
}
