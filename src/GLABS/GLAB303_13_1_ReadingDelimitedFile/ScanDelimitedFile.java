package GLABS.GLAB303_13_1_ReadingDelimitedFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimitedFile {

    public static void main(String[] args) throws FileNotFoundException {

        try{
            String location = "/Users/stevenwu/Downloads/cars.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<String[]> data = new ArrayList<String[]>();
            while(input.hasNextLine()){
                String line = input.nextLine(); // this will read the whole row in the csv file. then loops to the next row
                String[] splitLine = line.split(","); //if detects a "," it splits the string into  separate parts wherever there is a coma,
                data.add(splitLine);
            }
            for (String[] line:data) {  //iterating thru each String array from the ArrayList
                System.out.println("Car Name :" + line[0]);  //element from the String array we created
                System.out.println("MPG :" + line[1]);
                System.out.println("Cylinder :" + line[2]);
                System.out.println("Displacement :" + line[3]);
                System.out.println("Horsepower :" + line[4]);
                System.out.println("Weight :" + line[5]);
                System.out.println("Acceleration :" + line[6]);
                System.out.println("Model :" + line[7]);
                System.out.println("Origin :" + line[8]);
                System.out.println("===============================");
            }
        }catch (FileNotFoundException e){
            System.out.println("File noy found! ");
            e.printStackTrace();
        }

    }
}
