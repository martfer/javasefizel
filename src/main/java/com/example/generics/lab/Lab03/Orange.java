package com.example.generics.lab.Lab03;

public class Orange extends Fruit implements Comparable<Orange> {
    public Orange(int size) {
        super("Orange", size);
    }

    public int compareTo(Orange that) {
        return this.size < that.size ? -1 : this.size == that.size ? 0 : 1;
    }
}
