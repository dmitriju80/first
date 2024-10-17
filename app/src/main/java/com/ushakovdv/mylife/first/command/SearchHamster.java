package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.Hamster;
import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class SearchHamster implements Interface{
   public Command command;
   public SearchHamster (Command command){this.command=command;}
    @Override
    public void execute(String commandName, HamsterFactory hamsterFactory) {

        PartitionCommandName pcn = new PartitionCommandName(commandName);
        String name = pcn.str(commandName,"Имя");
        String command = pcn.str(commandName,"Команда");
        String age = pcn.str(commandName,"Возраст");




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
