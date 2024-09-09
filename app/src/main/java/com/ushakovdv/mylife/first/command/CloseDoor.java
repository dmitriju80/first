package com.ushakovdv.mylife.first.command;

public class CloseDoor implements Interface{
    Command command;
    public CloseDoor (Command command){this.command=command;}
    @Override
    public void execute() {
        System.out.println("Дверь закрыта");
    }
}
