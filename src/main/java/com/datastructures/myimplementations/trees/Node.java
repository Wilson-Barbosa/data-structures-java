package com.datastructures.myimplementations.trees;

/**
 * Node that goes inside a Binary tree. It has two references, one for each of
 * it's children: right and left
 */
public class Node<T> {

    private T element;
    private Node<T> rightChild;
    private Node<T> leftChild;
    // private Node<> parent;  <--  It's possible to add a reference for the parent
    //                              node and this can simplify some operations, but complicate others.

    public Node(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

}