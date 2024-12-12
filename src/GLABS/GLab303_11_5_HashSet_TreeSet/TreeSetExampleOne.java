package GLABS.GLab303_11_5_HashSet_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExampleOne {
    public static void main(String[] args) {

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(20);
        tree.add(5);
        tree.add(15);
        tree.add(25);
        tree.add(10);

        //Calling the Iterator method to iterate over our tree set

        Iterator<Integer> iterator = tree.iterator();
        System.out.println("Tree Set using the Iterator method: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(",");
        }
        //prints out set in ascending order

    }
}
