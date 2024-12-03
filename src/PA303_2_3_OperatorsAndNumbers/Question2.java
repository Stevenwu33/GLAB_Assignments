package PA303_2_3_OperatorsAndNumbers;

public class Question2 {

    public static void main(String[] args) {

        int[] values = {150, 225, 1555, 32456};

        Question2 question2 = new Question2();

        for(int index: values){
            question2.task(index);
            System.out.println(" \n ");

        }
    }

    public void task(int y){

        int x = y;
        System.out.println("Input Value: "  + x);
        String binaryStringOfX = Integer.toBinaryString(x);
        System.out.print("Binary Notation: " + binaryStringOfX + " | ");
        x = x >> 2;
        System.out.print("Decimal value when shifted to the right by 2: " + x);



    }
}
