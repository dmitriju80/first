package com.ushakovdv.mylife.first;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.ushakovdv.mylife.first.bank.Bank;
import com.ushakovdv.mylife.first.bank.BankAccount;
import com.ushakovdv.mylife.first.command.Client;
import com.ushakovdv.mylife.first.hamster.HamsterFactory;

public class MainActivity extends AppCompatActivity {

    //BankAccount createNewAccount(String typeAccount, String currency)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BankAccount Ushakov=new Bank().createNewAccount("debit_account","RUB");
        Ushakov.showBalance();
        BankAccount Ulya=new Bank().createNewAccount("credit_account","USD");

        HamsterFactory prog = new HamsterFactory();
        prog.start("Печать");
    }



}