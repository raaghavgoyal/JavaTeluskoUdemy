package S3L82LambdasAndFI;

//Lambda Expression works only with the functional interface
@FunctionalInterface
interface I{
    int add(int i, int j);
}
public class LambdaExp2 {
    public static void main(String[] args) {
        I obj = (i,j) -> i+j;

        int result = obj.add(4,5);
        System.out.println(result);
    }
}
