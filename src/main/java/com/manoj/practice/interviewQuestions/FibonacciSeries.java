package com.manoj.practice.interviewQuestions;

public class FibonacciSeries {

    public static void main(String[] args) {
        printFiboSeries(1, 1, 5);
    }

    public static void printFiboSeries(int i1, int i2, int count) {

        if (count == 0)
            return;
        System.out.print(i1 + i2 + " ");
        printFiboSeries(i2, i1 + i2, count = count - 1);
    }

}
