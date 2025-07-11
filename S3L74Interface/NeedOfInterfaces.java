package S3L74Interface;

class Computer{
    public void code(){

    }
}
class Laptop extends Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("code, compile, run: Faster");
    }
}
public class NeedOfInterfaces {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer raghav = new Developer();
        raghav.devApp(desk);
    }
}
