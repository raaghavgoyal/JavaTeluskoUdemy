package S3L94Threads;

public class RunnableWithLambda {
    public static void main(String[] args) {
        Runnable obj1 = ()->{
            for(int i = 1; i<=5; i++){
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = ()->{
            for(int i = 1; i<=5; i++){
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        //we need to create Thread object since start() is not available in the Runnable
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        
    }
}
