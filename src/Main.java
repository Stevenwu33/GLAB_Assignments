import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object (semicolon here)

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read string input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Read integer input

        System.out.println("Hello " + name + ", you are " + age + " years old.");
        scanner.close();  // Close the scanner
    }
}