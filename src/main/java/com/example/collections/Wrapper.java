package com.example.collections;

public class Wrapper {
    private Object o;

    public Wrapper(Object o) {
        this.o = o;
    }

    public Object get() {
        return o;
    }

    public void set(Object o) {
        this.o = o;
    }
}
