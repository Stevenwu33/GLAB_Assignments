package Type.Casting;

public class ExplicitTesting {

    public static void main(String[] args) {

        double d = 100.04;
        long l = (long) d;
        int i = (int) l;

        System.out.println("Double value "+d);
        System.out.println("Long value "+l);
        System.out.println("Int value "+i);


        byte b;
        int z = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        b = (byte) z;
        System.out.println("z = " + z + " b = " + b);
        System.out.println("Conversion of double to int.");

        z = (int) dou;
        System.out.println("dou = " + dou + " b = " + z);
        System.out.println("Conversion of double to byte.");

        b = (byte) dou;
        System.out.println("dou = " + dou + " b = " + b);


    }
}

//In this example program, when the value 257 is cast into a byte variable.
// The output is 1, which is the remainder of the division of 257 by 256 (the range of a byte).
// When “dou” is converted into an int, its fractional part is lost.
//When “dou” is converted into a byte, its fractional part is also lost,
// and the value is reduced to module 256, which is 67 in this case.
