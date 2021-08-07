package com.headfirst.Facade.appliances;

public class Projector {
    public static void  on(){
        System.out.println("Projector On");
    }

    public void wideScreenMode(){
        System.out.println("Projector in widescreen mode (16X9 aspect ratio)");
    }

    public void off(){
        System.out.println("Projector off");
    }
}
