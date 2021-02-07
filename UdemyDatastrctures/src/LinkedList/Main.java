package LinkedList;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee(123, "Jane","Jones");
        Employee johnDoe = new Employee(234, "John", "Doe");
        Employee marySmit = new Employee(345, "Mary", "Smit");
        Employee mikeWilson = new Employee(456,"Mike", "Wilson");

        EmployeeLinkedListImpl list = new EmployeeLinkedListImpl();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmit);
        list.addToFront(mikeWilson);

        list.printList();
        EmployeeNode employee = list.removeFromFront();
        System.out.println("Removed node"+ employee);
        System.out.println(list.getSize());
        list.printList();
    }
}
