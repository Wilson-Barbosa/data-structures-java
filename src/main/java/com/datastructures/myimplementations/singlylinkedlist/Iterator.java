package com.datastructures.myimplementations.singlylinkedlist;

/**
 * An Iterator is a class that allows users to access the items in the list.
 * Methods like insertBefore or insertAfter would be better implemented inside
 * the list itself, but, for the sake of time, let's just add them here.
 */
public class Iterator<T> {

    private Link<T> current;
    private Link<T> previous;
    private SinglyLinkedList<T> list;

    /**
     * Creates a new Iterator instance for the instance passed as an argument
     * and points to the first element of the list.
     */
    public Iterator(SinglyLinkedList<T> list) {
        this.list = list;
        current = list.getFirstLink();
    }

    /**
     * Returns the reference that the iterator currently holds
     */
    public T getCurrent() {
        return current.getElement();
    }

    /** Makes the current Iterator point to the first element inside the list */
    public void reset() {
        current = list.getFirstLink();
    }

    /**
     * Moves the Iterator to point to the next Link in the list. This is the
     * method used to effectively traverse the list.
     */
    public T nextLink() {
        previous = current;
        current = current.getNext();
        return current.getElement();
    }

    /**
     * Returns true if the Iterator points to the last item inside
     * the list of false if not.
     */
    public boolean atEnd() {
        return current.getNext() == null;
    }

    /**
     * Deletes the item the iterator currently points at
     */
    public void deleteCurrent() {
        previous.setNext(current.getNext());
    }

    /** Inserts a new element just after the one the Iterator points to. */
    public void insertAfter(T element) {
        Link<T> newLink = new Link<>(element);
        newLink.setNext(current.getNext());
        current.setNext(newLink);
    }

    /** Inserts a new element just before the one the Iterator points to. */
    public void insertBefore(T element) {

        if (list.isEmpty()) {
            list.addAtStart(element);
        } else {
            Link<T> newLink = new Link<>(element);
            previous.setNext(newLink);
            newLink.setNext(current);
        }
    }
}