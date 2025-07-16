package S3L101Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterface {
    public static void main(String[] args) {
        //Collection <Integer> nums = new ArrayList();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        //nums.add("5");

        //We can not get index when we have Collection reference variable
        // but index is available when the reference is of List
        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(5));
        System.out.println(nums);
        
        for(int n: nums){
            System.out.println(n);
        }
    }
}
