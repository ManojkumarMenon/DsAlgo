package com.manoj.practice.interviewQuestions;

public class LinkedListImpl {

    public static void main(String[] args) {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<String>();
        list.add("Manoj");
        System.out.println(list.getSize());
        list.add("Menon");
        System.out.println(list.getSize());

        System.out.println(list.toString());
    }

}

class MyCustomLinkedList<T> {
    private MyLinketListNode<T> head;
    private MyLinketListNode<T> tail;
    private int size = 0;

    public void add(T t) {

        if (size == 0) {
            head = new MyLinketListNode<T>();
            head.setData(t);
            tail = head;
            size++;
        }
        else {

            MyLinketListNode<T> nextNode = new MyLinketListNode<T>();
            nextNode.setData(t);

            tail.setNextNode(nextNode);
            tail = nextNode;
            size++;
        }

    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyCustomLinkedList [head=" + head + ", tail=" + tail + ", size=" + size + "]";
    }

}

class MyLinketListNode<T> {

    private T data;
    private MyLinketListNode<T> nextNode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyLinketListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyLinketListNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "MyLinketListNode [data=" + data + ", nextNode=" + nextNode + "]";
    }

}
