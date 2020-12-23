package com.manoj.practice.searching;

public class BinarySearch2 {

    private static int[] numbers = { 1, 2, 4, 7, 9, 11, 12, 13, 14, 15 };

    private static int count = 0;

    public static void main(String[] args) {
        // O(log n)
        int index = binarySearch(8, 0, numbers.length - 1);
        System.out.println(String.format("Index = %s and count= %s ", index, count));
    }

    public static int binarySearch(int checkNo, int startIndex, int endIndex) {
        int index = -1;

        if (startIndex != endIndex) {
            int midIndex = (endIndex - startIndex) / 2;
            midIndex = startIndex + midIndex;
            // if (midIndex > 0 && midIndex < endIndex + 1) {

            if (numbers[midIndex] > checkNo) {
                System.out.println(String.format("Checking between %s - %s", startIndex, midIndex));
                index = binarySearch(checkNo, startIndex, midIndex);
            }
            else if (numbers[midIndex] < checkNo) {
                System.out.println(String.format("Checking between %s - %s", midIndex + 1, endIndex));
                index = binarySearch(checkNo, midIndex + 1, endIndex);
            }
            else if (numbers[midIndex] == checkNo) {
                index = midIndex;
            }
        }

        count++;
        return index;
    }

}
