package GLABS.GLab303_11_5_HashSet_TreeSet;

import java.util.HashSet;

public class ExampleThree {

    public static void main(String[] args) {

        HashSet<Integer> primeNumbers  = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("Hashset2: " + oddNumbers);

        //Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference : " + primeNumbers);


    }
}
