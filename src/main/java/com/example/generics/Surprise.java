package com.example.generics;

public class Surprise {

        public static <E> E cast(Object o ) {
            return (E)o;
        }
}
