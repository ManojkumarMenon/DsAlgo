package com.manoj.practice.sorting;

import java.util.Arrays;

// Sorting as per the insertion order.
public class InsertionSort {

    public static void main(String[] args) {
        int[] data = { 4, 2, 9, 5, 10, 1, 3 };
        data = sort(data);
        System.out.println(Arrays.toString(data));
    }

    public static int[] sort(int[] data) {

        for (int i = 1; i < data.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int cur = data[j];
                int next = data[j + 1];
                if (cur > next) {
                    int t = cur;
                    data[j] = next;
                    data[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(data));
        return data;
    }
}
