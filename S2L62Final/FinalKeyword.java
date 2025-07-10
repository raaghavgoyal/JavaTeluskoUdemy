package S2L62Final;
//final keyword can be used with a 
//variable, method, class
//variable- to keep it constant
//class-    to stop inheritance
//method-   to stop overriding

//if Clac is declared final we will not be able to extend it to ACalc 
class Calc{
    public final void show(){
        System.out.println("By Raghav");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
//final class can not be extended
class ACalc extends Calc{
    //since parent method is final, we can not override it
    // public void show(){
    //     System.out.println("By John");
    // }
}

public class FinalKeyword {
    public static void main(String[] args) {
        //final variable
        final int num = 8;
        //num = 9;//can not assign value to a final variable
        System.out.println(num);

        //final method
        ACalc obj = new ACalc();
        obj.show();
        obj.add(1, 2);       
    }
    
}
