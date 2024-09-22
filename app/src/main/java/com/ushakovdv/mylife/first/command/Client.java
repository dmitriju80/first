package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class Client {
    public  void execute (String commandName, HamsterFactory hamsterFactory){

        Command c = new Command();
        String name = "";
        String command = "";
        boolean commandSave = false;
        for (char i : commandName.toCharArray()){
            if ((i!=' ')&&(!commandSave)){
            command=command+i;}
            else if (i==' '){commandSave=true;}
            else if (i!=' '){
                name=name+i;
            }
        }

        if (commandName.equalsIgnoreCase("Печать")){
            ExecutePrint Eprint = new ExecutePrint(c);
            Invoker i=new Invoker();
            i.setCommand(Eprint);
            i.exe();
        }
        else if (commandName.equalsIgnoreCase("Создать")){
            ExecuteCreate Ecreat = new ExecuteCreate(c);
            Invoker i=new Invoker();
            i.setCommand(Ecreat);
            i.exe();
        }







    }


}
