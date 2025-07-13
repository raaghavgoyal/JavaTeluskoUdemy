package S3L86ExceptionHandlingTry;

public class TryCatchExample {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        try{
            //asks compiler to try to execute this block
            // if it fails, execute catch block
            //so the flow of the program doesn't stop
            j = 18/i;
        }catch(Exception e){
            //this will be executed only in case of exception
            System.out.println("Something went wrong..");
        }
        System.err.println(j);
        System.out.println("Bye!");
        
    }
}
