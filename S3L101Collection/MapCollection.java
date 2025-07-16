package S3L101Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
//Map does not have sequence like set, and the keys are unique
//Map does not extend or implement Collection interface, but it is a part of collection API concept
public class MapCollection {
    public static void main(String[] args) {
        Map <String, Integer> students = new HashMap<>();
        
        //Hashtable is the synchronized version of HashMap, so we can use it with multiple threads
        //Note: we can also use HashMap() with synchronized externally
        //Map<String, Integer> students = new Hashtable<>();

        //put is present in maps insted of add because we update the element if key is already there
        students.put("Navin", 56);
        students.put("Harsh", 23);
        students.put("Sushil", 67);
        students.put("Kiran", 92);
        students.put("Harsh", 45);//keys are unique, so older value will be updated
        System.out.println(students);
        System.out.println(students.get("Harsh"));

        System.out.println(students.keySet());
        System.out.println(students.values());
        for(String key: students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }
    }
}
