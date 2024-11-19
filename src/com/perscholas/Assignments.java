package com.perscholas;

import java.text.DecimalFormat;

public class Assignments {

    public void addInt(){

        int num1 = 1, num2 = 2;
        int result = num1 + num2;
        System.out.println(result);
    }

    public void addDub(){

        double num1 = 1.9, num2 = 2.7;
        double result = num1 + num2;
        System.out.println(result);
    }
    public void addIntAndDub(){

        int num1 = 3;
        double num2 = 2.7;
        double result = num1 + num2;
        System.out.println(result);
    }

    public void divideInt(){

        int num1 = 4, num2 = 2;
        int result = num1 / num2;
        System.out.println(result);
    }

    public void twoDoubles(){
        double num1 = 10.5;
        double num2 = 20.0;

        //print result
        double result = num2/num1;
        System.out.println(result);

        // Cast the result to an integer and print it
        int intResult = (int) result;
        System.out.println("Result as integer: " + intResult);
    }

    public void bulletPointSix(){

        int x = 5;
        int y = 6;
        double q = y/x;

        System.out.println(q);

        double castVar = y;
        q = castVar;
        System.out.println(q);

    }

    //declares a named constant
    public void bulletSeven(){

        final int SEVEN = 7;
        int num2 = 2;
        int result = SEVEN + num2;
        System.out.println(result);
    }

    public void bulletEight(){

        double coffee = 2.50;
        double latte = 3.50;
        double icedCoffee = 4.50;
        double  subtotal;
        double totalSale;

        double firstOrder = coffee * 3;
        double secondOrder = latte * 4;
        double thirdOrder = icedCoffee * 5;

        subtotal = firstOrder + secondOrder + thirdOrder;

        final double SALES_TAX = .15;
        double tax = subtotal*SALES_TAX;

        totalSale = subtotal + tax;

        DecimalFormat df = new DecimalFormat(".00");

        System.out.println(df.format(totalSale));










    }


}


