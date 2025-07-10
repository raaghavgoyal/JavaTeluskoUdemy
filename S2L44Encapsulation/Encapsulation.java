package S2L44Encapsulation;
//this keyword is used to represent the current object
class Human{
    private int age;
    private String name;
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

    //Methods
    

}
class Encapsulation{
    public static void main(String[] args) {
        Human obj = new Human();
        //obj.name = "Raghav";
        //obj.age = 25;
        //System.out.println(obj.name);
        obj.setAge(11);
        obj.setName("Goyal");

        System.out.println(obj.getName()+" : "+obj.getAge());
            
    }
}