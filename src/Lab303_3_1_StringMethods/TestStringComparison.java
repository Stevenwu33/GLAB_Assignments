package Lab303_3_1_StringMethods;

public class TestStringComparison {
    public static void main(String[] args) {

        String s1 = "PerScholas";
        String s2 = "PerScholas";
        String s3 = new String("PerScholas");
        String s4 = "Teksystem";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));


    }
}
