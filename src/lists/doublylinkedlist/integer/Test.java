package lists.doublylinkedlist.integer;

public class Test {
    
    public static void main(String[] args) {
        
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtStart(3);
        list.insertAtStart(10);
        list.insertAtStart(-8);
        list.insertAtStart(26);
        list.insertAtStart(1);
        list.insertAtStart(76);

        list.displayForwards();
        // list.displayBackwords();

        list.insertAfter(5, 10);
        list.insertAfter(100, 99);
        list.displayForwards();
    }

}
