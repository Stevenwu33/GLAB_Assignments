package PA303_2_3_OperatorsAndNumbers;

public class Question1 {

    public static void main(String[] args) {

        Question1 question1 = new Question1();
        question1.taskOne(9);
        question1.taskOne(17);
        question1.taskOne(88);
    }

    public void taskOne(int y){
        int variable = y;
        String binaryString = Integer.toBinaryString(variable);
        int x = variable << 1;
        System.out.println("Decimal value: " + (double) x +" \nBinary notation:  " + binaryString);
    }
}
