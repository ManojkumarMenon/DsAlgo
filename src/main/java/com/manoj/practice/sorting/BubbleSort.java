package com.manoj.practice.sorting;

import java.util.Arrays;

// Comparing adjacent elements
public class BubbleSort {

    public static void main(String[] args) {
        int[] data = { 4, 2, 9, 5, 10, 1, 3 };

        System.out.println(Arrays.toString(sortAsc(data)));
        System.out.println(Arrays.toString(sortDesc(data)));
    }

    public static int[] sortAsc(int[] data) {
        int count = 0;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int t = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = t;
                }
                count++;
            }
        }
        System.out.println(count);
        return data;
    }

    public static int[] sortDesc(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int t = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = t;
                }
            }
        }

        return data;
    }
}
