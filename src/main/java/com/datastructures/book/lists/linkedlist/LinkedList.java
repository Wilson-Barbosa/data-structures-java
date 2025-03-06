package com.datastructures.book.lists.linkedlist;

public class LinkedList {

    private Link firstLink;

    public LinkedList() {
        this.firstLink = null; // there is no items inside the list initially
    }

    /*
     * Adds a new link to the beginning of the list.
     */
    public void insertFirst(Link newLink) {
        System.out.println("Link inserted!");
        if (isEmpty()) {
            firstLink = newLink; // firstLink -> null
        } else {
            newLink.setNext(firstLink); // newFirst -> oldFirst -> null
            firstLink = newLink;
        }
    }

    public boolean isEmpty() {
        return firstLink == null;
    }

    /**
     * Traverses the list and for each element calls the display method.
     */
    public void displayList() {
        if (isEmpty()) {
            System.out.println("The List is empty");
        } else {

            // setting the first
            Link currentLink = firstLink;

            while (true) {

                currentLink.displayLink();
                if (currentLink.getNext() == null) {
                    break;
                }

                // with this line I should inspect the next link in the chain
                currentLink = currentLink.getNext();
            }

        }
    }

}
