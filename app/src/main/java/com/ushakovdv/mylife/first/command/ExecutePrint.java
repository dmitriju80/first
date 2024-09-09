package com.ushakovdv.mylife.first.command;

public class ExecutePrint implements Interface{
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
