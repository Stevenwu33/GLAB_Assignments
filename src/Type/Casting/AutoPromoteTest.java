package Type.Casting;

public class AutoPromoteTest {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s);

        System.out.println("result = " + result);

    }
}

//"The letter (a) converted to binary via ASCII is 01100011.
// The decimal representation of 0110011 (64 + 32 + 2+ 1) is 97."

//results of two different data types  is promoted to the higher-ranking data type