package S2L63UpcastingDowncasting;

class A{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}


public class UpcastingDowncasting {
    public static void main(String[] args) {
        double d = 3.4;
        System.out.println(d);
        int i = (int) d;
        System.out.println(i);
        
        //upcasting
        A obj = new B();
        obj.show1();

        //does not work since reference is of A, and it has no idea what is show2()
        //obj.show2();

        //downcasting
        B obj1 = (B) obj;
        obj1.show2();
    }
    
}
