package com.headfirst.homeAutomation.devices;

public class CeilingFan {
    public static final int HIGH = 5;
    public static final int MEDIUM = 3;
    public static final int LOW = 2;
    public static final int OFF = 0;
    int speed;
    String location;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location+" Ceiling fan in on HIGH");
        // code to set the fan High
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location+" Ceiling fan in on MEDIUM");
        //  make the speed medium
    }

    public void low(){
        speed = LOW;
        System.out.println(location+" Ceiling fan in on LOW");
        // code to make the fan LOW

    }

    public int getSpeed() {
        return speed;
    }

    public void on(){
        System.out.println("Turning on "+location+" ceiling Fan");
    }

    public void off(){
        speed = OFF;
        System.out.println("Turning off "+location+" ceiling Fan");
    }
}
