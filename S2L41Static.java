// by using static variable we are making it a class member not an object
// so we can access them using class name instead 
// it also saves memory
class Mobile{
    String brand;
    int price;
    static String name;
    public void print() {
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class S2L41Static {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1399;
        Mobile.name = "Smart Phone";
        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 899;
        Mobile.name = "Smart Phone";

        Mobile.name = "iPhone";

        m1.print();
        m2.print();
        

    }
    
}
