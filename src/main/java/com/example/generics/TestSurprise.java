package com.example.generics;

import static com.example.generics.Surprise.*;

public class TestSurprise {

    public static void main(String[] args) {


        Object o = Integer.valueOf(13);

        int i = cast(o);
        String s = cast(o);
    }

}
