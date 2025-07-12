package S3L77Enum;

enum Laptop{
    Macbook(2000), XPS(1700), Surface, Yoga(1500);
    private int price;
    //private constructor because we are using it in the same class itself
    private Laptop(){
        price = 500;
    }
    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop "+ this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
public class EnumsClass {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap+" : "+lap.getPrice());
        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " +lap.getPrice());
        }
    }
    
}
