//package com.headfirst.homeAutomation;
//
//import com.headfirst.homeAutomation.devices.*;
//
//public class RemoteControlTest {
//    public static void main(String[] args) {
//        SimpleRemoteControl remote =  new SimpleRemoteControl();
//
//        // light
//        Light light = new Light();
//        LightOnCommand lightOn = new LightOnCommand(light);
//
//        //garage
//        GarageDoor garageDoor = new GarageDoor();
//        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
//
//        remote.setCommand(lightOn);
//        remote.buttonWasPressed();
//        remote.setCommand(garageDoorOpen);
//        remote.buttonWasPressed();
//    }
//}
