package com.datastructures.myimplementations;

import com.datastructures.myimplementations.doublylinkedlist.DoublyLinkedList;

/**
 * Implementation of a queue data structure using a DoublyLinkedList.
 */
public class Queue<T> {

    private T end;
    private T front;
    private DoublyLinkedList<T> list;


    public Queue(){
        
    }

    public void enqueue(T element){
        list.addAtStart(element);
        front = list.getFirstElement();
    }

    public T dequeue(){
        T e = list.removeLastElement();
        end = list.getLast();
        return e;
    }

    public T peek(){
        return list.getLast();
    }

}
