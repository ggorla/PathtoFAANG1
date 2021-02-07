package LinkedStack;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack {
    public LinkedList<Employee> stack;
    public LinkedStack(){
        stack = new LinkedList<Employee>();
    }
    public void push(Employee employee){
        stack.push(employee);
    }
    public Employee pop(){
        return stack.pop();
    }
    public Employee push(){
        return stack.peek();
    }
    public boolean isEMpty(){
        return stack.isEmpty();
    }
    public void print(){
        Iterator<Employee> itr = stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
