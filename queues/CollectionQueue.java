package queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(25);
        q.offer(15);
        q.offer(75);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
    
}
