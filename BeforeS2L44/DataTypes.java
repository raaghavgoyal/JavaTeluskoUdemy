package BeforeS2L44;
class DataTypes{
    public static void main  (String [] args){
        System.out.println("Data Types Example : ");
        //Integer, Float, Character, Boolean
        //Integer: byte(1), short(2), int(4), long(8)
        //Float: float(4), double(8)
        //char: 2 bytes => Java follows unicode by default
        //Boolean in Java is represented with the help of true and false only (not 1/0)
        char c = 'k';
        byte by = 127;
        short sh = 558;
        long l = 5854l;
        boolean b = true;
        float marks = 7.1f;
        double marksInDouble = 7.1;
        System.out.println(marks);
        System.out.println(marksInDouble);
        System.out.println(c);
        System.out.println(b);
        System.out.println(by);
        System.out.println(l);

    }
}
