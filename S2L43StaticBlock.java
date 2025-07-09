class Mobile{
    String brand;
    int price;
    static String name;

    //static block is called is only once irrespective of number of objects
    static{
        name = "Phone";
        System.out.println("Inside the static block.");
    }
    
    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("Inside the constructor.");
    }
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class S2L43StaticBlock {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1399;

        Mobile.name = "iPhone";

        Mobile obj2 = new Mobile();

    }
}
