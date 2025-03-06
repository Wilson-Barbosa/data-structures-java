package com.datastructures.myimplementations.singlylinkedlist;

/**
 * An element that goes inside a SinglyLinkedList.
 */
public class Link<T> {

    private T element;
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

    public Link<T> getNext() {
        return next;
    }

    public void setNext(Link<T> next) {
        this.next = next;
    }

}
