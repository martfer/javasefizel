package com.example.basics.szerda;

import java.util.Arrays;

public class LoopDemo {

    public static void main(String[] args) {


        int[] intArr = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {

            System.out.println("intArr[" + i + "] = " + intArr[i]);
            sum = sum + intArr[i];
        }

        System.out.println("Sum = " + sum);

//        sum = 0;
        for (int e : intArr) {
//            System.out.println(e);
            e = e * 2;
//            sum = sum + e;
        }
        System.out.println(Arrays.toString(intArr));


//        int j = 0;
//        while (j < 0) {
//            System.out.println(j);
//            j++;
//        }
//
//        int k = 0;
//        do {
//            System.out.println(k);
//            k++;
//        } while (k < 0);


    }

}
