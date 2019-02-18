package com.example.exceptions.bestpractice;

public class App {
    public static void main(String[] args) {
        Expression[] array = {
                new Expression(1),
                new Expression(2),
                new Expression(3),
                new Expression(4),
                new Expression(5),
        };

        try {
            int i = 0;
            while(true) {
                array[i++].compute();
            }
        } catch (Exception e) {
            // haha end of for loop, do nothing
        }

    }
}
