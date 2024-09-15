package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class Client {
    public  void run (String commandName, HamsterFactory hamsterFactory){

        Command c = new Command();

        if (commandName.equalsIgnoreCase("Печать")){
            ExecutePrint Eprint = new ExecutePrint(c);
            Invoker i=new Invoker();
            i.setCommand(Eprint);
            i.exe();
        }





    }


}
