package com.manoj.practice.interviewQuestions;

import java.util.LinkedList;

public class CustomLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        MyLinkedList<String> myCustomList = new MyLinkedList();
        myCustomList.add("Manoj");
        myCustomList.add("Menon");
        myCustomList.add("Menon");

        System.out.println(myCustomList.get(0));
        System.out.println(myCustomList.get(1));
        System.out.println(String.format("Size of the linkedlist: %s", myCustomList.getSize()));

    }

}

class MyLinkedList<I> {

    private Node<I> head;
    private Node<I> tail;
    private int size;

    public void add(I i) {
        if (head == null) {
            head = new Node(i, null, null);
            tail = head;
        }
        else {
            Node<I> newNode = new Node(i, tail, null);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public I get(int index) {

        Node<I> node = head;

        while (index > 0) {
            node = head.getNext();
            index--;
        }

        return node.getI();
    }

    public int getSize() {
        return size;
    }

}

class Node<I> {

    I i;
    Node<I> prev;
    Node<I> next;

    public Node(I i, Node<I> prev, Node<I> next) {
        super();
        this.i = i;
        this.prev = prev;
        this.next = next;
    }

    public I getI() {
        return i;
    }

    public void setI(I i) {
        this.i = i;
    }

    public Node<I> getPrev() {
        return prev;
    }

    public void setPrev(Node<I> prev) {
        this.prev = prev;
    }

    public Node<I> getNext() {
        return next;
    }

    public void setNext(Node<I> next) {
        this.next = next;
    }

}