package S2L64Wrapper;

public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        //boxing
        Integer num1 = new Integer(num);
        //auto-boxing
        Integer num2 = num; 
        
        //unboxing
        int num3 = num1.intValue();
        //auto-unboxing
        int num4 = num1;
        System.out.println(num3);

        System.out.println(num1);

        String str = "12";
        int num5 = Integer.parseInt(str);
        System.out.println(num5*2);
    }
    
}
