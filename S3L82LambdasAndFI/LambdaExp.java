package S3L82LambdasAndFI;

@FunctionalInterface
interface A{
    void show(int i);
}
public class LambdaExp {
    public static void main(String[] args) {
        //Lambda Expression ->
        //-> instead of new A(){public void show}
        A obj = i -> System.out.println("in show "+i);
        obj.show(5);
    }
}
