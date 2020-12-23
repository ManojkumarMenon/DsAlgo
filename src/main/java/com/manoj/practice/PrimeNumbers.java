package com.manoj.practice;

public class PrimeNumbers {

    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            if (printPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean printPrime(int limitNo) {

        for (int i = 1; i < limitNo; i++) {
            if (limitNo % i == 0 && i > 1) {
                return false;
            }
        }
        return true;
    }
}