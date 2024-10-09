package com.ushakovdv.mylife.first;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.ushakovdv.mylife.first.bank.Bank;
import com.ushakovdv.mylife.first.bank.BankAccount;
import com.ushakovdv.mylife.first.hamster.Hamster;
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

        HamsterFactory hamsterFactory = new HamsterFactory();

        hamsterFactory.start("Создать Barsik 26");
        hamsterFactory.start("Печать");
        hamsterFactory.start("Поиск Barsik 25");

/*

*/


        hamsterFactory.start("Удалить 0");
        hamsterFactory.start("Печать");
        hamsterFactory.start("Удалить 1");
        hamsterFactory.start("Печать");

    }



}