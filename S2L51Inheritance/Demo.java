package S2L51Inheritance;

public class Demo {
    public static void main(String[] args) {
        VeryAdvCalc c = new VeryAdvCalc();
        int r1 = c.add(1, 5);
        int r2 = c.sub(7, 3);
        int r3 = c.multi(2, 33);
        int r4 = c.div(15, 4);
        double r5 = c.power(4, 2);

        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);

    }
}
