package com.datastructures.myimplementations.trees;

/**
 * Generic implementation of a Binary Search Tree. It allows for duplicate
 * elements.
 */
public class BinaryTree<T extends Comparable<T>> {

    private Node<T> root;

    /** Creates an empty tree. */
    public BinaryTree() {

    }

    public Node<T> getRootNode() {
        return root;
    }

    /**
     * Traverses the tree and prints on the terminal the first occurrence of the
     * element passed in as argument.
     * 
     * @param element
     */
    public void findFirst(T element) {

    }

    /**
     * Traverses the tree and prints on the terminal all occurrences of the element
     * passed in as argument.
     * 
     * @param element the element you want to search
     */
    public void findAll(T element) {

    }

    /**
     * Method that inserts a new Node in the tree containing the elemente passed as
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

                if (element.compareTo(current.getElement()) >= 0) { // go to the right

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

    /**
     * Returns the smallest element inside this tree or null if the list is emtpy.
     * 
     * @return the smallest element or null
     */
    public T getMinElement() {

        T element = null;

        if (isEmpty()) {
            System.out.println("tree is emtpy");
        } else {

            Node<T> current = root;
            while (current.getLeftChild() != null) {
                current = current.getLeftChild();
            }
            element = current.getElement();
        }

        return element;
    }

    /**
     * Returns the biggest element inside this tree or null if the list is emtpy.
     * 
     * @return the biggest element or null
     */
    public T getMaxElement() {
        T element = null;

        if (isEmpty()) {
            System.out.println("tree is Empty");
        } else {

            Node<T> current = root;
            while (current.getRightChild() != null) {
                current = current.getRightChild();
            }
            element = current.getElement();
        }

        return element;
    }

    /**
     * Removes the first occurrence of the passed element. This method uses the
     * compareTo() to determine the position and equals() to determine equality.
     * 
     * @param element is the element you want to remove
     */
    public void delete(T element) {

        if (isEmpty()) {
            System.out.println("tree is empty");
        } else {
            traversalDelete(element, root);
        }

    }

    private void traversalDelete(T element, Node<T> node) {

        if (node == null) {
            return;
        } else {

            if (element.compareTo(node.getElement()) >= 0) { // check the right
                
                if(element.equals(node.getElement())) { // found the item

                } else {
                    traversalDelete(element, node.getRightChild()); // go for the next
                }

            } else { // 

            }

        }

    }

    /**
     * Removes all occurrences of the passed element. This method uses the
     * compareTo() to determine the position and equals() to determine equality.
     * 
     * @param element
     */
    public void deleteAll(T element) {

    }

    public boolean isEmpty() {
        return root == null;
    }

    /**
     * 
     * @return an itera
     */
    public Iterator<T> getIterator() {
        return new Iterator<>(this);
    }
}
