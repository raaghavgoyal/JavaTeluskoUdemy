package S3L94Threads;

class A extends Thread{
    //we must have a run method in a class which extends Tread class, 
    //so that it can execute when we say obj.start();
    public void run(){
        for(int i = 1; i<=100; i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 1; i<=100; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        Thread.sleep(2);
        obj2.start();
    }
}
