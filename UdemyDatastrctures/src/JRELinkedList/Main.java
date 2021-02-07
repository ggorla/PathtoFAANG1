package JRELinkedList;

import DoublyLinkedList.EmployeeDoblyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
       Employee janeJones = new Employee(123, "Jane","Jones");
     Employee johnDoe = new Employee(234, "John", "Doe");
        Employee marySmit = new Employee(345, "Mary", "Smit");
     Employee mikeWilson = new Employee(456,"Mike", "Wilson");


     LinkedList list = new LinkedList();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmit);
        list.addFirst(mikeWilson);

        //list.removeFromFront();

     Iterator iter = list.iterator();
     while (iter!=null){

     }

    }
}
