package com.example.generics.lab;

import java.util.Collection;
import java.util.List;

public class Lab01 {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3", "4", "5");
        System.out.println(strings);
        System.out.println("max(strings) = " + max(strings));

        List<Integer> ints = List.of(1, 2, 3, 4, 5);
        System.out.println(ints);
        System.out.println("max(ints) = " + max(ints));

        // Will not compile
//        List<Number> nums = List.of(1,2,3,4,5);
//        System.out.println(nums);
//        System.out.println("max(nums) = " + max(nums));
    }

    public static <T extends Comparable<T>> T max(Collection<T> coll) {
        T result = null;
        for (T elt : coll) {
            if (result == null || result.compareTo(elt) < 0) {
                result = elt;
            }
        }
        return result;
    }
}
