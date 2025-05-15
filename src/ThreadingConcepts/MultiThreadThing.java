package ThreadingConcepts;

/* There are 2 ways of creating a multi threadable java class.One is by extending thread class.
 The other is by implementing the Runnable interface.*/
public class MultiThreadThing extends Thread{

    private int threadNumber;
    public MultiThreadThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public MultiThreadThing() {
    }

    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println(i +" from thread "+ threadNumber);
            if(threadNumber == 3) {
                throw new RuntimeException(); //If one of the thread blows up due to some king of exception,
                                              // it doesn't affect the running of any other threads. In this case, only thread 3 will stop
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
