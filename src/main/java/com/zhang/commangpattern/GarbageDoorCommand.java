package com.zhang.commangpattern;

public class GarbageDoorCommand implements Command {
    GarbageDoor garbageDoor;
    public GarbageDoorCommand(GarbageDoor garbageDoor){this.garbageDoor = garbageDoor;}
    @Override
    public void execute() {
        garbageDoor.open();
    }
}
