import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongServiceProxy implements SongService{
    private RealSongService songs;
    private Map<Integer, Song> cacheID;
    private Map<String, Integer> cacheTitle;
    private Map<String, Integer> cacheAlbum;
    public SongServiceProxy(RealSongService songs) {
        this.songs = songs;
        this.cacheID = new HashMap<>();
        this.cacheTitle = new HashMap<>();
        this.cacheAlbum = new HashMap<>();
    }
    @Override
    public Song searchById(Integer songID) {
        if(cacheID.containsKey(songID)) {
            return cacheID.get(songID);
        } else {
            Song song = songs.searchById(songID);
            if (song != null) {
                cacheID.put(songID, song);
            }
            return song;
        }
    }
    @Override
    public List<Song> searchByTitle(String title) {
        List <Song> result = new ArrayList<>();
        if(cacheTitle.containsKey(title)) {
            for(String name: cacheTitle.keySet()) {
                if (name.equals(title)) {
                    result.add(cacheID.get(cacheTitle.get(title)));
                }
            }
        } else {
            result = songs.searchByTitle(title);
            for(Song song: result) {
                cacheTitle.put(song.getTitle(), song.getID());
                cacheID.put(song.getID(), song);
            }
        }
        return result;
    }
    @Override
    public List<Song> searchByAlbum(String album) {
        List <Song> result = new ArrayList<>();
        if(cacheAlbum.containsKey(album)) {
            for(String name: cacheAlbum.keySet()) {
                if (name.equals(album)) {
                    result.add(cacheID.get(cacheAlbum.get(album)));
                }
            }
        } else {
            result = songs.searchByAlbum(album);
            for(Song song: result) {
                cacheAlbum.put(song.getAlbum(), song.getID());
                cacheID.put(song.getID(), song);
            }
        }
        return result;
    }
}
