package com.ushakovdv.mylife.first.command;

import java.security.PublicKey;

public class PartitionCommandName {
public String commandName;
public String part;
PartitionCommandName (String commandName){
    this.commandName=commandName;


}


    public String str(String commandName, String part) {
        String name = "";
        String command = "";
        String age = "";
        boolean commandSave = false;
        boolean comName = false;

        for (char i : commandName.toCharArray()){
            if ((i!=' ')&&(!commandSave)){
                command=command+i;}
            else if ((i==' ') && !commandSave){commandSave=true;}
            else if ((i!=' ') && !comName){
                name=name+i;
            }
            else if ((i==' ') && commandSave && !comName){comName=true;}
            else if ((i!=' ') && commandSave && comName){
                age=age+i;
            }
        }

        if (part.equalsIgnoreCase("Команда")){
    return command;
}
        else if (part.equalsIgnoreCase("Имя")){
            return name;
        }
        else if (part.equalsIgnoreCase("Возраст")){
            return age;
        }

        return "Требование не верно";
    }

}


