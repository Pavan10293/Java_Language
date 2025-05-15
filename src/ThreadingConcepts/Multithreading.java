//Resource link - https://www.youtube.com/watch?v=r_MbozD32eo

package ThreadingConcepts;

public class Multithreading {

    public static void main(String[] args) {

        MultiThreadThing myThing = new MultiThreadThing();
        MultiThreadThing myThing2 = new MultiThreadThing();
//        myThing.run(); //This line will run the run() method, but not in a separate Thread.

//        myThing.start(); //To kick of a new thread, we should use the start() method.
//        myThing2.start();

        for(int i=0; i<5; i++) {
            MultiThreadThing myThing3 = new MultiThreadThing(i);
//            Thread myThread = new Thread(myThing3);Use this when Multi threaded class is created by implementing the Runnable interface
//            myThread.start();Use this when Multi threaded class is created by implementing the Runnable interface
            myThing3.start();
            try {
                myThing3.join();//Join method waits for the thread to die.
            } catch (InterruptedException e) {
            }
        }
    }

}
