package com.ushakovdv.mylife.first.testInterface;

public class Invoker {
    Interface i;
    public void setCommand (Interface i){this.i=i;}
    public void push (){i.execute();}


}
