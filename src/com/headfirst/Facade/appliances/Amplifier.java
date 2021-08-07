package com.headfirst.Facade.appliances;

public class Amplifier {
    public void on(){
        System.out.println("Amplifier On");
    }
    public void setStreamingPlayer(StreamingPlayer player){
        System.out.println("Amplifier setting Streaming Player to Streaming Player");
    }
    public void  setSurroundingSound(){
        System.out.println("Amplifier surrounded sound on (5 speaker , 2 subwoofer");
    }
    public void  setVolume(int amount){
        System.out.println("Amplifier setting volumer to "+amount);
    }

    public void off(){
        System.out.println("Amplifier is off");
    }
}
