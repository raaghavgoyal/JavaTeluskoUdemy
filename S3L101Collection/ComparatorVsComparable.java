package S3L101Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorVsComparable {
    public static void main(String[] args) {

        //logic for comparison
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                    return 1;//swap
                else
                    return  -1;//so swap
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        //sort according to unit digit
        //Collections
        //use comparator
        Collections.sort(nums,  comp);

        System.out.println(nums);

    }
}
