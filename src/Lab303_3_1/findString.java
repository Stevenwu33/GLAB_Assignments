package Lab303_3_1;

public class findString {
    public static void main(String[] args) {

        String str = "Java is fun";
        int result;

        result = str.indexOf('s');
        System.out.println(result);

        result = str.lastIndexOf('J');
        System.out.println(result);

        result = str.lastIndexOf('a');      //looks for the last occurrence of a duplicate letter
        System.out.println(result);

        result = str.lastIndexOf('j');      //method is case-sensitive, Java's J is capitalized.
        System.out.println(result);             //will print -1 if error

        result = str.lastIndexOf("ava");
        System.out.println(result);

        result = str.lastIndexOf("java");
        System.out.println(result);
    }
}
