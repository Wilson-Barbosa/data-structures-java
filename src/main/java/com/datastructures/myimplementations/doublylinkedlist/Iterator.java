package com.datastructures.myimplementations.doublylinkedlist;

public class Iterator<T> {

    private DoublyLinkedList<T> list;
    private Link<T> currentLink;

    /**
     * Returns an Iterator instance for the List passed as argument.
     * 
     * @param list the iterator for the list
     */
    public Iterator(DoublyLinkedList<T> list) {
        this.list = list;
        this.currentLink = list.getFirstLink();
    }

    /** Returns the element the Iterator currently points to */
    public T getCurrent() {
        return currentLink.getElement();
    }

    /**
     * Moves the iterator to the next element in the list and returs it. Returns
     * null if there is no nexts element.
     */
    public T getNext() {
        if (hasNext()) {
            currentLink = currentLink.getNext();
            return currentLink.getElement();
        }
        return null;
    }

    /**
     * Moves the iterator to the previous element in the list and returs it. Returns
     * null if there is no previous element.
     */
    public T getPrevious() {
        if (hasPrevious()) {
            currentLink = currentLink.getPrevious();
            return currentLink.getElement();
        }
        return null;
    }

    /** Makes the iterator point to the first element in the list */
    public void reset() {
        this.currentLink = list.getFirstLink();
    }

    /** Returns true if there is a next element in the list. */
    public boolean hasNext() {
        return currentLink.getNext() != null;
    }

    /** Returns true if there is a previous element in the list. */
    public boolean hasPrevious() {
        return currentLink.getPrevious() != null;
    }
}
