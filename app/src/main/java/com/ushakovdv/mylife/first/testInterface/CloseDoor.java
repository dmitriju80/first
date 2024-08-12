package com.ushakovdv.mylife.first.testInterface;

public class CloseDoor implements Interface{
    Command command;
    public CloseDoor (Command command){this.command=command;}
    @Override
    public void execute(){
        command.closeDoor();
    }
}
