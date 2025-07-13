package S3L86ExceptionHandlingTry;

class RaghavException extends RuntimeException{
    public RaghavException(String string){
        super(string);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0)
                throw new RaghavException("I don't want to print zero.");
        }
        catch(RaghavException e) {
            j = 18/1;
            System.out.println("thats the default output. "+e);
        }
        catch(Exception e) {
            System.out.println("Something went wrong..");
        }

        System.out.println(j);
        System.out.println("Bye!");
    }
    
}
