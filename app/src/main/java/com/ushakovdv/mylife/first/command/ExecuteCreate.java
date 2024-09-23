package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.Hamster;
import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class ExecuteCreate implements Interface{
    public Command command;
    public ExecuteCreate (Command command){
        this.command=command;
    }

    @Override
    public void execute(String commandName, HamsterFactory hamsterFactory) {
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

        hamsterFactory.fabric.add(new Hamster(name));
        System.out.println("Хомяк '" + name + "' создан и добавлен в хранилище");

    }
}
