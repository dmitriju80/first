package com.ushakovdv.mylife.first.command;

public class Client {
    public  void run (){

        Command c = new Command();
        OpenDoor open = new OpenDoor(c);
        Invoker i=new Invoker();

        i.setCommand(open);
        i.exe();
    }
}
