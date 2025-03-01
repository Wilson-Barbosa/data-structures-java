package myimplementations;

/**
 * Generic implementation of a Doubly LinkedList. Allows for duplicate
 * items.
 */
public class DoublyLinkedList<T> {

    private Node<T> first;
    private Node<T> last;

    /**
     * Creates an emtpy list
     */
    public DoublyLinkedList() {

    }

    /**
     * Adds a new element at the start position in the list.
     * 
     * @param element
     */
    public void addAtStart(T element) {

        Node<T> newNode = new Node<>(element);

        if (isEmpty()) { // first insertion
            first = newNode;
            last = newNode;
        } else {

            newNode.setNext(first);
            first.setPrevious(newNode);

            first = newNode;
        }

    }

    /**
     * Removes the first occurrence of the element passed in the argument.
     * The element of type T should override equals(), since this method
     * uses it to compare then for equality.
     * 
     * @param element the element to be removed
     */
    public void remove(T element) {

        Node<T> current = first;

        while (current != null) {

            if (current.equals(element)) {

                // adjust the pointer for the next element
                current.getNext().setPrevious(current.getPrevious());

                // adjust the pointer for the previous element
                current.getPrevious().setNext(current.getNext());

                break;
            }

            current = current.getNext();
        }

    }

    /**
     * Removes all occurrences
     */
    public void removeAll(T element) {

        Node<T> current = first;

        while (current != null) {

            if (current.equals(element)) {
                // adjust the pointer for the next element
                current.getNext().setPrevious(current.getPrevious());

                // adjust the pointer for the previous element
                current.getPrevious().setNext(current.getNext());
            }

            current = current.getNext();
        }

    }

    /** Removes the last item in the list */
    public T removeLast(){
        Node<T> lastItem = last;
        last.getPrevious().setNext(null);;

        return lastItem.getElement();
    }

    public T getFirst() {
        return first.getElement();
    }

    public T getLast() {
        return last.getElement();
    }

    /**
     * Returns the the amount of elements inside this list.
     * 
     * @return the list's size
     */
    public int size() {
        int count = 0;
        Node<T> current = first;

        while (current != null) {
            count++;
            current.getNext();
        }

        return count;
    }

    /**
     * Returns true if the list is empty or false if not
     */
    public boolean isEmpty() {
        return first == null && last == null;
    }
}

/**
 * An element that goes inside a Doubly LinkedList
 */
class Node<T> {

    private T element;
    private Node<T> previous;
    private Node<T> next;

    public Node(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

}
