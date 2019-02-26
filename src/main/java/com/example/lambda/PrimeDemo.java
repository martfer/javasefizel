package com.example.lambda;

public class PrimeDemo {

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println("5 is prime: " + isPrime(5));
        System.out.println("76 is prime: " + isPrime(76));
        System.out.println("3253452 is prime: " + isPrime(3253452));
        long stop = System.nanoTime();
//        System.out.println("Computation took " + (stop - start) / 1000_000_000D +  " seconds\n");
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
}
