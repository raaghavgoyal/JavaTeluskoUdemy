package S3L86ExceptionHandlingTry;

public class MultipleCatch {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        String str = null;
        int[] nums = new int[5]; 
        try{
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in array's limits.");
        }
        catch(Exception e) {// always keep the general exception at the end, 
                            //otherwise other catch blocks will become unreachable 
            System.out.println("Something went wrong.."+e);
        }
        System.out.println(j);
        System.out.println("Bye!");
    }
}
