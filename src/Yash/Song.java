package Yash;

public class Song {
    String title;
    double duration;

    public Song(){

    }


    public void song(String title, double duration ){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
       return title;
    }

    public double getDuration(){
        return duration;
    }

    public String toString(){
        return ("title " + title + " / " + " duration " + duration + " long ");
    }
}
