package myimplementations;

/**
 * Implementation of a queue data structure using a Double-ended LinkedList.
 */
public class Queue<T> {

    private T end;
    private T front;
    private DoublyLinkedList<T> list;


    public Queue(){
        
    }

    public void enqueue(T element){
        list.addAtStart(element);
        front = list.getFirst();
    }

    public T dequeue(){
        T e = list.removeLast();
        end = list.getLast();
        return e;
    }

    public T peek(){
        return list.getLast();
    }

}
