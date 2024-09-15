package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class ExecutePrint implements Interface{
    public Command command;
    public HamsterFactory hamsterFactory;
    public ExecutePrint (Command command){
        this.command=command;
    }

    @Override
    public void execute() {
System.out.println("Вывожу актуальный список хомяков в хранилище:"+hamsterFactory);


//}
    }
}
