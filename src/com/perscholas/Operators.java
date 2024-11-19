package com.perscholas;

public class Operators {
    public static void main(String[] args) {

        Operators casting = new Operators();
        casting.useTypeCasting();


    }

    public void useTypeCasting(){
        //Implicit Casting
        int intVal = 45;
        double doubleVal = intVal;
        System.out.println("Int to double casting: " + doubleVal);  //Answer : 45.0

        //Explicit Casting
        double price = 29.99;
        int roundedPrice = (int) price; //Manual conversion from double to int
        System.out.println("double to int casting: " + roundedPrice);  // Answer : 29 (rounds down)
    }

    public void assignmentOps(){

        int x = 10;

        x += 5; //(x = x + 10) = 15
        x -= 2; //(x = x - 2) = 13
        x *= 3; //(x = x * 3) = 39
        x /= 2; //(x = x / 2) = 19
        x %= 3; //(x = x % 3) = 1
    }

    public void useBitWise(){ //write this for your notes. info on zoom

        int x = 6;  // 0000 0110
        int y = 3;  // 0000 0011

        // | - or
        // & - and
        // ^ - xor : only if one of the two bits are 1

    }
}
