package com.manoj.practice.trees;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * Incomplete code.
*/
public class BinarySearchTree {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        BSTNode root = new BSTNode();
        root.setValue(100);

        BSTNode.add(root, 10);

        BSTNode.add(root, 20);

        System.out.println(mapper.writeValueAsString(root));

        BSTNode.add(root, 900);

        System.out.println(mapper.writeValueAsString(root));
    }

}

class BSTNode {

    private int value;
    private BSTNode rightNode;
    private BSTNode leftNode;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BSTNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BSTNode rightNode) {
        this.rightNode = rightNode;
    }

    public BSTNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BSTNode leftNode) {
        this.leftNode = leftNode;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + ", rightNode=" + rightNode + ", leftNode=" + leftNode + "]";
    }

    public static void add(BSTNode node, int value) {
        if (value < node.value) {
            if (node.getLeftNode() == node) {
                BSTNode temp = new BSTNode();
                temp.setValue(value);
                node.setLeftNode(temp);
            }
            else {
                add(node.getLeftNode(), value);
            }
        }
        else if (value > node.value) {
            if (node.getRightNode() == node) {
                BSTNode temp = new BSTNode();
                temp.setValue(value);
                node.setRightNode(temp);
            }
            else {
                add(node.getRightNode(), value);

            }
        }
        else {
            System.out.println("Value is same as the parent node value...");
        }
        return;
    }
}
