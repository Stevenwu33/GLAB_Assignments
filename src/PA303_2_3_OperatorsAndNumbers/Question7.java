package PA303_2_3_OperatorsAndNumbers;

public class Question7 {

    public static void main(String[] args) {

        int x = 5;
        int y = 8;

        int sum = (++x) + y;

        System.out.println("Sum of (++x + y): "  +  sum);


        int m = 5;
        int n = 8;

        int sum2 = (m++) + y;
        System.out.println("Sum of (m++ + n): " + sum2);

        System.out.println("Value of m after postfix incrementation: " + m );

        System.out.println("Value of sum after postfix incrementation of m: " + (m + n));

    }
}
