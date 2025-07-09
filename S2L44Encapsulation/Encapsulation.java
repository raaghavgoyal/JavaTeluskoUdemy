package S2L44Encapsulation;
class Human{
    private int age;
    private String name;

    //Methods
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        this.age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

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