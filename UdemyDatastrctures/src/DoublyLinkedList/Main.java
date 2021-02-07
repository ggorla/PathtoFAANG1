package DoublyLinkedList;

import LinkedList.Employee;

public class Main {
    public static void main(String[] args) {
       DoublyLinkedList.Employee janeJones = new DoublyLinkedList.Employee(123, "Jane","Jones");
        DoublyLinkedList.Employee johnDoe = new DoublyLinkedList.Employee(234, "John", "Doe");
        DoublyLinkedList.Employee marySmit = new DoublyLinkedList.Employee(345, "Mary", "Smit");
        DoublyLinkedList.Employee mikeWilson = new DoublyLinkedList.Employee(456,"Mike", "Wilson");


        EmployeeDoblyLinkedList list = new EmployeeDoblyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmit);
        list.addToFront(mikeWilson);

        //list.removeFromFront();

        list.printNode();
        //list.removeFromFront();
        System.out.println("after removal");
        list.printNode();
        System.out.println("after end removal");
        //list.removeFromEnd();
        list.printNode();
    }
}
