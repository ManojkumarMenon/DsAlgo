package com.manoj.practice.interviewQuestions;

public class PrimeNumber {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(String.format("%s", isPrime(n, n - 1)));
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
