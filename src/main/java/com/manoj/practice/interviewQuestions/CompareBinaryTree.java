package com.manoj.practice.interviewQuestions;

// Comparing two binary trees.
public class CompareBinaryTree {

    public static void main(String[] args) {
        BinaryNode l2n1 = new BinaryNode(20, null, null);

        BinaryNode ln1 = new BinaryNode(10, l2n1, null);
        BinaryNode rn1 = new BinaryNode(30, null, null);

        BinaryNode ln2 = new BinaryNode(10, null, null);
        BinaryNode rn2 = new BinaryNode(30, null, null);

        BinaryNode n1 = new BinaryNode(5, ln1, rn1);
        BinaryNode n2 = new BinaryNode(5, ln2, rn2);
        System.out.println(isEqual(n1, n2));

    }

    public static boolean isEqual(BinaryNode n1, BinaryNode n2) {

        if (n1 != null && n2 != null && n1.getValue() == n2.getValue()) {
            if (n1.getlNode() != null && n2.getlNode() == null || n1.getlNode() == null && n2.getlNode() != null) {
                return false;
            }
            if (n1.getrNode() != null && n2.getrNode() == null || n1.getrNode() == null && n2.getrNode() != null) {
                return false;
            }
            if (n1.getlNode() == null && n2.getlNode() == null && n1.getrNode() == null && n2.getrNode() == null) {
                return true;
            }
            return isEqual(n1.getlNode(), n2.getlNode()) && isEqual(n1.getrNode(), n2.getrNode());

        }
        else {
            return false;
        }

    }
}

class BinaryNode {
    public int value;
    public BinaryNode lNode;
    public BinaryNode rNode;

    BinaryNode(int v, BinaryNode ln, BinaryNode rn) {
        this.value = v;
        this.lNode = ln;
        this.rNode = rn;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryNode getlNode() {
        return lNode;
    }

    public void setlNode(BinaryNode lNode) {
        this.lNode = lNode;
    }

    public BinaryNode getrNode() {
        return rNode;
    }

    public void setrNode(BinaryNode rNode) {
        this.rNode = rNode;
    }

}
