package Stacks;

import LinkedList.EmployeeLinkedListImpl;
import LinkedList.EmployeeNode;

public class Main {
    public static void main(String[] args) {
        //stacks alwasy says LIFO top item in the element

        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee(12, "Gautham","Gorla"));
        stack.push(new Employee(24, "Greshma","chapparada"));
        stack.push(new Employee(25, "Dharun","Gorla"));


        stack.push(new Employee(33, "test","test1"));
        stack.print();
        System.out.println(stack.peek());
        System.out.println("after peeking");
        System.out.println(stack.pop());
        System.out.println("after Poping");
        stack.print();
    }
}
