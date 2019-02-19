package com.example.generics.basics;

public class Wrapper<E> {
    private E value;

    public Wrapper() {
    }

    public Wrapper(E o) {
        this.value = o;
    }

    public E get() {
        return value;
    }

    public void set(E o) {
        this.value = o;
    }

}
