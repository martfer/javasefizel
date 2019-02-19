package com.example.generics.lab.Lab02.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollectionImpl<E> implements MyCollection<E> {

    private List<E> values;

    public MyCollectionImpl(List<E> values) {
        this.values = new ArrayList<>(values);
    }

    @Override
    public boolean contains(E o) {
        return values.contains(o);
    }

    @Override
    public boolean containsAll(MyCollection<? extends E> c) {
        for (Object o : c) {
            if ( !values.contains(o) ) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return values.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return values.iterator();
    }
}
