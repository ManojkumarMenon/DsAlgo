package com.manoj.practice.interviewQuestions;

import java.util.Arrays;

public class ArrangeZerosToRightOracleQuestion {

    /**
     * Method to arrange all non zeros to the left of the array and zeros to the
     * right with O(n) time complexity.
     * 
     * @param args
     */
    public static void main(String[] args) {

        int[] data = { 1, 5, 0, 4, 0, 9, 17, 0, 2, 89 };

        int pointer = 0;
        int zeroCounter = 0;
        System.out.println(String.format("Data before re-arranging %s", Arrays.toString(data)));

        for (int i = 0; i < data.length; i++) {

            if (data[i] == 0) {
                zeroCounter++;
            }
            else {
                data[pointer] = data[i];
                pointer++;
            }
        }

        for (int i = data.length - zeroCounter; i < data.length; i++) {
            data[i] = 0;
        }

        System.out.println(String.format("Data after re-arranging %s", Arrays.toString(data)));

    }

}
