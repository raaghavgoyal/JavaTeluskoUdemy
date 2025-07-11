package S3L72AnonymousInnerClass;
//see the class names created after compilation

// to change the behaviour of a method, without creating a separate class explicitly
class A{
    public void show(){
        System.out.println("in A Show");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){    //this the anonymous inner class (i.e. class without a name)
            public void show(){
                System.out.println("In new Show");
            }
        };
        obj.show();
    }
}