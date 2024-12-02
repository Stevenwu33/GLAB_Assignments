package PA303_7_1_Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.taskOne();
        main.taskTwo();
        main.taskThree();
        main.taskFour();
        main.taskFive();
        main.taskSix();
        main.taskSeven();
        main.taskEight();
        main.taskNine();
        main.taskTen();
        main.taskEleven();
    }

    public void taskOne(){

        int[] number = new int[3];

        for(int i = 0; i < number.length; i++){
            number[i] = i + 1;
        }
        System.out.println(Arrays.toString(number));
    }
    public void taskTwo(){
        int[] numbers = {13, 5, 7, 68, 2};
        int middleElement;
        int arrayLength = numbers.length;

        middleElement = arrayLength/2;
        System.out.println(numbers[middleElement]);

    }
    public void taskThree(){
        String[] colors = {"red","green","blue","yellow"};
        System.out.println("Array Length: " + colors.length);
        String[] copyOfColors = colors.clone();
        System.out.println("Copy of Array: " + Arrays.toString(copyOfColors));
    }

    public void taskFour(){
        Random random = new Random();
        int[] numbers = new int[5];
        for(int i = 0; i < 5; i++){
           numbers[i] = random.nextInt(25);
        }
        System.out.println("First index element: " + numbers[0] + "Last index Element: " + numbers[numbers.length - 1 ]);
        System.out.println("Array length index value: " + numbers[5]); //will not work

    }

    public void taskFive(){

        int[] array = new int[5];

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }

    public void taskSix(){

        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = (i * 2);
        }
        System.out.println(Arrays.toString(array));
    }

    public void taskSeven(){

        int[] array = new int[5];
        int middleE = array.length/2;
        for (int i = 0; i <array.length; i++){
            array[i] = i;
            if(i == middleE){
                continue;
            }
            System.out.println(array[i]);

//            if (i == middleE){
//               array[i] = i;
//            }else{
//                array[i] = 0;
//            }
        }

    }
    public void taskEight(){

        String[] students = {"Harry","Ron","Hermoine","Malfoy","NPC"};

        int middleE = students.length/2;

        String temp = students[0];
        students[0] = students[middleE];
        students[middleE] = temp;



        System.out.println(Arrays.toString(students));
    }

    public void taskNine(){

        int[] num = {4, 2, 9, 13, 1, 0};
        Arrays.sort(num);
        System.out.println("Array in ascending order: " + Arrays.toString(num));

        System.out.println("The smallest number is " + num[0]);
        System.out.println("The largest number is " + num[num.length-1]);

    }
    public void taskTen(){

        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add("String1");
        arrayList.add("String2");
        arrayList.add("String3");
        arrayList.add(6.9);
        arrayList.add(69);

        for(Object obj:arrayList){
            System.out.println(obj);
        }

    }

    public void taskEleven(){
        Scanner input = new Scanner(System.in);

        System.out.println("How many favorite colors do you have? ");
        int answer1 = input.nextInt();
        input.nextLine();  // look into more

        String[] userArray = new String[answer1];

        for(int i = 0; i < userArray.length; i++){
            System.out.println("Enter favorite colors number " + (i + 1) + ": ");

            String userAnswers = input.nextLine();

            while (userAnswers.isEmpty()){
                System.out.println("Please enter a color");
                userAnswers =input.nextLine();
            }
            userArray[i]  = userAnswers;
        }

        System.out.println("Your favorite colors are:\n" + Arrays.toString(userArray) );








    }


}


















