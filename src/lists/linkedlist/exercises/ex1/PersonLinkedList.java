package lists.linked_list.exercises.ex1;

/**
 * Implementation of an LinkedList for PersonLink objects. It doesn't check if
 * there are
 * duplicates and the user should no add duplicates as well.
 */
public class PersonLinkedList {

    private PersonLink firstLink;

    public PersonLinkedList() {
        this.firstLink = null;
    }

    /**
     * Adds a new Person to the list
     */
    public void add(PersonLink newPerson) {
        newPerson.setNext(firstLink); // newPerson --> oldPerson --> null
        firstLink = newPerson; //
    }

    public boolean isEmpty() {
        return firstLink == null;
    }
    public void removePerson(String searchedName) {
        if (isEmpty()) {
            System.out.println("The list is empty! No item can be removed");
            return;
        }
    
        PersonLink current = firstLink;
        PersonLink previous = null;
        boolean found = false;
    
        while (current != null) {
            if (current.getName().equals(searchedName)) {
                System.out.println("Element found and deleted");
                found = true;
    
                // If removing the first element
                if (previous == null) {
                    firstLink = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                break; // Exit loop after deletion
            }
    
            previous = current;
            current = current.getNext();
        }
    
        // If the name was not found in the list
        if (!found) {
            System.out.println("The name you provided does not exist inside the list");
        }
    }
    

    public void searchByName(String searchedName){
        if(isEmpty()) {
            System.out.println("The list is empty.");
        } else {

            PersonLink current = firstLink;

            while(current != null) {

                if(current.getName().equals(searchedName)) {
                    System.out.println("Item was found on the list");
                    break;
                }

                current = current.getNext(); 
            }

            if(current == null) {
                System.out.println("item not found");
            }

        }
    }

    public void printAllOnSingleLine() {

        if (isEmpty()) {
            System.out.println("The list is empty!");
        } else {

            PersonLink current = firstLink;
            String output = "Start: ";

            while (true) {

                output += current.getName() + " --> "; // print the person

                // stops if the there are no more elements
                if (current.getNext() == null) {
                    break;
                }

                current = current.getNext(); // goes for the next link in the chain
            }

            output += " null";

            System.out.println(output);
        }

    }

}
