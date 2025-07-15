package S3L92Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//We can also use finally with try, if we don't want to handle the exceptions, or in some more cases
//we can use finally with or without catch block
//this makes sense whenever we want to close the resources
public class TryWithResources {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;
        //old method
        // BufferedReader br = null;
        // try{
        //     br = new BufferedReader(new InputStreamReader(System.in));
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
            
        // }
        // finally{//irrespective of getting the exception or not, finally will be executed
        //     br.close();
        // }

        //new method
        //automatically closes the resources after try block is executed
        //because it implements AutoClosable interface internally
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }

        //although it is good to use finally with resources to keep a better check on the closing
    }
}
