package S3L101Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Set values are unique, and are not sorted or ordered according to the input sequence
//set also does not have index values
public class SetCollection {
    public static void main(String[] args) {
        //we can also use Collection reference since Set does not have index
        //Collection<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new HashSet<Integer>();

        //A TreeSet gives stores values in a sorted format
        //Set<Integer> nums = new TreeSet<Integer>();

        nums.add(81);
        nums.add(21);
        nums.add(555);
        nums.add(61);
        nums.add(61);

        //Collection extends Iterable 
        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }

        // for (int n : nums) {
        //     System.out.println(n);
        // }
    }
}
