package com.datastructures.myimplementations.trees;

/**
 * Iterator that provides consistent access for the elements of a Binary Search
 * tree.
 */
public class Iterator<T extends Comparable<T>> {

    private BinaryTree<T> tree;
    private Node<T> currentNode;

    public Iterator(BinaryTree<T> tree) {
        this.tree = tree;
        currentNode = tree.getRootNode();
    }

    public T getCurrent() {
        return currentNode.getElement();
    }

    public void traverseRight() {
        if (hasRightNode()) {
            currentNode = currentNode.getRightChild();
        } else {
            System.out.println("Node doesn't have a right child.");
        }
    }

    public void traverseLeft() {
        if (hasLeftNode()) {
            currentNode = currentNode.getLeftChild();
        } else {
            System.out.println("Node doesn't have a left child.");
        }
    }

    public boolean hasLeftNode() {
        return currentNode.getLeftChild() != null;
    }

    public boolean hasRightNode() {
        return currentNode.getRightChild() != null;
    }

    public void reset() {
        currentNode = tree.getRootNode();
    }

}
