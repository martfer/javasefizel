package com.example.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Collection<String> coll =  List.of("1","2","3");

        Iterator<String> it = coll.iterator();
        while(it.hasNext()) {
            System.out.println(it.hasNext());
        }


    }
}
