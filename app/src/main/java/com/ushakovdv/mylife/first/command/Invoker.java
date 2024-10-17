package com.ushakovdv.mylife.first.command;

import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class Invoker {
    Interface i;
    public void setCommand (Interface i){this.i=i;}
    public void exe (String commandName, HamsterFactory hamsterFactory){i.execute(commandName, hamsterFactory);}


}
