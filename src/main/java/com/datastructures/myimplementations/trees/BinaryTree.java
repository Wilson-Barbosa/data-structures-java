package com.datastructures.myimplementations.trees;

/**
 * Generic implementation of a Binary Search Tree. It allows for duplicate
 * elements.
 */
public class BinaryTree<T extends Comparable<T>> {

    private Node<T> root;

    /**
     * Creates an empty tree.
     */
    public BinaryTree() {

    }

    public void find(T element) {

        if (isEmpty()) {
            System.out.println("Tree is empty");
        } else {

            Node<T> current = root;

        }

    }

    public void traverInorder(){
        
    }

    /**
     * Method that insert a new Node in the tree containing the elemente passed as
     * argument. It uses the compareTo() method to determine the position, so you
     * need to override it on your class.
     * 
     * @param element the element you want to insert
     */
    public void insert(T element) {

        Node<T> newNode = new Node<>(element);

        if (isEmpty()) {
            root = newNode;
        } else {

            Node<T> current = root;

            // traverse the tree
            while (true) {

                if (element.compareTo(current.getElement()) >= 0) { // to the right

                    if (current.getRightChild() == null) { // can insert on right child?
                        current.getRightChild().setRightChild(newNode);
                        break;
                    } else {
                        current = current.getRightChild();
                    }

                } else { // go to the left

                    if (current.getLeftChild() == null) { // can insert on left child?
                        current.getLeftChild().setLeftChild(newNode);
                        break;
                    } else {
                        current = current.getLeftChild();
                    }

                }
            }

        }

    }

    public void delete(T element) {

    }

    public boolean isEmpty() {
        return root == null;
    }
}

/**
 * Node that goes inside a Binary tree. It has two references, one for each of
 * it's children: right and left
 */
class Node<T> {

    private T element;
    private Node<T> rightChild;
    private Node<T> leftChild;
    // private Node<> parent; <-- It's possible to add a reference for the parent
    // node and
    // this can simplify some operations, but complicate others.

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