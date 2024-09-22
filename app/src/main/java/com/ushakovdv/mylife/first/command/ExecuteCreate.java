package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.Hamster;
import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class ExecuteCreate (String name) implements Interface{
    public Command command;

    public HamsterFactory hamsterFactory;

    public ExecuteCreate (Command command){
        this.command=command;
    }
    @Override
    public void execute() {
        Уже передал name в комманде!

        Hamster hamster = new Hamster();
        hamsterFactory.fabric.add(hamster);

    }
}
