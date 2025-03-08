package com.datastructures.myimplementations.singlylinkedlist;

/**
 * <p>
 * Generic implementation of a LinkedList, more specifically a Double-ended
 * LinkedList (not confuse with a Doubly LinkedList). The list itself allows
 * for duplicates and it's not ordered upon creation or insertion.
 * </p>
 * 
 * <p>
 * I'm building this so that I can use throught the repository.
 * </p>
 */
public class SinglyLinkedList<T> {

    private Link<T> first;
    private Link<T> last;

    /**
     * Creates an emtpy list.
     */
    public SinglyLinkedList() {

    }

    /**
     * Add a new element to the beginning of the list.
     * 
     * @param element is the element to be added.
     */
    public void addAtStart(T element) {

        Link<T> newLink = new Link<>(element);

        if (isEmpty()) {
            first = newLink;
            last = newLink;
        } else {
            newLink.setNext(first);
            first = newLink;
        }

    }

    /**
     * Returns the number of elements inside the list.
     * 
     * @return the list's size
     */
    public int size() {

        if (isEmpty()) {
            return 0;
        } else {

            Link<T> current = first;
            int count = 0;

            while (current != null) {
                count++;
                current = current.getNext();
            }

            return count;
        }
    }

    /**
     * Removes the first element inside the list and returns it.
     * If the list is emtpy returns null.
     * 
     * @return the first element
     */
    public T removeFirst() {

        if (!isEmpty()) {
            T e = first.getElement();
            first = first.getNext();
            return e;
        }

        return null;
    }

    /** Returns the first element of the list or null if its empty */
    public T getFirst() {
        return first.getElement();
    }

    /** Returns the last element of the list or null if its empty */
    public T getLast() {
        return last.getElement();
    }

    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Calls the toString method of the Element T and uses it to
     * print the list on the terminal (appending --> after each element).
     */
    public void printList() {

        if (isEmpty()) {
            System.out.println("The list is empty");
        } else {

            Link<T> current = first;
            String output = "Start: ";

            while (current != null) {
                output += current.getElement().toString() + " --> "; // TODO fix the printing here
                current = current.getNext();
            }
            output += "null";

            System.out.println(output);
        }
    }

    public Link<T> getFirstLink() {
        return first;
    }

    public Link<T> getLastLink() {
        return last;
    }

    /**
     * Returns an Iterator object for this class that initially
     * points to the first element inside the list.
     * 
     * @return an iterator instance
     */
    public Iterator<T> getIterator() {
        return new Iterator<>(this);
    }

}


