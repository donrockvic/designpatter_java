package com.headfirst.Facade.appliances;

public class TheaterLights {
    public void dim(int amount){
        System.out.println("Theater Ceiling light dimming to "+amount+"%");
    }

    public void on(){
        System.out.println("Theater ceiling light on");
    }
}
