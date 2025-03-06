package com.datastructures.book.trees;

import com.datastructures.book.arrays.OrderedArray;

/**
 * Binary Search Tree implementation. It can store int values only.
 */
public class IntBinaryTree {

    private Node root;

    public IntBinaryTree() {

    }

    /** Creates a binary tree from the array (the first element will be the root) */
    public IntBinaryTree(int[] arr) {

        for (int n : arr) {
            insert(n);
        }

    }

    /** Creates a balanced binary tree using the element at the middle as root */
    public IntBinaryTree(OrderedArray arr) {

        // first I get the middle item and insert it as root
        int[] a = arr.getArray();
        int middleIndex = a.length / 2;

        // after that I iterate the array and insert the elements, except middle one
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[middleIndex]) {
                insert(a[i]);
            }
        }
    }

    public void insert(int key) {

        Node newNode = new Node(key);

        if (isEmpty()) {
            root = newNode; // first insertion
            System.out.println("Item " + key + " inserted at root");
        } else {

            Node current = root;

            // will loop until a node with a proper child==null if found:
            while (true) {

                int currentKey = current.getElement();

                if (key >= currentKey) { // go to right child

                    if (current.getRightChild() == null) { // can insert here?
                        current.setRightChild(newNode);
                        System.out.println("Item " + key + " inserted at right position of " + currentKey);
                        return;
                    } else {
                        current = current.getRightChild();
                    }

                } else { // to to left child

                    if (current.getLeftChild() == null) { // can insert here?
                        current.setLeftChild(newNode);
                        System.out.println("Item " + key + " inserted at left position of " + currentKey);
                        return;
                    } else {
                        current = current.getLeftChild();
                    }
                }

            }

        }

    }

    /** Traverse the tree and tries to find the number passed as an argument */
    public void find(int key) {

        boolean wasFound = false;
        int numLvls = 0;

        if (isEmpty()) {
            System.out.println("Tree is empty.");
        } else {

            Node current = root;
            Node previous = null;

            while (current != null) {

                if (key == current.getElement()) {

                    System.out.println(
                            "Item " + key + " found at level " + numLvls + " It's parent is: " + previous.getElement());
                    wasFound = true;
                    break;

                } else if (key >= current.getElement()) {
                    previous = current;
                    current = current.getRightChild();
                } else {
                    previous = current;
                    current = current.getLeftChild();
                }

                numLvls++;
            }

            if (!wasFound) {
                System.out.println("Item " + key + " was not found");
            }

            System.out.println("Number of levels accessed: " + (numLvls + 1));

        }

    }

    public void printAllElements(){
        traverseInorder(root);
    }

    public int size(){
        int count = 0;



        return count;
    }

    public void traverseInorder(Node localRoot) {

        // base case
        if (localRoot == null) {
            return;
        } else {
            System.out.println("Item is: " + localRoot.getElement());
        }

        // visit the left node
        traverseInorder(localRoot.getLeftChild());

        // visit the right node
        traverseInorder(localRoot.getRightChild());

    }

    public void delete(int key) {

    }

    public boolean isEmpty() {
        return root == null;
    }
}

/** Node for a BST that stores int numbers */
class Node {

    private int element;
    private Node rightChild;
    private Node leftChild;

    public Node(int element) {
        this.element = element;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

}