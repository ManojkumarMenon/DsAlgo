package com.manoj.practice.trees;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InsertBinaryTree {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Node root = new Node();
        root.setValue(100);

        Node leftNode1 = new Node();
        leftNode1.setValue(200);

        Node leftNode11 = new Node();
        leftNode11.setValue(400);

        // Node rightNode11 = new Node();
        // rightNode11.setValue(500);

        leftNode1.setLeftNode(leftNode11);
        // leftNode1.setRightNode(rightNode11);

        Node rightNode2 = new Node();
        rightNode2.setValue(300);

        Node leftNode21 = new Node();
        leftNode21.setValue(600);

        Node rightNode21 = new Node();
        leftNode21.setValue(700);

        rightNode2.setLeftNode(leftNode21);
        rightNode2.setRightNode(rightNode21);

        root.setLeftNode(leftNode1);
        root.setRightNode(rightNode2);

        System.out.println(mapper.writeValueAsString(root));

        insertValue(root, 900);

        System.out.println(mapper.writeValueAsString(root));

    }

    public static void insertValue(Node root, int value) {

        Queue<Node> queue = new LinkedBlockingQueue<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            Node node = queue.peek();
            queue.remove();

            if (node == null) {
                node = new Node();
                node.setValue(value);
                break;
            }

            Node rightNode = node.getRightNode();
            if (rightNode == null) {
                rightNode = new Node();
                rightNode.setValue(value);
                node.setRightNode(rightNode);
                break;
            }
            else {
                queue.add(rightNode);
            }

            Node leftNode = node.getLeftNode();
            if (leftNode == null) {
                leftNode = new Node();
                leftNode.setValue(value);
                node.setLeftNode(leftNode);
                break;
            }
            else {
                queue.add(leftNode);
            }

        }
    }

}

// Class representing a tree
class Node {

    private int value;
    private Node rightNode;
    private Node leftNode;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    @Override
    public String toString() {
        return "Node [v=" + value + ", r=" + rightNode + ", l=" + leftNode + "]";
    }

}