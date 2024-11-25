package GLab303_6_1_Arrays;

public class ArrayDemoThree {

    public static void main(String[] args) {
        //left off on three

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        for(int number: numbers){
            sum += number;
        }

        int arrayLength = numbers.length;

        average = ((double)sum/(double) arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}
