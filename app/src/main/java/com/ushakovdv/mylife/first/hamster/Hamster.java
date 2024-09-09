package com.ushakovdv.mylife.first.hamster;

import java.util.Objects;

public class Hamster {
    String name;

    public Hamster(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Хомяк: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Hamster)) {
            return false;
        }

        return Objects.equals(name, ((Hamster) o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
