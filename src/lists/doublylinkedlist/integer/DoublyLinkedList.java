package lists.doublylinkedlist.integer;

/**
 * Implementation of a Doubly Linked List that stores int numbers. The insertion
 * and deletion don't consider the empty possibility, leaving this for the
 * client to check before proceeding.
 */
public class DoublyLinkedList {

    private Link first;
    private Link last;

    public DoublyLinkedList() {

    }

    /** Adds a new element at the beginning of the list */
    public void insertAtStart(int element) {

        Link link = new Link(element);

        // first insertion
        if (isEmpty()) {
            first = link;
            last = link;

            link.setNext(null);
            link.setPrevious(null);
        } else {

            first.setPrevious(link); // make the previous' first point to new element

            // get new element to point to current first
            link.setNext(first);
            link.setPrevious(null);

            first = link; // make the new element the first now
        }

        System.out.println("Item added.");

    }

    /**
     * Inserts a new element after the first occurrence of the provided key.
     * If no key is found then nothing happens and the new number is not added
     * into the list.
     * 
     * @param number is the number you want to insert
     * @param key    is the number from which you want to insert after
     */
    public void insertAfter(int number, int key) {

        Link current = first;
        boolean wasFound = false;

        while (current != null) {

            // if a match is found
            if (current.getNumber() == key) {

                wasFound = true;

                Link newLink = new Link(number); // creates a new link

                // setting up newLink's pointers
                newLink.setPrevious(current);
                newLink.setNext(current.getNext());

                // finally I adjust the next element's previous to the newLink's reference
                current.getNext().setPrevious(newLink);

                current.setNext(newLink); // current points to the newLink

                break;
            }

            current = current.getNext();
        }

        if (!wasFound) {
            System.out.println("The key " + key + " does not exist in the list, so " + number + " was not added");
        } else {
            System.out.println("Number " + number + " added.");
        }

    }

    /**
     * Prints each element starting from the beginning to end (like a normal single
     * linked list)
     */
    public void displayForwards() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {

            Link current = first;
            String output = "(start) ";

            while (current != null) {
                output += current.getNumber() + " --> ";
                current = current.getNext();
            }

            output += "null (end)";
            System.out.println(output);

        }

    }

    /**
     * Prints each element starting from the end to beginning
     */
    public void displayBackwords() {

        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {

            Link current = last;
            String output = "(end) null ";

            while (current != null) {
                output += " <-- " + current.getNumber();
                current = current.getPrevious();
            }

            output += "(start)";
            System.out.println(output);

        }

    }

    /**
     * Checks if the list is empty or not
     */
    public boolean isEmpty() {
        return first == null && last == null;
    }

    /**
     * returns the first element in the list
     */
    public int getFirst() {
        return last.getNumber();
    }

    /**
     * returns the last element in the list
     */
    public int getLast() {
        return last.getNumber();
    }
}
