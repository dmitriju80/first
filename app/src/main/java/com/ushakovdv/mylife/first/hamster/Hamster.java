package com.ushakovdv.mylife.first.hamster;

import java.util.Objects;

public class Hamster {
    String name;
    int age;

    public Hamster(String name,int age) {
        this.name = name;this.age=age;
    }

    @Override
    public String toString() {
        return "Хомяк: " + name;
    }

    @Override
    public boolean equals(Object o) {
        // проверяем ссылки. Если они равны, то они указывают на один и тот же участок памяти, а значит, объекты точно эквивалентны между собой
        if (this == o) {
            return true;
        }
        // проверяем, что наш Object o действительно является объектом класса Person. Если это не так, то объекты точно не равны
        if (!(o instanceof Hamster)) {
            return false;
        }
        // сравниваем поля. Если все поля равны, значит, и объекты эквивалентны друг другу
        final Hamster hamster = (Hamster) o;
        return age == hamster.age && name.equals(hamster.name);

        //return Objects.equals(name, ((Hamster) o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}
