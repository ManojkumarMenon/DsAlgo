package com.manoj.practice.interviewQuestions;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    /**
     * Merge two sorted arrays to have non duplicates.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] data1 = { 5, 8, 9 };
        int[] data2 = { 1, 2, 5, 8, 9 };

        int data3[] = new int[data1.length + data2.length];

        int length = data1.length > data1.length ? data1.length : data2.length;
        int pointer = 0;

        for (int i = 0; i < length; i++) {

            if (data1[pointer] < data2[i]) {
                data3[i] = data1[pointer];
                pointer++;
                i--;

            }
            else if (data1[pointer] == data2[i]) {
                data3[i] = data1[pointer];
                pointer++;
            }
            else {
                data3[i] = data2[i];
            }

        }
        System.out.println(String.format("Data after merging: %s", Arrays.toString(data3)));

    }

}
