package Collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.List;

public class LinkedList_Learn {

    public static void main(String[] args) {

        Deque<Integer> queue = new LinkedList<Integer>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        queue.offerFirst(16);
        queue.offerLast(25);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.remove()); //Returns & removes the head of the queue. Throws exception if queue is empty.
        System.out.println(queue.poll()); //Returns & removes the head of the queue. Returns null if queue is empty.

        System.out.println(queue.element()); //Returns the head of the queue. Throws exception if queue is empty.
        System.out.println(queue.peek()); //Returns the head of the queue. Returns null if queue is empty.

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(4);
        System.out.println(list);
    }

}
