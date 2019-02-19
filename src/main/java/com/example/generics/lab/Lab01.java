package com.example.generics.lab;

import java.util.List;

public class Lab01 {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3", "4", "5");
        System.out.println(strings);
        System.out.println("max(strings) = " + max(strings));

        // Will not compile
//        List<Number> nums = List.of(1,2,3,4,5);
//        System.out.println(nums);
//        System.out.println("max(nums) = " + max(nums));
    }

//    public static max(Collection<T> coll) {
//}
}
