package lists.linkedlist.exercises.ex1;

public class PersonLink {

    private String name;
    private PersonLink next; // defines the next link in the chain

    public PersonLink(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public PersonLink getNext() {
        return next;
    }

    public void setNext(PersonLink next) {
        this.next = next;
    }

    public void printPerson(){
        System.out.println("[" + name + "]");
    }

    public String getFormatedPerson(){
        return ("[" + name + "]");
    }

}
