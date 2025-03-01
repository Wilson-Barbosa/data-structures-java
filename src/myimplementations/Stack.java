package myimplementations;

/**
 * Implementation of a stack data structure using a LinkedList.
 */
public class Stack<T> {

    private LinkedList<T> list;
    private T top; // tracks the top item in the stack

    /**
     * Creates an empty stack.
     */
    public Stack() {
        this.list = new LinkedList<T>();
    }

    /**
     * Adds a new item at the top of the stack.
     * 
     * @param item is the item that should be
     */
    public void push(T item) {
        list.addAtStart(item);
        top = item;
    }

    /**
     * Removes the item at the top of the stack and returns it.
     * If the stack is emtpy returns null.
     * 
     * @return the item at the top of the stack
     */
    public T pop() {

        if (!isEmpty()) {
            T e = list.removeFirst();
            top = list.getFirst();
            return e;
        }

        return null;
    }

    /**
     * Returns the item at the top of the stack or null if its emtpy
     * 
     * @return the item at the top of the stack
     */
    public T peek() {

        if (!isEmpty()) {
            return list.getFirst();
        }

        return null;
    }

    /**
     * Returns true if the stack is empty or false if not.
     */
    public boolean isEmpty() {
        return top == null;
    }

}
