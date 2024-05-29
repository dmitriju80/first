package com.ushakovdv.mylife.first;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.ushakovdv.mylife.first.bank.Bank;
import com.ushakovdv.mylife.first.bank.BankAccount;

public class MainActivity extends AppCompatActivity {

    //BankAccount createNewAccount(String typeAccount, String currency)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hamster bite = new Hamster(); // Объявили переменную с типом Hamster
        bite.runInWheel();

        //public BankAccount createNewAccount(String typeAccount, String currency)
     Bank Ushakov = new Bank();
    Ushakov.createNewAccount("debit_account","RUB");
Ushakov.showBalance();
    }

    public class Hamster {
        String name = "Bite";
        int age = 15;
        String color = "Белый"; // Цвет
        int weight = 350; // Вес

        public void runInWheel(){
            System.out.println ("Бегу, Бегу, Бегу!");
            weight+=5;
        }

    }

}