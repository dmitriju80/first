package com.ushakovdv.mylife.first.hare;

import java.util.ArrayList;

public class Main {
    public void run (){
                ArrayList hares = new ArrayList<>();
                hares.add(new MountainHare(4, 4.4, 120));
                hares.add(new MountainHare(7, 3.6, 150));
                hares.add(new MountainHare(1, 2.3, 100));

                System.out.println("В лесу лето!");
                Forest summer = new Forest(hares);
                summer.setSeason("лето");
                // задайте сезон "лето"
                // создайте объект "летний лес с зайцами"
                System.out.println("Список зайцев:");
                summer.printHares();
                // напечатайте список всех зайцев
                System.out.println("В лесу зима!");
        summer.setSeason("зима");
        summer.printHares();
                // поменяйте время года на зиму
                // напечатайте список всех зайцев

        }

    }

