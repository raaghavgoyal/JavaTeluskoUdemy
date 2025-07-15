package S3L94Threads;

//synchronized keyword will ensure that the method will be called by one thread at a time
class Counter{
    int count;  //by default value is zero, because it is an instance variable
    public synchronized void increment(){
        count++;
    }
}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = ()->{
            for(int i = 1; i<=10000; i++){
                c.increment();
            }
        };
        Runnable obj2 = ()->{
            for(int i = 1; i<=10000; i++){
                c.increment();
            }
        };

        //we need to create Thread object since start() is not available in the Runnable
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //main will wait for these 2 threads to join back
        t1.join();
        t2.join();

        System.out.println(c.count);
        
    }
}

