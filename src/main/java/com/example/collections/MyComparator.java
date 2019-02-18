package com.example.collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }

    public static void main(String[] args) {
        List<String> strings = new LinkedList<>(List.of("12", "1", "1234", "123"));


        Comparator<String> c = new MyComparator();

//        Collections.sort(strings, c);

        strings.sort(c.reversed());

        System.out.println(strings);
    }
}
