package S3L74Interface;

//class     - class     -> extends
//class     - interface -> implements
//interface - interface -> extends

//we can not instantiate interface similar to abstract class
interface A{
    //every variable in an interface are final and static
    //so the must be initialized along with declaration
    //final and static
    int age = 44;
    String area = "Mumbai";
    //by default all the methods in an interface are 'public abstract'
    //public abstract 
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{
    
}
class B implements A,Y{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj;  //can create a reference 
        //obj = new A();    //but can not instantiate
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        //A.area = "Hyderabad"; //will not work since variables are final in interface
        System.out.println(A.age+" "+A.area);   // since the variables are static
    }
}
