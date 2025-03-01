package myimplementations;

/**
 * An Iterator is a class that allows users to access the items in the list.
 * Methods like insertBefore or insertAfter would be better implemented inside
 * the list itself, but, for the sake of time, let's just add them here.
 */
public class Iterator<T> {

    private Node<T> current;
    private Node<T> previous;
    private LinkedList<T> list;

    /**
     * Creates a new Iterator instance for the class passed as an argument
     * and points to the first element of the list.
     */
    public Iterator(LinkedList<T> list) {
        this.list = list;
        current = list.getFirstNode();
    }

    /**
     * Returns the reference that the iterator currently holds
     */
    public Node<T> getCurrent() {
        return current;
    }

    /** Makes the current Iterator point to the first element inside the list */
    public void reset() {
        current = list.getFirstNode();
    }

    /**
     * Moves the Iterator to point to the next Node in the list. This is the
     * method used to effectively traverse the list.
     */
    public Node<T> nextNode() {
        previous = current;
        current = current.getNext();
        return current;
    }

    /**
     * Returns true if the Iterator points to the last item inside
     * the list of false if not.
     */
    public boolean atEnd() {
        return current.getNext() == null;
    }

    /**
     * Deletes the item the iterator currently points at
     */
    public void deleteCurrent() {
        previous.setNext(current.getNext());
    }

    /** Inserts a new element just after the one the Iterator points to. */
    public void insertAfter(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    /** Inserts a new element just before the one the Iterator points to. */
    public void insertBefore(T element) {

        if (list.isEmpty()) {
            list.addAtStart(element);
        } else {
            Node<T> newNode = new Node<>(element);
            previous.setNext(newNode);
            newNode.setNext(current);
        }
    }
}