package com.headfirst.homeAutomation.devices;

public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void  on(){
        System.out.println("Light is on for "+name);
    }

    public void off() {
        System.out.println(name+" light is off");
    }
}
