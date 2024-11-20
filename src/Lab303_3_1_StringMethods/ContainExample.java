package Lab303_3_1_StringMethods;

public class ContainExample {
    public static void main(String[] args) {

        String str1 = "Learn Java";
        boolean result;

        result = str1.contains("Java");
        System.out.println(result);

        result = str1.contains("Python");
        System.out.println(result);

        result = str1.contains("");
        System.out.println(result);
    }
}
