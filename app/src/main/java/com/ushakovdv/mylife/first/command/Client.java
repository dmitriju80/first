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


         if (command.equalsIgnoreCase("Создать")){
            ExecuteCreate Ecreat = new ExecuteCreate(c);
            Invoker i=new Invoker();
            i.setCommand(Ecreat);
            i.exe(commandName, hamsterFactory);
        }







    }


}
