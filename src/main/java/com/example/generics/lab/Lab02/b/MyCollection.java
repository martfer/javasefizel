package com.example.generics.lab.Lab02.b;

public interface MyCollection<E>  extends Iterable<E> {
    public boolean contains(E o);
    public boolean containsAll(MyCollection<? extends E> c);
}
