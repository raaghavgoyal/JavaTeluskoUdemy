package BeforeS2L44;
// by using static variable we are making it a class member not an object
// so we can access them using class name instead 
// it also saves memory
class Mobilee{
    String brand;
    int price;
    static String name;
    public void print() {
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class S2L41Static {
    public static void main(String[] args) {
        Mobilee m1 = new Mobilee();
        m1.brand = "Apple";
        m1.price = 1399;
        Mobilee.name = "Smart Phone";
        Mobilee m2 = new Mobilee();
        m2.brand = "Samsung";
        m2.price = 899;
        Mobilee.name = "Smart Phone";

        Mobilee.name = "iPhone";

        m1.print();
        m2.print();
        

    }
    
}
