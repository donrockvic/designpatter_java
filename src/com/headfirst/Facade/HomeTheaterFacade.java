package com.headfirst.Facade;

import com.headfirst.Facade.appliances.*;


public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popcorn;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer streamingPlayer, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popcorn) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = streamingPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popcorn = popcorn;
    }

    public void watchMovie(String movie){
        System.out.println("Get Ready to watch a movie...");
        popcorn.on();
        popcorn.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundingSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting down the theater mode...");
        popcorn.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }
}
