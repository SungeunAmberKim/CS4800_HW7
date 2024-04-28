import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RealSongService implements SongService {
    private Map<Integer, Song> songs;

    public RealSongService() {
        songs = new HashMap<>();
        songs.put(1, new Song("title 1", "artist 1", "album 1", 5));
        songs.put(1, new Song("title 2", "artist 2", "album 1", 10));
        songs.put(1, new Song("title 3", "artist 3", "album 1", 15));
        songs.put(1, new Song("title 4", "artist 4", "album 1", 20));
        songs.put(1, new Song("title 5", "artist 5", "album 1", 25));
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
