package GLABS.GLab303_11_5_HashSet_TreeSet;

import java.util.TreeSet;

public class TreeSetExampleTwo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        //using the Remove method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed from the set? " + value1);

        //using the removeAll method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed from the set? " + value2);



    }
}
