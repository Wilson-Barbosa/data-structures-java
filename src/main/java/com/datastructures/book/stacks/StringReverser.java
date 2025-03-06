package com.datastructures.book.stacks;

import java.util.Scanner;

/**
 * For our first example of using a stack, we’ll examine a very simple task:
 * reversing a
 * word. When you run the program, it asks you to type in a word. When you press
 * Enter, it displays the word with the letters in reverse order.
 */

public class StringReverser {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String originalString = scanner.nextLine();
        int size = originalString.length();
        StringBuilder output = new StringBuilder();

        StackString stack = new StackString(size);

        // stack each char
        for(int i = 0; i < size; i++) {
            stack.push(originalString.charAt(i));
        }

        // unstack each char
        while(!stack.isEmpty()) {
            output.append(stack.pop());
        }

        System.out.println("String reversed is " + output.toString());
    }

}

/**
 * Stack implementation of an array of characters.
 */
class StackString {

    private char[] stack;
    private int maxSize;
    private int top;

    public StackString(int size) {
        this.maxSize = size;
        this.stack = new char[size];
        this.top = -1;
    }

    public void push(char c) {
        if(!isFull()) {
            top++;
            stack[top] = c;
        } else {
            System.out.println("Stack is already full");
        }
    }

    public char pop() {
        char c = stack[top];
        top--;

        return c;
    }


    public boolean isEmpty() {
        return (top == - 1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}