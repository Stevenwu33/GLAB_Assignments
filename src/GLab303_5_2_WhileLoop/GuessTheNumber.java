package GLab303_5_2_WhileLoop;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        int num = (int) (Math.random() * 101 );  //picks a double from 0.0 to 1.0 so multiply by 101 to expand range
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1;

        while(guess != num){
            System.out.println("\nEnter your guess: ");

            guess = scanner.nextInt();

            if (guess == num){
                System.out.println("Yes, the number is " + num);
            } else if (guess > num) {
                System.out.println("Your guess is too high");
            }
            else
                System.out.println("Your guess is too low");

        }
    }
}
