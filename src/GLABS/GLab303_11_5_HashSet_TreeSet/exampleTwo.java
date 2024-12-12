package GLABS.GLab303_11_5_HashSet_TreeSet;

import java.util.HashSet;

public class exampleTwo {

    public static void main(String[] args) {

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);

        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HasSet2: " + numbers);

        //union of two sets using the addAll Method
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);




    }







}
