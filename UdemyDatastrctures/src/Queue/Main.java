package Queue;

import Stacks.ArrayStack;

public class Main {
    public static void main(String[] args) {
        //stacks alwasy says LIFO top item in the element

      Employee janeJones = new Employee(12, "jane","Jone");
        Employee sam = new Employee(22, "sam","pik");
        Employee mike = new Employee(32, "mike","denise");
        Employee alex = new Employee(42, "alex","morgan");

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(sam);
        queue.add(mike);
        queue.add(alex);

        queue.printQueue();
        queue.peek();
        queue.remove();
        System.out.println("after removing");
        queue.printQueue();
    }
}
