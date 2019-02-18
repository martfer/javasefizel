package com.example.basics.szerda;

import hetfo.Plum;

public class Valami {

    public static void main(String[] args) {

        Plum.doItStatic();

        Plum p = new Plum();
        Plum p1 = new Plum();
        Plum p2 = new Plum();

        p.doItInstance();
        p1.doItInstance();
        p2.doItInstance();

    }
}
