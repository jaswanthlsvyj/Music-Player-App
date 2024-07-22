package SongPlayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    private static ArrayList<Album> albums  = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("Alubm1", "AC/DC");
        album.addSong("TNT", 4.5);
        album.addSong("Highway to hell", 3.5);
        album.addSong("ThunuderStruck", 5.0);
        albums.add(album);

        album = new Album("Alubm2", "Eminem");
        album.addSong("Rap god", 4.5);
        album.addSong("Nor Afraid", 3.5);
        album.addSong("Lose yourself", 4.5);
        albums.add(album);

        // adding the songs to playlist
        LinkedList<Song> playlist_1 = new LinkedList<>();
        albums.get(0).addToPlayList("TNT", playlist_1);
        albums.get(0).addToPlayList("Highway to hell", playlist_1);
        albums.get(1).addToPlayList("Rap god", playlist_1);
        albums.get(1).addToPlayList("Lose yourself", playlist_1);

        // playing the playlist
        play(playlist_1);
    }

    // Method to play the playlist
    private static void play(LinkedList<Song> playList){
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size() == 0){
            System.out.println("This play list have no song");
        }
        else{
            System.out.println("Playing : "+listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = input.nextInt();
            input.nextLine();

            switch (action) {
                case 0:
                    System.out.println("PlayList completed");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playnig "+listIterator.next().toString());
                    }else{
                        System.out.println("No song availble, reached to the end of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }
                    else{
                        System.out.println("We are the first song");
                        forward = false;
                    }
                    break;
            
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("Reached to the end of the list ");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+listIterator.next().toString());
                        }else{
                            if(listIterator.hasPrevious()){
                                System.out.println("Now playing "+listIterator.previous().toString());
                            }
                        }
                    }
                    break;

                default:
                    break;
            }
        }
        input.close();
    }

    // method to show the menu to the user
    private static void printMenu(){
        System.out.println("Available oprtions\npress: ");
        System.out.println("0 - To quit\n"+
                            "1 - To play next song\n"+
                            "2 - To play previous song\n"+
                            "3 - To replay the currt song\n"+
                            "4 - List of all songs\n"+
                            "5 - Print all available options\n"+
                            "6 - Delete current song");
    }

    // Method for 4- List of all songs
    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("----------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------------");
    }
}
