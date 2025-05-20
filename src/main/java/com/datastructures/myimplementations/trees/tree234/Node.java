package com.datastructures.myimplementations.trees.tree234;

/**
 * A node that goes inside a 2-3-4 tree.
 */
public class Node {
    
    // These are the items it can have up to three
    private int[] items;

    // References for its children up to four
    private Node[] children;

    public Node() {

    }

    public int[] getItems() {
        return items;
    }

    public Node[] getChildren() {
        return children;
    }

}
