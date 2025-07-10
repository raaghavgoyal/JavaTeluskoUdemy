package BeforeS2L44;
//we can not use non static variables inside a static method, as we will not be able to  know the 
// value which we want as we wont be having an object in this case.

class Mobile1{
    String brand;
    int price;
    static String name;
    public void print() {
        System.out.println(brand+" : "+price+" : "+name);
    }
    public static void print1(Mobile1 m){
        System.out.println("in static method");
        System.out.println(m.brand+" : "+m.price+" : "+name);
        //here we are access the instance variables using argument, since we can not use
        //non static variables inside a static method

    }
}
public class S2U42StaticMethod {
    public static void main(String[] args) {
        Mobile1 m1 = new Mobile1();
        m1.brand = "Apple";
        m1.price = 1399;
        Mobile1.name = "Smart Phone";
        Mobile1 m2 = new Mobile1();
        m2.brand = "Samsung";
        m2.price = 899;
        Mobile1.name = "Smart Phone";

        Mobile1.name = "iPhone";

        m1.print();
        m2.print();

        Mobile1.print1(m1);
        
    }
}
