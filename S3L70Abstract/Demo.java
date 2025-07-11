package S3L70Abstract;
//if a class has an abstract method, it should itself be abstract as well
abstract class Car{                 // abstract class
    //abstract class may or may not have abstract methods
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("play music");
    }
}
// the subclass of an abstract class should override the abstract method
abstract class WagonR extends Car{      //abstract class
    public void drive(){
        System.out.println("Driving..");
    }
    public void wagonRSpecial(){
        System.out.println("WagonR Special feature..");
    }
}
class UpdatedWagonR extends WagonR{     //concrete class
    public void fly() {
        System.out.println("Flying..");
    }
}
public class Demo {
    public static void main(String[] args) {
        //we can not instantiate an object of an abstract class
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        // we need to typecast to subclass if we want to access its exclusive methods(downcasting)
        ((WagonR)obj).wagonRSpecial();
        obj.fly();
    }
}


