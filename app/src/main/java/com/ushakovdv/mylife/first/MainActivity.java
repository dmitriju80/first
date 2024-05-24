package com.ushakovdv.mylife.first;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




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
    public class Praktikum {
        public void main(String[] args) {
            Hamster bite = new Hamster(); // Объявили переменную с типом Hamster
            bite.runInWheel();
        }

    }
}