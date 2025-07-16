package S3L101Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Method 1: using Comparable, override the compareTo()
class EStudent implements Comparable<EStudent>{
    int age;
    String name;
    
    
    public EStudent(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    public int compareTo(EStudent that) {
        if(this.age>that.age)
            return 1;
        else
            return -1;
    }
    
}
public class ComparableWithCustomClass {
    public static void main(String[] args) {

        //Method 2: using Comparator which internally uses lambda
        //using lambda
        Comparator<EStudent> comp = ( i, j)-> i.age>j.age? 1: -1;
        List<EStudent> studs = new ArrayList<>();
        studs.add(new EStudent(21, "Navin"));
        studs.add(new EStudent(12, "John"));
        studs.add(new EStudent(18, "Parul"));
        studs.add(new EStudent(20, "Kiran"));

        //comparable(Method 1)
        Collections.sort(studs);


        //comparator(Method 2)
        //Collections.sort(studs,comp);
        
        for(EStudent s : studs){
            System.out.println(s);
        }
    }
}