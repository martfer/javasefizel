package com.example.nested;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    private static class MyComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    }


    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("123", "2"));

        Comparator<String> sCmp = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        list.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));


        System.out.println(list);
    }
}

