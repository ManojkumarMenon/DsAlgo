package com.manoj.practice;

import java.util.Arrays;

public class ZerosToRight {

    public static void main(String[] args) {

        UsingTwoForLoops();
        UsingOneForLoops();

    }

    private static void UsingOneForLoops() {
        int[] data = { 1, 0, 0, 12, 0, 9, 0, 7, 1 };
        int nonZeroPointer = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0) {
                data[nonZeroPointer] = data[i];
                nonZeroPointer++;
            }
        }
        while (nonZeroPointer < data.length) {
            data[nonZeroPointer] = 0;
            nonZeroPointer++;
        }

        System.out.println("Using one for loop:-" + Arrays.toString(data));
    }

    private static void UsingTwoForLoops() {
        int[] data = { 1, 0, 0, 12, 0, 9, 0, 7, 1 };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] == 0 && data[j + 1] != 0) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        System.out.println("Using two for loops:- " + Arrays.toString(data));
    }

}
