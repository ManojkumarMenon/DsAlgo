package com.manoj.practice;

public class ProductOfSubArrays {

    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4 };
        int product = 1;

        int pointer1 = 0;
        for (int i = 0; i < data.length; i++) {

            for (int j = i; j < data.length; j++) {
                int pointer2 = pointer1;

                System.out.print("[");
                while (pointer2 <= j) {
                    System.out.print(data[pointer2] + " ");

                    product = product * data[pointer2];
                    pointer2++;
                }
                System.out.print("]");

                System.out.println();
            }
            pointer1++;
        }

        System.out.println(String.format("Product : %s", product));
    }

}
