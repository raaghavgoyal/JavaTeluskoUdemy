package S3L105Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//we should not apply parallel stream in case of sorting, as the values are not independent in that case.
public class ParallelStreamExample {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        
        Random ran = new Random();
        for(int i = 1; i<=size; i++){
            nums.add(ran.nextInt(100));
        } 
        
        // int sum1 = nums.stream()
        //                 .map(i->i*2)
        //                 .reduce(0, (c,e)->c+e);
        
        //sum() is aplicable on intStream, so we need to apply mapToInt()

        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                        .map(i->{//to analyze the time taken, we wanted to add some extra time
                            try{
                                Thread.sleep(1);
                            }catch(Exception e){}
                            return i*2;
                        })
                        .mapToInt(i->i)
                        .sum();

        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                        //.map(i->i*2)
                        .map(i->{//to analyze the time taken, we wanted to add some extra time
                            try{
                                Thread.sleep(1);
                            }catch(Exception e){}
                            return i*2;
                        })
                        .mapToInt(i->i)
                        .sum();
        long endPara = System.currentTimeMillis();
        System.out.println(sum2+" : "+sum3);
        System.out.println("Seq  : "+ (endSeq- startSeq));
        System.out.println("Para : "+ (endPara-startPara));
    }
}
