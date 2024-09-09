package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.Hamster;
import com.ushakovdv.mylife.first.hamster.HamsterFactory;

import java.util.ArrayList;

public class executePrint implements Interface{
    public Command command;
    public void executePrint (Command command){
        this.command=command;
    }
    @Override
    public void execute() {
System.out.println("Вывожу актуальный список хомяков в хранилище:");
//for ( Hamster i : fabric){

//}
    }
}
