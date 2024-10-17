package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class ExecutePrint implements Interface{
    Command command;
    ExecutePrint (Command command1){this.command=command1;}
    @Override
    public void execute(String commandName, HamsterFactory hamsterFactory) {

System.out.println(hamsterFactory.fabric);
    }
}
