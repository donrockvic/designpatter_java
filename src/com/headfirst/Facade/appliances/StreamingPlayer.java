package com.headfirst.Facade.appliances;

public class StreamingPlayer {
    String movie;

    public void on(){
        System.out.println("Streaming player on");
    }

    public void play(String movie){
        this.movie = movie;
        System.out.println("Streaming Player playing "+movie);
    }
    public void stop(){
        System.out.println("Streaming player stopped "+this.movie);
    }
    public void off(){
        System.out.println("Streaming player off");
    }
}
