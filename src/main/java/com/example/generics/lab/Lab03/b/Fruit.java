package com.example.generics.lab.Lab03.b;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit> {
    protected String name;
    protected int size;

    public Fruit(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int compareTo(Fruit that) {
        return Integer.compare(this.size, that.size);
    }

    public boolean equals(Object o) {
        if (o instanceof Fruit) {
            Fruit that = (Fruit) o;
            return this.name == that.name && this.size == that.size;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.name + "(" + size + ")";
    }


}
