package com.manoj.practice.searching;

public class LinearSearch {
    private int arraySize = 10;
    private int[] array = new int[arraySize];

    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();

        obj.fillData();

        obj.display();

        obj.linearSearch(20);

    }

    public void fillData() {
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 100);
        }

    }

    public void display() {
        System.out.println("-------");
        String indexes = "| ";
        String values = "| ";

        for (int i = 0; i < arraySize; i++) {
            indexes = indexes + i + " | ";
            values = values + array[i] + " | ";

        }
        System.out.println(indexes);
        System.out.println(values);
        System.out.println("-------");

    }

    public void linearSearch(int value) {
        System.out.println("-------");

        String indexes = "|";
        boolean isFound = false;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == value) {
                indexes = indexes + i + " | ";
                isFound = true;
            }
        }
        if (!isFound) {
            indexes = "Not found";
        }
        System.out.println(value + " found at " + indexes);
        System.out.println("-------");

    }

}
