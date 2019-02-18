package com.example.basics.hetfo;

public class Plum {

    private static int stCnt = 0;
    private int counter = 0;

    public Plum() {
        counter = ++stCnt;
    }

    public static void doItStatic() {
         System.out.println("doItStatic()");
        System.out.println();
     }

     public void doItInstance() {
         System.out.println("doItInstance() " + counter);

     }

}
