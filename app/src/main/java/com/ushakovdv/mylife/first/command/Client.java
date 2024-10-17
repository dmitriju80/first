package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class Client {
    public  void execute (String commandName, HamsterFactory hamsterFactory){

        Command c = new Command();
        PartitionCommandName pcn = new PartitionCommandName(commandName);
        String name = pcn.str(commandName,"Имя");
        String command = pcn.str(commandName,"Команда");
        String age = pcn.str(commandName,"Возраст");



         if (command.equalsIgnoreCase("Создать")){
            ExecuteCreate ecreat = new ExecuteCreate(c);
            Invoker i=new Invoker();
            i.setCommand(ecreat);
            i.exe(commandName, hamsterFactory);
        }

         else if (command.equalsIgnoreCase("Печать")){
            ExecutePrint executePrint = new ExecutePrint(c);
            Invoker i=new Invoker();
            i.setCommand(executePrint);
            i.exe(commandName, hamsterFactory);

         }
         else if (command.equalsIgnoreCase("Удалить")){
             DeleteIndex deleteIndex = new DeleteIndex(c);
             Invoker i=new Invoker();
             i.setCommand(deleteIndex);
             i.exe(commandName, hamsterFactory);

         }
         else if (command.equalsIgnoreCase("Поиск")){
             SearchHamster searchHamster = new SearchHamster(c);
             Invoker i=new Invoker();
             i.setCommand(searchHamster);
             i.exe(commandName, hamsterFactory);
         }







    }


}
