package com.headfirst.homeAutomation.devices;

public class Hottub {
    int temperature;
    public void circulate(){

    }

    public void jetsOn(){
        System.out.println("Turning on the jet");
    }

    public void jetsOff(){
        System.out.println("Turning the Jet off");
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
}
