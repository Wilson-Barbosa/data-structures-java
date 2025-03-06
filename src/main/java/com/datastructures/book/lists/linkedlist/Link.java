package com.datastructures.book.lists.linkedlist;

/**
 * Class that implements LinkedList element called, well, Link. This is done by following
 * Lafore's book, but from what I understand, people usually call this a node.
 * 
 * Note that the last element of a linked list must point to null. So this can be used
 * as a condition to verify when we stop the iteration process.
 */
public class Link {

    private int num;
    private String name;
    private Link next;

    public Link(int num, String name) {
        this.num = num;
        this.name = name;
    }


    public void displayLink(){
        System.out.println("{ " + num + ", " + name + " }");
    }


    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Link getNext() {
        return next;
    }


    public void setNext(Link next) {
        this.next = next;
    }

    
}
