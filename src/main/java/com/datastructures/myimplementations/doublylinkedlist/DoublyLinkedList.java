package com.datastructures.myimplementations.doublylinkedlist;

/**
 * Generic implementation of a Doubly LinkedList. Allows for duplicate
 * items.
 */
public class DoublyLinkedList<T> {

    private Link<T> first;
    private Link<T> last;

    /**
     * Creates an emtpy list
     */
    public DoublyLinkedList() {

    }

    /**
     * Adds a new element at the start position in the list.
     * 
     * @param element
     */
    public void addAtStart(T element) {

        Link<T> newLink = new Link<>(element);

        if (isEmpty()) { // first insertion
            first = newLink;
            last = newLink;
        } else {

            newLink.setNext(first);
            first.setPrevious(newLink);

            first = newLink;
        }

    }

    /**
     * Removes the first occurrence of the element passed in the argument.
     * The element of type T should override equals(), since this method
     * uses it to compare then for equality.
     * 
     * @param element the element to be removed
     */
    public void remove(T element) {

        Link<T> current = first;

        while (current != null) {

            if (current.equals(element)) {

                // adjust the pointer for the next element
                current.getNext().setPrevious(current.getPrevious());

                // adjust the pointer for the previous element
                current.getPrevious().setNext(current.getNext());

                break;
            }

            current = current.getNext();
        }

    }

    /**
     * Removes all occurrences
     */
    public void removeAll(T element) {

        Link<T> current = first;

        while (current != null) {

            if (current.equals(element)) {
                // adjust the pointer for the next element
                current.getNext().setPrevious(current.getPrevious());

                // adjust the pointer for the previous element
                current.getPrevious().setNext(current.getNext());
            }

            current = current.getNext();
        }

    }

    /** Removes the last item in the list */
    public T removeLastElement() {
        Link<T> lastItem = last;
        last.getPrevious().setNext(null);
        ;

        return lastItem.getElement();
    }

    /** Returns the element at the start of the list */
    public T getFirstElement() {
        return first.getElement();
    }

    /** Returns the element at the end of the list */
    public T getLast() {
        return last.getElement();
    }

    /** Returns the first Link inside the list */
    public Link<T> getFirstLink() {
        return first;
    }

    /** Returns the last Link inside the list */
    public Link<T> getLastLink() {
        return last;
    }

    /**
     * Returns the the amount of elements inside this list.
     * 
     * @return the list's size
     */
    public int size() {
        int count = 0;
        Link<T> current = first;

        while (current != null) {
            count++;
            current.getNext();
        }

        return count;
    }

    /**
     * Returns true if the list is empty or false if not
     */
    public boolean isEmpty() {
        return first == null && last == null;
    }
}
