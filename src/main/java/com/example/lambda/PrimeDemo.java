package com.example.lambda;

import java.util.stream.IntStream;

public class PrimeDemo {

    public static void main(String[] args) {
//        long start = System.nanoTime();
//        System.out.println("5 is prime: " + isPrime(5));
//        System.out.println("76 is prime: " + isPrime(76));
//        System.out.println("3253452 is prime: " + isPrime(3253452));
//        long stop = System.nanoTime();
//        System.out.println("Computation took " + (stop - start) / 1000_000_000D +  " seconds\n");
//        System.out.printf("Computation took %.3f seconds\n", (stop - start) / 1000_000_000D);

        long start = System.nanoTime();
//        long cnt =0;
//        for (int i = 1; i < 100000 ; i++) {
//            if(isPrime(i)) {
//                System.out.println(i);
//                cnt++;
//            }
//        }

        long cnt = IntStream.range(1, 3_000)
                .parallel()
                .filter(PrimeDemo::isPrime) // filter(isPrime)
                .filter(i -> true)
                .peek(System.out::println)
                .count();
        System.out.println("found " + cnt + " primes");

        long stop = System.nanoTime();
        System.out.printf("Computation took %.3f seconds\n", (stop - start) / 1000_000_000D);

    }

    public static boolean isPrime(int number) {
        if (number < 3) {
            return true;
        }
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int number) {
//        if (number < 3) {
//            return true;
//        }
        return number < 3 || IntStream.range(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }
}
