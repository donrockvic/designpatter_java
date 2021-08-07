package com.headfirst.homeAutomation;

import com.headfirst.homeAutomation.devices.*;

public class MicroRemote {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff  = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        remoteControl.onButtonWasPushed(0);
        System.out.println();
        remoteControl.offButtonWasPushed(0);
    }
}
