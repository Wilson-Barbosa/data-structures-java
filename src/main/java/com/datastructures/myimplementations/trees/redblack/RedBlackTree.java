package com.datastructures.myimplementations.trees.redblack;

/** Implementation of a red-black tree. It does NOT allow duplicated values */
public class RedBlackTree<T> {

    private Node<T> root;

    public RedBlackTree() {

    }

    public void insert(T element) {

        if (isEmpty()) {
            Node<T> newNode = new Node<>(element);
            newNode.setRed(false);
            root = newNode;
        } else {

        }

    }

    public boolean isEmpty() {
        return root == null;
    }

}
