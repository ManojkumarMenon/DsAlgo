package com.manoj.practice;

public class FindSubArray {

    public static void main(String[] args) {

        // No of sub arrays are n*(n+1)/2

        int data[] = { 1, 2, 3, 4, 5 };

        int pointer = 0;

        for (int i = 0; i < data.length; i++) {

            for (int j = i; j < data.length; j++) {

                int index = pointer;
                System.out.print("[");
                while (index <= j) {

                    System.out.print(data[index] + " ");
                    index++;
                }
                System.out.print("]");

                System.out.println();
            }

            pointer++;
        }
    }

}
