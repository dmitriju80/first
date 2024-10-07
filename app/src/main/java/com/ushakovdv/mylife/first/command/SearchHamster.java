package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class SearchHamster implements Interface{
   public Command command;
   public SearchHamster (Command command){this.command=command;}
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

    }
}
