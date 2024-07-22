package SongPlayList;

/**
 * Song
 */
public class Song {

    String title;
    double duration;

    // Construtor 
    public Song (String title , double duration){
        this.title = title;
        this.duration = duration;
    }

    public Song(){

    }

    // Returning the song title
    public String getTitle(){
        return title;
    }

    // returning the song Duration
    public double getDuration(){
        return duration;
    }

    // overriding the to toString method
    @Override
    public String toString() {
        return "Song{ "+"title = " + title + '\'' + ", duration = " + duration + " }";
    }

}