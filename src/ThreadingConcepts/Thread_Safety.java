//Resource link - https://www.youtube.com/watch?v=px4W-HXRWKk

package ThreadingConcepts;

import org.w3c.dom.css.Counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread_Safety {

    public static void main(String[] args) {
        CounterClass c = new CounterClass();

        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1; i<=1000; i++) {
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1; i<=1000; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c.count);
    }

}

class CounterClass {
    int count;
//    AtomicInteger count = new AtomicInteger();


    public synchronized void increment() { //using synchronized keyword in method declaration is one way of achieving thread safety in Java.
        count++;                           //Without it, the output will be different in every single run.
    }
}
