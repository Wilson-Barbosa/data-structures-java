package com.datastructures.book.stacks;

/**
 * Array of char implementation of a stack. Methods for adding or removing
 * elements do not consider if the stack is full or empty, clients are instead
 * responsible for checking it.
 */
public class StackCharArray {
    
    private char[] stack;
    private int maxSize;
    private int top;

    public StackCharArray(int maxSize){
        this.stack = new char[maxSize];
        this.maxSize = maxSize;
        this.top = -1;
    }

    public char peek(){
        return stack[top];
    }

    public void push(char c){
        top++;
        stack[top] = c;
    }


    public char pop(){
        char c = stack[top];
        top--;
        return c;
    }


    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }
}
