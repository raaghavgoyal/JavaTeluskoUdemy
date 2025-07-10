package S2L59Polymorphism;

class A{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}
class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //parent reference can hold the value of child object
        // this is called dynamic method dispatch
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
    }
}
