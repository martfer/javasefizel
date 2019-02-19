package com.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> list =  new ArrayList<>(List.of("1","2","3"));

//        list.add(1);

        String s = list.get(3);

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.hasNext());
        }


    }
}
