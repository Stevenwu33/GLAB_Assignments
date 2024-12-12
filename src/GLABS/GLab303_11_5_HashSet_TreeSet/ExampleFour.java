package GLABS.GLab303_11_5_HashSet_TreeSet;

import java.util.HashSet;

public class ExampleFour {
    public static void main(String[] args) {

        HashSet<String> hset = new HashSet<>();

        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");

        //Addition of Duplicate elements
        hset.add("Apple");
        hset.add("Mango");

        //Addition of Null Values
        hset.add(null);
        hset.add(null);
        //Using advance for loop

        for(String element:hset){
            System.out.println(" ---> " + element);
        }
        //HashSets does not output a uniform order. may come print out in any order.

    }
}
