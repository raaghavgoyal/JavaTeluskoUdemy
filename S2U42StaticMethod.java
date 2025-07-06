//we can not use non static variables inside a static method, as we will not be able to  know the 
// value which we want as we wont be having an object in this case.

class Mobile{
    String brand;
    int price;
    static String name;
    public void print() {
        System.out.println(brand+" : "+price+" : "+name);
    }
    public static void print1(Mobile m){
        System.out.println("in static method");
        System.out.println(m.brand+" : "+m.price+" : "+name);
        //here we are access the instance variables using argument, since we can not use
        //non static variables inside a static method

    }
}
public class S2U42StaticMethod {
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

        Mobile.print1(m1);
        
    }
}
