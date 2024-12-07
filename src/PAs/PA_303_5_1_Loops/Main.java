package PAs.PA_303_5_1_Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.taskOne();
        main.taskThree();
        main.taskTwo();
    }

    public void taskOne(){
        for(int i = 1; i <= 12; i++){
            for(int j = 1; j<=12; j++){
                System.out.print("  " + i * j );
            }
            System.out.println();
        }
    }


    public void taskTwo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter two integers to find the Greatest Common Divisor");
        System.out.print("First Integer: ");
        int n1 = input.nextInt();
        System.out.print("Second Integer: ");
        int n2 = input.nextInt();

        int k = 1;
        int gcd = 1;

        while(k <= n1 && k <= n2) {
            if(n1 % k == 0 && n2 % k == 0){
               gcd = k;
            }
            k++;
        }
        System.out.println("Greatest Common Divisor is: " + gcd);
        input.close();

    }

    public void taskThree(){
        double tuition = 10000;
        double targetTuition = 20000;
        double increaseRate = 1.07;
        int year = 0;

        while(tuition < targetTuition){
            tuition = increaseRate * tuition;
            System.out.println("year: " + year + " tuition: " + tuition);
            year++;
        }

        System.out.println("the tuition will be doubled in  " + year + " years");

    }


    public void examScam(int number){

    }

}

