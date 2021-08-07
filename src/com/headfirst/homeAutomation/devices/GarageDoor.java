package com.headfirst.homeAutomation.devices;

public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("Opening the garage");
    }

    public void down(){
        System.out.println("Shutting down the Garage door");

    }

    public void stop() {

    }

    public void lightOn(){

    }

    public void lightOff(){

    }
}
