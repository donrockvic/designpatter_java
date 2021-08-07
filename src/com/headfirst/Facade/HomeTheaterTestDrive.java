package com.headfirst.Facade;

import com.headfirst.Facade.appliances.*;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner =  new Tuner();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcorn = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popcorn);
        homeTheater.watchMovie("Vicky - The Don");
        homeTheater.endMovie();






















    }
}
