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
        PartitionCommandName pcn = new PartitionCommandName(commandName);
        String name = pcn.str(commandName,"Имя");
        String command = pcn.str(commandName,"Команда");
        String age = pcn.str(commandName,"Возраст");

        hamsterFactory.fabric.add(new Hamster(name,Integer.parseInt(age)));

        System.out.println("Хомяк '" + name + "' создан и добавлен в хранилище");

    }
}
