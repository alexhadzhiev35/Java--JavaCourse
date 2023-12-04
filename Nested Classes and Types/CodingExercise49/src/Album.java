import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name, artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        Song test = songs.findSong(title);
        if(test == null){
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        if(songs.findSong(title) != null){
            playList.add(songs.findSong(title));
            return true;
        }
        System.out.printf("The song %s is not in this album%n", title);
        return false;
    }

    public boolean addToPlayList(int trackNum, LinkedList<Song> playList){
        Song song = songs.findSong(trackNum);
        if(song != null){
            playList.add(song);
            return true;
        }
        System.out.printf("This album does not have a track %d%n", trackNum);
        return false;
    }

    public static class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song){
            if(!songs.contains(song)){
                songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title){
            for(Song song: songs){
                if(song.getTitle().equalsIgnoreCase(title)){
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNum){
            if(trackNum <= songs.size()){
                return songs.get(trackNum-1);
            }
            return null;
        }

    }

}
