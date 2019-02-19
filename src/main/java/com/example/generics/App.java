package com.example.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println(toList(1, 2));
//        System.out.println(toList("1","2"));
//        System.out.println(App.<String>toList("Hello", 1));
//        String s = toList("Hello", Integer.valueOf(1)).get(0);

    }



    public static <E extends Comparable<E>> List<E> toList(E e1, E e2) {
        List<E> result = new ArrayList<>();
        result.add(e1);
        result.add(e2);
        return result;
    }
}
