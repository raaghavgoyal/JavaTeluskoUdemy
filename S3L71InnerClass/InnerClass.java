package S3L71InnerClass;
// see the .class files that are created, A, A$B, A$C
//since A is the outer class, we can not mark it as static
class A{
    int age;

    public void show(){
        System.out.println("in show");
    }
    class B{
        public void config(){
            System.out.println("in config");
        }
    }
    // we can only make an inner class as a static class
    static class C{
        public void print(){
            System.out.println("in print");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();     //thats how we create an inner class
        // note we need the object of outer to create object
        //  it is written even before the new keyword

        obj1.config();

        //static class can be accessed without creating the object
        //so we need not A's object to create C's object
        A.C obj2 = new A.C();
        obj2.print();

    }
}
