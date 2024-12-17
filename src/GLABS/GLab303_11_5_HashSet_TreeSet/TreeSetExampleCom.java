package GLABS.GLab303_11_5_HashSet_TreeSet;

import java.util.TreeSet;

public class TreeSetExampleCom {

    public static void main(String[] args) {

        //Creating a TreeSet with user-defined comparators
        TreeSet<String> cities = new TreeSet<>(new Comporator_Cities());

        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //prints the contents of the treeSet
        System.out.println("TreeSet: " + cities);



    }
}
