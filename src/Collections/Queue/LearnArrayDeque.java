package Collections.Queue;

import java.sql.Array;
import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(45);
        adq.offer(26);

         System.out.println(adq);

        System.out.println("Peek : "+adq.peek());
        System.out.println("Peek first : "+adq.peekFirst());
        System.out.println("Peek last : "+adq.peekLast());

        System.out.println("Poll : "+adq.poll());
        System.out.println(adq);

        System.out.println("Poll First : "+adq.pollFirst());
        System.out.println(adq);

        System.out.println("Poll Last : "+adq.pollLast());
        System.out.println(adq);

    }
}
