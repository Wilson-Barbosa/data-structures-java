package com.datastructures.book.queues;
/**
 * Implementation of a queue using an array if int numbers. The implementation does not
 * check if the queue is full before inserting or empty before removing, leaving this
 * responsability to the client (accordingly the book examples).
 */
public class IntQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int maxSize;

    public IntQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new int[maxSize];
        this.front = -1;
        this.rear = -1;
    }

    public void insert(int element) {
        if (front == -1) {
            front++;
        }
        rear++;
        queue[rear] = element;
    }

    public int remove() {
        int e = queue[front];
        front++;
        return e;
    }

    public int peek() {
        return queue[front];
    }

    public boolean isEmpty() {
        return (front == rear);
    }

    public boolean isFull() {
        return (rear == maxSize - 1);
    }

    public void printQueueElements() {
        System.out.println("Queue contents are: ");
        for (int i = front; i <= rear; i++) {
            if(i == front) {
                System.out.println(queue[i] + " <-- front");
            } else if(i == rear) {
                System.out.println(queue[i] + " <-- rear");
            } else {
                System.out.println(queue[i]);
            }
            
        }
    }
}
