package S3L82LambdasAndFI;

@FunctionalInterface
interface FA{
    void show(int i);
    //void run();
}
// class FB implements FA{
//     public void show(){
//         System.out.println("in Show");
//     }
// }

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        FA obj = new FA(){
            public void show(int i){
                System.out.println("in show.."+i);
            }
        };
        obj.show(5);
    }
}
