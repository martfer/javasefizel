package com.example.generics.lab.Lab02.a;

public interface MyCollection<E> extends Iterable<E> {
    public boolean contains(Object o);
    public boolean containsAll(MyCollection<?> c);
}
