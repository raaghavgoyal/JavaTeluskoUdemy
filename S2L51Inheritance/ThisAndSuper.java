package S2L51Inheritance;
class Aa{
    public Aa(){
        super();
        System.out.println("in A");
    }
    public Aa(int n){
        super();
        System.out.println("in A int");
    }
}
class Bb extends Aa{
    public Bb(){
        super();
        System.out.println("in B");
    }
    public Bb(int n){
        this();
        System.out.println("in B int");
    }

}
public class ThisAndSuper {
    public static void main(String[] args) {
        Bb b = new Bb(5);
    }
    
}
