package PA303_2_3_OperatorsAndNumbers;

public class Question3 {

    public static void main(String[] args) {

        int x = 7;  //0000 0111
        int y = 17; //0001 0001
        int z;      //0000 0001

        z = x & y;  //0000 0001 = 1

        System.out.println("Binary Value of z: " + Integer.toBinaryString(z)
                +"\nDecimal value of z: " + (double) z);






    }
}
