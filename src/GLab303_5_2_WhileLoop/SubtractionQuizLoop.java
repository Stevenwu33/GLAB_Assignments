package GLab303_5_2_WhileLoop;

import java.util.Scanner;

public class SubtractionQuizLoop {

    public static void main(String[] args) {

        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);


        while(count < NUMBER_OF_QUESTIONS){

            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            if(num1 < num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.print(
                    "What is " + num1 + " - " + num2 + "? ");
            int answer = input.nextInt();

            if(num1 - num2 == answer){
                System.out.println("You are correct!");
                correctCount++;
            } else
                System.out.println("Your answer is wrong.\n" + num1
                        + " - " + num2 + " should be " + (num1 - num2));
            // Increase the count
            count++;
            output += "\n" + num1 + "-" + num2 + "=" + answer +
                    ((num1 - num2 == answer) ? " correct" : " wrong");


        }
    }
}
