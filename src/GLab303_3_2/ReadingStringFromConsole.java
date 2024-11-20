package GLab303_3_2;

import java.util.Scanner;

public class ReadingStringFromConsole {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine(); //reads the whole line
        String str3 = scanner.next();  //reads and prints only one word or text from the line

        System.out.println("s1 is " + str1);
        System.out.println("s2 is " + str2);
        System.out.println("s3 is " + str3);

    }
}
