package com.manoj.practice;

import java.util.Arrays;

public class ArrayRotationJugglingAlgo {

    public static void main(String[] args) {

        int G_C_D = gcd(10, 3);
        int temp, i, j;
        System.out.println(G_C_D);

        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (i = 0; i < G_C_D; i++) {
            temp = data[i];
            for (j = i; j < data.length - G_C_D; j = j + G_C_D) {
                data[j] = data[j + G_C_D];
            }
            data[j] = temp;
            System.out.println(Arrays.toString(data));
        }

        System.out.println(Arrays.toString(data));

    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
