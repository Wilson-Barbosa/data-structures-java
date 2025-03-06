package com.datastructures.book.stacks;

/**
 * Array implementation of a stack. It allows only for int values to be
 * stored inside it.
 */
public class StackArray {

    private int maxSize;
    private int top;
    private int[] stack;

    public StackArray(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.top = -1;
    }

    /**
     * Receives an element and tries to put at the top of the stack
     * 
     * @param e
     */
    public void push(int e) {
        if (!isStackFull()) {
            top++;
            stack[top] = e;
        } else {
            System.out.println("Stack is already full.");
        }
    }

    /**
     * Removes the item located at the top of the stack and returns it. If the stack
     * is empty
     * then returns -1.
     * 
     * @return the item removed at the top of the stack or -1 if the stack is empty
     */
    public int pop() {

        if (!isStackEmpty()) {
            int e = stack[top];
            top--;
            return e;
        } else {
            System.out.println("Stack is empty");
            return top;
        }

    }

    /**
     * Returns the element 
     * @return
     */
    public int peek() {
        return stack[top];
    }

    private boolean isStackEmpty() {
        return (top == -1 ? true : false);
    }

    private boolean isStackFull() {
        return (top == maxSize - 1 ? true : false);
    }
}
