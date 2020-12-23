package com.manoj.practice.interviewQuestions;

import java.util.Arrays;

public class CustomArrayList {

    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>(2);

        myList.add("Manoj1");
        myList.add("Manoj2");
        myList.add("Manoj3");
        myList.add("Manoj4");
        myList.add("Manoj5");

        System.out.println(String.format("Arraylist size: %s", myList.getSize()));
        System.out.println(String.format("List data: %s", myList.toString()));
    }

}

class MyArrayList<I> {
    private Object[] data;
    private int capacity = 16;
    private int size = 0;

    MyArrayList(int capacity) {
        this.capacity = capacity;

        data = new Object[this.capacity];
    }

    MyArrayList() {
        data = new Object[this.capacity];
    }

    public void add(I i) {
        if (size >= capacity) {
            reHash();
        }
        data[size] = i;
        size++;
    }

    public void reHash() {
        this.capacity = this.capacity + this.capacity;
        data = Arrays.copyOf(data, this.capacity);
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyArrayList [data=" + Arrays.toString(data) + ", capacity=" + capacity + ", size=" + size + "]";
    }

}