package com.manoj.practice.searching;

public class JumpSearch {

    // Data is already sorted
    public static void main(String[] args) {

        int[] data = { 2, 6, 9, 15, 19, 34, 56, 60, 70, 80, 91, };
        int blockSize = 4;

        doJumpSearch(data, 60, blockSize);

    }

    public static void doJumpSearch(int[] data, int number, int blockSize) {
        int count = 0;
        int nStartIndex = 0;
        int nEndIndex = data.length - 1;
        for (int i = 0; i < data.length; i = i + blockSize) {
            count++;

            if (data[i] <= number) {
                nStartIndex = i;
            }
            if (data[i] >= number) {
                nEndIndex = i;
                break;
            }
        }
        System.out.println(nStartIndex + " - " + nEndIndex);
        System.out.println("Count:- " + count);
        for (int i = nStartIndex; i <= nEndIndex; i++) {
            if (data[i] == number) {
                System.out.println("Found at :" + i);
            }
            count++;
        }

        System.out.println("Count:- " + count);

    }

}
