package lists.linkedlist.exercises.ex1;

import java.util.Scanner;

public class Ex1App {

    public static Scanner scanner = new Scanner(System.in);
    public static PersonLinkedList list = new PersonLinkedList();

    public static void main(String[] args) {

        list.add(new PersonLink("wilson"));
        list.add(new PersonLink("rafael"));
        list.add(new PersonLink("glauco"));
        list.add(new PersonLink("levi"));
        
        while (true) {
            System.out.println("-- Select an option --");
            System.out.println(" 1. Add new Person");
            System.out.println(" 2. Remove Person by name");
            System.out.println(" 3. Search Person by name");
            System.out.println(" 4. List all people");
            System.out.println("Your option: ");
        
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline
            
            operationSelector(option);
        }
    }

    public static void operationSelector(int option){
        switch (option) {
            case 1: addPerson(); break;
            case 2: removeByName(); break;
            case 3: searchByName(); break;
            case 4: listAll();
        }
    }

    public static void addPerson(){
        System.out.println("Enter a name:");
        String name = scanner.nextLine();
        list.add(new PersonLink(name));
    }

    public static void removeByName(){
        System.out.println("Enter a name to be deleted: ");
        scanner.nextLine();
    }

    public static void listAll(){
        list.printAllOnSingleLine();
    }

    public static void searchByName(){
        System.out.println("Enter the name to be searched: ");
        list.searchByName(scanner.nextLine());
    }
}
