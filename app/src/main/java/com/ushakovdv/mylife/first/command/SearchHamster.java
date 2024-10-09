package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.Hamster;
import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class SearchHamster implements Interface{
   public Command command;
   public SearchHamster (Command command){this.command=command;}
    @Override
    public void execute(String commandName, HamsterFactory hamsterFactory) {

        String name = ""; //вызвать функцию имени из экземпляра класса ReadCommand
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

        Hamster hamster = new Hamster(name,Integer.parseInt(age));

        for (Hamster i : hamsterFactory.fabric){
            if(hamster.hashCode()==i.hashCode()){
                if (hamster.equals(i)){
                    System.out.println("Хомячки одинаковы");
                }
                else {System.out.println("Не сошлись в полях");}
            }
            else {
                System.out.println("не сошлись даже в хэшкоде");
            }

        }


    }
}
