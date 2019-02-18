package com.example.basics.szerda;

import java.util.Arrays;

public class TwoDimDemo {


    public static void main(String[] args) {
        int[][] twoDim = new int[][]  {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] twoDim2 = new int[3][];
        twoDim2[0] = new int[]{1, 2, 3};
        twoDim2[1] = new int[]{4, 5};
        twoDim2[2] = new int[]{7};

//        System.out.println(Arrays.toString(twoDim[0]));


        for (int i = 0; i < twoDim2.length ; i++) {
            for (int j = 0; j < twoDim2[i].length ; j++) {
                System.out.print(twoDim2[i][j] + " ");
            }
            System.out.println();
        }


    }

}
