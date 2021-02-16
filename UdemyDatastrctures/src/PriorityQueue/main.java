package PriorityQueue;

import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3232);
        pq.add(429);

        Object[] arr = pq.toArray();
        for(int i =0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
