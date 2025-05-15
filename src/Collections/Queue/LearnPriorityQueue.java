package Collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.peek());

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        //Initialising with a Comparator parameterized constructor

        Queue<Integer> reversePQ = new PriorityQueue<>(Comparator.reverseOrder());

        reversePQ.offer(40);
        reversePQ.offer(12);
        reversePQ.offer(24);
        reversePQ.offer(36);

        System.out.println(reversePQ);


    }
}
