package com.example.basics.hetfo;

import java.util.Arrays;

public class Fruit {

    private int valami;
    private long hosszu;
    private double  size;
    private float lebego;

    public Fruit(int valami) {
        this.valami = valami;
    }

    public Fruit(long hosszu) {
        this.hosszu = hosszu;
    }

    public Fruit(double size) {
        this.size = size;
    }

    public Fruit() {
        this(-1,-1,-1D,-1F);
    }

    public Fruit(int valami, long hosszu, double size, float lebego) {
        this.valami = valami;
        this.hosszu = hosszu;
        this.size = size;
        this.lebego = lebego;
    }

    public Fruit(float lebego) {
        this.lebego = lebego;
    }

    public Fruit returnSelf() {
        return this;
    }

    public static void main(String[] args) {
        Fruit f = new Fruit();

        f = new Fruit(1.0F);

        f = new Fruit(124343545646L);


        long l = 86585856585L;
        int ii = (int)l;

        int[] iarr = null;
        String result = Arrays.toString(iarr);
        System.out.println(result);


//        Fruit ff = f.returnSelf();
//
//        System.out.println(ff == f);
//
//        String s1 = new String("cica");
//        String s2 = new String("cica");
//        System.out.println(s1.equals(s2));

    }

}
