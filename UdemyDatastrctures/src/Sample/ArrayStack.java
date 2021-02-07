package Sample;

import Stacks.Employee;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capasity){
         stack = new Employee[capasity];
    }
    public void  push(Employee employee){
        if(top ==stack.length){
            Employee[] newArray = new Employee[2*stack.length];
            System.arraycopy(stack, 0, newArray,0,stack.length);
        }
        stack[top++] = employee;
    }
    public  Employee peek (){
        return stack[top-1];
    }

   public Employee pop(){
        return stack[top--];
   }
   public void print(){
        for(int i = top-1; i>0;i++){
            System.out.println(stack[i]);
        }
   }
}
