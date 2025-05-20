package com.datastructures.myimplementations.trees.tree234;

/**
 * An int implementaton of a 2-3-4 tree. For simplicity duplicates items are not
 * allowed. Also 0 is not allowed.
 */
public class Tree234 {

    private Node root;

    // Empty constructor
    public Tree234() {

    }

    /**
     * Adds a new element
     * 
     * @param e
     */
    public void add(int e) {
        if(e == 0) {
            return;
        }
    }

    // delete

    /**
     * 
     * @param e the element you want to find
     * @return the e elment of 0 if the item doesn't exist
     */
    public int search(int e) {

        Node current = root;

        while (current != null) {

            // start from root
            for (int i = 0; i <= 3; i++) { // check the items inside this node
                if (e == current.getItems()[i]) {
                    return e;
                }
            }

            // if not found there evaluate where to go
            if (e < current.getItems()[0]) {
                current = current.getChildren()[0];
            } else
            if (e > current.getItems()[0] && e < current.getItems()[1]) {
                current = current.getChildren()[1];
            } else
            if (e > current.getItems()[1] && e < current.getItems()[2]) {
                current = current.getChildren()[2];
            } else
            if (e > current.getItems()[3]) {
                current = current.getChildren()[3];
            }
        }

        return 0;
    }

    public boolean isEmpty() {
        return root == null;
    }

}
