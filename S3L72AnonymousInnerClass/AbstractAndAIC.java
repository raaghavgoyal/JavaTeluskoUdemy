package S3L72AnonymousInnerClass;
abstract class B{
    public abstract void show();
    public abstract void print();
}
public class AbstractAndAIC {
    public static void main(String[] args) {
        B obj = new B(){        //so here we are overriding the abstract methods using anonymous inner class
            public void show(){ 
                System.out.println("in show..");
            }
            public void print() {
                System.out.println("in print..");
            }
            
        };
        obj.show();
        obj.print();
    }
}
