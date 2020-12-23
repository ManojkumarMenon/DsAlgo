package com.manoj.practice.interviewQuestions;

public class NPrimeNumber {

    public static void main(String[] args) {
        printPrime(20);
    }

    public static void printPrime(int n) {
        System.out.println(1);
        for (int i = 2; i < n; i++) {
            if (isPrime(i, i - 1))
                System.out.println(i);
        }
    }

    public static boolean isPrime(Integer n, Integer divisor) {
        if (divisor == 1) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        else {
            return isPrime(n, divisor - 1);
        }
    }

}
