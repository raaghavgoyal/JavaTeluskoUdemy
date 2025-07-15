package S3L94Threads;

//to work with threads, we should use implements Runnable interface 
//as, we can only extends 1 class, so if would extend Thread class, we will not be able to do inheritance
class C implements Runnable{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class D implements Runnable{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}public class ThreadAndRunnable {
    public static void main(String[] args) {
        Runnable obj1 = new C();
        Runnable obj2 = new D();

        //we need to create Thread object since start() is not available in the Runnable
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
