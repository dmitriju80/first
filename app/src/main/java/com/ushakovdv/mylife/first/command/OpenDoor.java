package com.ushakovdv.mylife.first.command;

public class OpenDoor implements Interface{
    Command command;
    public OpenDoor (Command command){this.command=command;}
    @Override
    public void execute() {
System.out.println("Дверь открыта");
    }
}
