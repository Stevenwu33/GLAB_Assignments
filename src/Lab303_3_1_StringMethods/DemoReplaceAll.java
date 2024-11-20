package Lab303_3_1_StringMethods;

public class DemoReplaceAll {
    public static void main(String[] args) {

        String str1 = "Java123is456fun";

        String reqex = "\\d+";

        System.out.println(str1.replaceAll(reqex, ""));
    }
}
