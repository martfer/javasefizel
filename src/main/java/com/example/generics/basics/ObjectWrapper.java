package com.example.generics.basics;

public class ObjectWrapper {
    private Object o;

    public ObjectWrapper(Object o) {
        this.o = o;
    }

    public Object get() {
        return o;
    }

    public void set(Object o) {
        this.o = o;
    }
}
