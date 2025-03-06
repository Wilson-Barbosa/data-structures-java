package com.datastructures.myimplementations.doublylinkedlist;

/**
 * An element that goes inside a Doubly LinkedList
 */
public class Link<T> {

    private T element;
    private Link<T> previous;
    private Link<T> next;

    public Link(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Link<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Link<T> previous) {
        this.previous = previous;
    }

    public Link<T> getNext() {
        return next;
    }

    public void setNext(Link<T> next) {
        this.next = next;
    }

}
