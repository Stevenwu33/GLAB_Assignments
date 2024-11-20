package GLab303_3_2;

import java.util.Scanner;

public class ReadingStringFromConsole2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String result = input.nextLine();
        char ch = result.charAt(0);
        System.out.println("The character entered is " + ch);


    }
}
