package com.manoj.practice.interviewQuestions;

public class CommonArrayElements {

    public static void main(String[] args) {
        // Problem statement:- find the common elements in two sorted arrays
        int[] t1 = { 1, 2, 4, 7, 8, 9 };
        int[] t2 = { 1, 4, 5, 7, 9, 10, 20 };

        int size = t1.length > t2.length ? t1.length : t2.length;
        int pointer1 = 0;

        for (int i = 0; i < size; i++) {

            if (pointer1 < t1.length && t1[pointer1] < t2[i]) {
                pointer1++;
            }
            if (pointer1 < t1.length && t1[pointer1] == t2[i]) {
                System.out.println(t1[pointer1]);
                pointer1++;
            }
        }
    }
}
