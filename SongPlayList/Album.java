package SongPlayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    // Constructor with parameters
    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>(); // Initialize the songs list
    }

    // Default constructor
    public Album(){
        this.songs = new ArrayList<>(); // Initialize the songs list
    }

    // checking if that song already exists
    public Song findSong(String title){
        for(Song checkedSong: songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    // adding the song into the album
    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title, duration));
            // System.out.println(title+" successfully added to the list");
            return true;
        }
        else{
            // System.out.println("Song with name "+title+" already exists");
            return false;
        }
    }

    // Adding song to the playlist with track number and playlist
    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        int index = trackNumber - 1;
        if(index >= 0 && index < this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
        // System.out.println("This album does not have a song with track number "+trackNumber);
        return false;
    }

    // Adding song to playlist with title and playlist
    public boolean addToPlayList(String title, LinkedList<Song> PlayList){
        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                PlayList.add(checkedSong);
                return true;
            }
        }
        // System.out.println(title+" there is no such song");
        return false;
    }
}
