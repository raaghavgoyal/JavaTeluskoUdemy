package S3L105Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e)->c+e);

        int result = nums.stream()
                            .filter(n->n%2 == 0)
                            .map(n->n*2)
                            .reduce(0,(c,e)->c+e);
        System.out.println("Sum of doubled evens: "+result);

        Stream<Integer> sortedValues = nums.stream().filter(n->n%2==0).sorted();
        System.out.println("Evens :");
        sortedValues.forEach(n->System.out.println(n));

        //parallel stream is used for multiple threads
        int r = nums.parallelStream().filter(n->n%2==0).reduce(0,(c,e)->c+e);
        System.out.println("Sum of evens: "+r);

        //s3.forEach(n->System.out.println(n));
    }
}
