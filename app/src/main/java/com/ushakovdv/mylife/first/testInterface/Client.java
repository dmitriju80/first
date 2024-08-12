package com.ushakovdv.mylife.first.testInterface;

public class Client {
    public void run() {

        Command command = new Command();
        OpenDoor open = new OpenDoor(command);
        CloseDoor close = new CloseDoor(command);
        Invoker invoker=new Invoker();
        invoker.setCommand(open);
        invoker.push();

    }
}