package com.ushakovdv.mylife.first.testInterface;

public class OpenDoor implements Interface{
    Command command;
    public OpenDoor (Command command){this.command=command;}

    @Override
    public void execute() {
        command.openDoor();
    }
}
