package com.example.basics.hetfo;

import kedd.Main;

import java.util.Arrays;
import java.util.Objects;

public class Apple {
    public String colour;
    public long size;



    public Apple(String appleColour, long appleSize){
        colour = appleColour;
        size = appleSize;
    }

    public static void main(String[] args) {

        int[] intArr = new int[]{1,2,3};
        String[] strArr;
        Fruit[] fruitArr;

        int a = 5;
        intArr = new int[a];


        intArr = new int[]{5,6,7,4,7,9};


        strArr = new String[]{"egy", "ketto"};
        Apple[] appleArr = new Apple[] {
                new Apple("red",10),
                new Apple("yellow", 10)
        };
        System.out.println("String tömb nulladik eleme " + Arrays.toString(strArr));

    }
}
