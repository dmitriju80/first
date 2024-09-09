package com.ushakovdv.mylife.first.command;

public class Invoker {
    Interface i;
    public void setCommand (Interface i){this.i=i;}
    public void exe (){i.execute();}
}
