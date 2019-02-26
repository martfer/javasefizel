package com.example.lambda;

import java.util.function.*;

public class TestFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> square1 = x -> x * x;
        Function<Integer, String> tmp = x -> String.valueOf(x * x);
        IntFunction<String> square2 = x -> String.valueOf(x * x) + "!!!";
        ToIntFunction<String> square3 = s -> Integer.parseInt(s) * Integer.parseInt(s);
        UnaryOperator<Integer> square4 = x -> x * x;

        // Create some predicates
        Predicate<Integer> greaterThanTen = x -> x > 10;
        Predicate<Integer> divisibleByThree = x -> x % 3 == 0;
        Predicate<Integer> divisibleByFive = x -> x % 5 == 0;
        Predicate<Integer> equalToTen = Predicate.isEqual(null);



    }
}
