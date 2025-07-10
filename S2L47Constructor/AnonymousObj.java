package S2L47Constructor;
class A {
    A(){
        System.out.println("Object created.");
    }
    void show(){
        System.out.println("this is the show method");
    }
    
}
public class AnonymousObj {
    public static void main(String[] args) {
        //this is anonymous object since it is created in the Heap memory
        //but, its refrence is not stored, so we will not be able to access it again.
        new A().show();
        new A();
    }
    
}
