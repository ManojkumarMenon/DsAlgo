package com.manoj.practice.searching;

public class BinarySearch {

    private static int[] numbers = { 1, 5, 78, 90, 100 };

    private static int count = 0;

    public static void main(String[] args) {
        // O(log n)
        binarySearch(79, 0, numbers.length - 1);
        System.out.println("Count = " + count);
    }

    private static void binarySearch(int numberToSearch, int startIndex, int endIndex) {
        count++;
        int midleIndex = startIndex + ((endIndex - startIndex) / 2);

        if (numbers[midleIndex] > numberToSearch) {
            binarySearch(numberToSearch, startIndex, midleIndex - 1);
        }
        else if (numbers[midleIndex] < numberToSearch) {
            binarySearch(numberToSearch, midleIndex + 1, endIndex);
        }
        else if (numbers[midleIndex] == numberToSearch) {
            System.out.println("Number present at :- " + midleIndex);
        }
        else {
            System.out.println("Number not present");
        }
    }

}
