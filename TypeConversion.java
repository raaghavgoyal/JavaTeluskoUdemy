//type conversion and casting
/*
byte b = 127;
int a = 257;
b = a;// this will not work
a = b;//this will work i.e. implicit => conversion
b = (byte)a;// concept of modulus, 257 % 256 = 1;
*/
/*
byte b = 127;
int a = 12;
b = a;// this will not work
a = b;//this will work
b = (byte)a;//this will work i.e. explicit conversion == casting
*/
/*
float f = 3.4f;
int x = (int)f;//loose .4 i.e. lossy conversion

 */
class TypeConversion{
    public static void main(String [] args){
        //byte b = 125;
        int a = 257;
        byte k = (byte)a;
        System.out.println(k);
    }
}
//comment