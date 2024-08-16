package com.ushakovdv.mylife.first.hare;

public class MountainHare {
    private int age;
    private double weight;
    private int jumpLength;
    static String color;

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }
@Override
    public String toString() {
        return "Заяц-беляк { " +
                "возраст = " + age +
                ", вес = " + weight +
                ", длина прыжка = " + jumpLength +
                ", цвет = " + color +
                " }";
    }
}
