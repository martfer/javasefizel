package com.example.boxing;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int j = 13;
        int ii = Integer.parseInt("FF", 16);
        System.out.println(ii);


        List<Integer> list = new ArrayList<>();
//        lI.add("cica");
        list.add(ii);
        list.add(j);
        Integer result = list.get(0);
        System.out.println(result + Integer.valueOf(3));

        Integer k = 315;
        Integer l = 315;

        System.out.println(k == l);


    }
}
