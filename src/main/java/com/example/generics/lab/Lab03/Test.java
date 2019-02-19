package com.example.generics.lab.Lab03;


import java.util.Collections;
import java.util.List;


public class Test {

    public static void main(String... args) {

        List<Apple> apples = List.of(new Apple(1), new Apple(10));
        List<Orange> oranges = List.of(new Orange(1), new Orange(10));
        List<Fruit> fruits = List.of(new Apple(1), new Orange(10));

        System.out.println("Collections.max(apples).equals(new Apple(10)) = " + Test.max(apples).equals(new Apple(10)));
        System.out.println("Collections.max(oranges).equals(new Orange(10)) = " + Test.max(oranges).equals(new Orange(10)));// compile-time error
        // compile-time error
//        System.out.println("Collections.max(fruits).equals(new Orange(10)) = " + max(fruits).equals(new Orange(10)));

        System.out.println(Test.max(apples));
        System.out.println(Test.max(oranges));
        // compile-time error
//        System.out.println(Comparators.max(fruits));
//        System.out.println(Comparators.<Fruit>max(apples));

        Apple weeApple = new Apple(1);
        Apple bigApple = new Apple(2);
        apples = List.of(weeApple, bigApple);
        System.out.println("weeApple.compareTo(bigApple) = " + weeApple.compareTo(bigApple));
        System.out.println("Collections.max(apples) == bigApple = " + (Collections.max(apples) == bigApple));
    }

    //max
}
