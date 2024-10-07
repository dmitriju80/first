package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.Hamster;
import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class DeleteIndex implements Interface {
    public Command command;
    public DeleteIndex (Command command){this.command=command;}
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

        if ((Integer.parseInt(name)+1) <= hamsterFactory.fabric.size()){
            hamsterFactory.fabric.remove(Integer.parseInt(name));
            System.out.println("Хомяк '" + name + "' удален из хранилища");
        }
        else {
            System.out.println("Хомякa '" + name + "' пока не существует");
        }
    }
}
