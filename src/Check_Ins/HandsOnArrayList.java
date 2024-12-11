package Check_Ins;

import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayList {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("John Wick ");
        students.add("John Cena ");
        students.add("Papa Johns ");
        students.add("Jon Jones ");
        students.add("John Sims ");


        System.out.println("List of Students");
        System.out.println(students);

       String name= students.remove(4);

        System.out.println("\nUpdated List - Student: " + name + "removed." );
        System.out.println(students);

        students.sort(null);
        System.out.println("\nUpdated List sorted in Alphabetical order: " );
        Collections.sort(students);
        System.out.println(students);
//        for (String element: students){
//            System.out.print(element);
//        }








    }






}
