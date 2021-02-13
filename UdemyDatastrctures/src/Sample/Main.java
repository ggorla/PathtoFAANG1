package Sample;


public class Main {
    public static void main(String[] args) {
//        Employee Gautham = new Employee(123,"Gautham","Gorla");
//        Employee Greeshma = new Employee(234,"Greeshma","Chapparada");
//        Employee Dharun = new Employee(345,"Dharun","Gorla");
//
//        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
//        list.addToFront(Gautham);
//        list.addToFront(Greeshma);
//        list.addToFront(Dharun);
//
//        list.printNode();
//        /*list.addToEnd(Greeshma);
//        System.out.println("after adding end");
//        list.printNode();
//        list.removeAtFirst();
//        System.out.println("after removing");
//        list.printNode();
//*/
//        list.removeAtLast();
//
//        System.out.println("Removing from last");
//        list.printNode();

        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(2);
        intTree.insert(21);
        intTree.insert(5);
        intTree.insert(24);
        intTree.insert(26);
        intTree.insert(50);
        intTree.insert(32);
        intTree.traveseInorder();
    }
}
