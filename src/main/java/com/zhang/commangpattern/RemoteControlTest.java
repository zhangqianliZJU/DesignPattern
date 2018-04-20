package com.zhang.commangpattern;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarbageDoor garbageDoor = new GarbageDoor();
        GarbageDoorCommand garbageDoorCommand = new GarbageDoorCommand(garbageDoor);
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garbageDoorCommand);
        remote.buttonWasPressed();
    }
}
