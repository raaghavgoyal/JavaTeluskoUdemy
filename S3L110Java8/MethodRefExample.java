package S3L110Java8;

import java.util.Arrays;
import java.util.List;

public class MethodRefExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin","Harsh","John");
        
        //old
        // List<String> uNames = names.stream()
        //                             .map(name -> name.toUpperCase())
        //                             .toList();

        //but why to even mention name twice in map, so
        //new
        List<String> uNames = names.stream()
                                    .map(String::toUpperCase)//this is called method reference
                                    .toList();
        //uNames.forEach(n-> System.out.println(n));
        //we can also apply this here
        uNames.forEach(System.out::println);//method reference
    }
}
