package com.example.basics.kedd;

public class MethodCallDemo {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3};

        String result = arrayToString(intArr);


        System.out.println(result);
        System.out.println(arrayToString2(intArr));


    }

    public static String arrayToString(int[] arr) {
        String result = "[";

        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
            if (i < arr.length - 1) {
                result += ", ";
            }
        }

        return result + "]";
    }


    public static String arrayToString2(int[] arr) {
        String result = "[";
        String separator = "";

        for (int i : arr) {
            result = result + separator + i;
            separator = ", ";
        }
        return result + "]";
    }

}
