package com.manoj.practice.sorting;

import java.util.Arrays;

/* Moving the min/max  value to the end. Thereby creating a sorted sub array on one side  and unsorted sub array on the other side. Next operation on the unsorted part.
*/
public class SelectionSort {

    public static void main(String[] args) {
        int[] data = { 9, 1, 5, 7, 2, 4 };
        System.out.println(Arrays.toString(sortAsc(data)));
        System.out.println(Arrays.toString(sortDesc(data)));

    }

    public static int[] sortAsc(int[] data) {

        for (int i = 0; i < data.length; i++) {
            int min_index = i;
            for (int j = i; j < data.length; j++) {
                if (data[j] < data[min_index]) {
                    min_index = j;
                }
            }
            int t = data[min_index];
            data[min_index] = data[i];
            data[i] = t;
        }

        return data;
    }

    public static int[] sortDesc(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int max_index = i;
            for (int j = i; j < data.length; j++) {
                if (data[j] > data[max_index]) {
                    max_index = j;
                }
            }
            int t = data[max_index];
            data[max_index] = data[i];
            data[i] = t;
        }

        return data;
    }

}
