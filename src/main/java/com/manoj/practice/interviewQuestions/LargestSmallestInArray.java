package com.manoj.practice.interviewQuestions;

public class LargestSmallestInArray {
    // Finding largest and smallest no in an unsorted array
    public static void main(String[] args) {
        int[] data = { 5, -1, 9, 8, 200, 4, 100 };
        largestSmallest(data);
    }

    public static void largestSmallest(int[] data) {
        int largestInd = 0;
        int smallestInd = 0;

        for (int i = 1; i < data.length; i++) {
            int ts = data[smallestInd];
            int tl = data[largestInd];
            if (ts > data[i])
                smallestInd = i;

            if (tl < data[i])
                largestInd = i;
        }
        System.out.println("Largest No:-" + data[largestInd] + " - Smallest No:- " + data[smallestInd]);
    }
}
