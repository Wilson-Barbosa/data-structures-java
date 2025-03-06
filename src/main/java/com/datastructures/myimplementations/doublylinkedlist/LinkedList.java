package com.datastructures.myimplementations.doublylinkedlist;

/**
 * Generic implementation of a Doubly LinkedList. Allows for duplicate
 * items.
 */
public class LinkedList<T> {

    private Link<T> first;
    private Link<T> last;

    /**
     * Creates an emtpy list
     */
    public LinkedList() {

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
    public T removeLast(){
        Link<T> lastItem = last;
        last.getPrevious().setNext(null);;

        return lastItem.getElement();
    }

    public T getFirst() {
        return first.getElement();
    }

    public T getLast() {
        return last.getElement();
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


