package Yash;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artistName;
    private ArrayList<Song> songs;

    public Album(String albumName ,String artistName , ArrayList<Song> songs){
           this.albumName = albumName;
           this.artistName = artistName;
           this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song());
            System.out.println(title + " is not in the album , You have to add it manually.");
            return true;
        }
        System.out.println(title + " is already in the album.");
        return false;
    }

    public Song findSong(String title){
        for(Song checkedSong : songs){
            if(checkedSong.getTitle().equals(title)) return checkedSong;
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber , LinkedList<Song> PlaylList){
        
    }


}
