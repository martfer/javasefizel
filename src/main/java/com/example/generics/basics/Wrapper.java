package com.example.generics.basics;

import com.example.generics.Employee;

public class Wrapper<E extends Employee> {
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
