class Literals{
    public static void main(String [] args){
        int num1 = 585; //literal
        num1 = 0b101;   //binary decimal
        int num2 = 0x7E;//hexadecimal
        int num3 = 1_00_00_000;// to count the number of zeros easily
                                //or we can say for better readability of the code
        double num4 = 94; //automatic type casting to double from int
            System.out.println(num4);
        num4 = 12e10;
        //boolean  b = 1;// gives error
        char c = 65;
        c = (char) (1+c);
        c++;
        c += 1;// Quite interesting to note 
                //that, the shortcut method does not require to explicitly type cast
        int octal = 0146; //octal-VIP if we put 0 in front of the integer, it will be considered octal
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(c);
        System.out.println(octal);
    }
}