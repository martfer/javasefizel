package com.example.generics.lab.Lab03.b;


import java.util.Collection;
import java.util.List;


public class Test {

    public static void main(String... args) {
        Apple big = new Apple(999);

        List<Apple> apples = List.of(new Apple(1), new Apple(10));
        List<Orange> oranges = List.of(new Orange(1), new Orange(10));
        List<Fruit> fruits = List.of(new Apple(1), new Orange(10));


        Apple max = max(apples);
        System.out.println(max(apples) );


        System.out.println("max(apples).equals(new Apple(10)) = " + max(apples).equals(new Apple(10)));
        System.out.println("max(oranges).equals(new Orange(10)) = " + max(oranges).equals(new Orange(10)));
//        // compile-time error
        System.out.println("max(fruits).equals(new Orange(10)) = " + max(fruits).equals(new Orange(10)));
        System.out.println(max(fruits));
        System.out.println(Test.<Fruit>max(apples));

        Apple weeApple = new Apple(1);
        Apple bigApple = new Apple(2);
        apples = List.of(weeApple, bigApple);
        System.out.println("weeApple.compareTo(bigApple) = " + weeApple.compareTo(bigApple));
        System.out.println("max(apples) == bigApple = " + (max(apples) == bigApple));
    }
    
    public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
        T result = null;
        for (T elt : coll) {
            if (result == null || result.compareTo(elt) < 0) {
                result = elt;
            }
        }
        return result;
    }
}
