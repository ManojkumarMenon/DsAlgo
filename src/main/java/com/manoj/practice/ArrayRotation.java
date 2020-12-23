package com.manoj.practice;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {

        int[] data = { 23, 4, 65, 12 };

        int rotationInput = 4;

        for (int i = 0; i < rotationInput; i++) {
            int temp = data[0];
            for (int j = 0; j < data.length - 1; j++) {
                data[j] = data[j + 1];

            }
            data[data.length - 1] = temp;
            System.out.println(Arrays.toString(data));
        }

    }

}
