package lists.linkedlist;

public class LinkedListTest {
    
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.displayList(); // should print empty

        Link link1 = new Link(1, "wilson");
        Link link2 = new Link(2, "rafael");
        Link link3 = new Link(3, "glauco");
        Link link4 = new Link(4, "bianchi");

        list.insertFirst(link1);
        list.insertFirst(link2);
        list.insertFirst(link3);
        list.insertFirst(link4);

        list.displayList(); // should print the list

    }

}
