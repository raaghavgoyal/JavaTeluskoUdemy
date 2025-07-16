package S3L105Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//introduced in java 1.8
public class ForEachExample {
    public static void main(String[] args) {
        //to directly create a list from array
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        Consumer<Integer> con = n->System.out.println(n); 
        //since forEach takes Consumer object, we can create it,
        //and since it is an interface, we can use lambda exp here
        nums.forEach(con);
        // or we can say
        //nums.forEach(n->System.out.println(n));
    }
}
