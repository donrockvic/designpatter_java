package com.headfirst.homeAutomation.devices;

public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("Turning on "+name+" Stereo");
    }

    public void off(){
        System.out.println("Turning off "+name+" stereo");
    }

    public void setCD(){
        System.out.println("Inserting CD into stereo");
    }

    public void setDVD(){

    }

    public void setRadio() {

    }

    public void setVolume(int volumeLevel){
        System.out.println("Stereo volume set to "+volumeLevel);
    }
}
