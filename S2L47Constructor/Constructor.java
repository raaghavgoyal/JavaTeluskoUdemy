package S2L47Constructor;
class Human{
    private int age;
    private String name;
    
    //default constructor
    public Human(){
        this.age = 12;
        this.name = "John";
    }
    //parameterizer constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
public class Constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName()+" \t: "+obj.getAge());

        Human obj1 = new Human(18,"Raghav");
        System.out.println(obj1.getName()+" \t: "+obj1.getAge());
    }
}
