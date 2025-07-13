package S3L86ExceptionHandlingTry;

class A{
    public void show() throws ClassNotFoundException{
        try{
            Class.forName("abc");
        }
        catch(ClassNotFoundException e){
            System.out.println("Not able to find the class"+e);
        }
    }
}
public class ThrowsKeyword {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
        }
        System.out.println("Bye!");
    }
}
