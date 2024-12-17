package GLABS.GLAB303_13_1_ReadingDelimitedFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {

    public static void main(String[] args) {


        try{

            String pathName = "/Users/stevenwu/Downloads/CourseData.csv";
            File file = new File(pathName);
            Scanner input = new Scanner(file);
            ArrayList<String[]> data = new ArrayList<>();

            while (input.hasNextLine()){
                String line = input.nextLine();
                String[] splitLine = line.split(",");
                data.add(splitLine);
            }

            for (String[] element:data){
                System.out.println("Course Code: " + element[0]);
                System.out.println("Course Name: " + element[1]);
                System.out.println("Instructor Name: " + element[2]);
                System.out.println("==============================");
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
