package com.example.generics.lab.Lab02.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollectionImpl<E> implements MyCollection<E> {

    @Override
    public boolean contains(E o) {
        return false;
    }

    @Override
    public boolean containsAll(MyCollection<? extends E> c) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
