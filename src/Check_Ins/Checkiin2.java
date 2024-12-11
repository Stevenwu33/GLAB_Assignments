package Check_Ins;

public class Checkiin2 {

    public static void main(String[] args) {
        String str = "Hello Java";

        System.out.println(str.length());
        System.out.println(str.isEmpty());


        String s1 = "Hello";
        String s2 = "hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String apple = "Apple";
        String banana = "Banana";

        System.out.println(apple.compareTo(banana));

        String s4 = "Programming";

        System.out.println(s4.substring(0,3) +" "+ s4.substring(8,11));

        String cha = "Character";
        System.out.println(cha.indexOf('a'));
        System.out.println(cha.lastIndexOf('a'));

        String ja = "Learn Java";
        String em = " ";
        System.out.println(ja.contains("Java"));
        System.out.println(ja.startsWith("Le"));
        System.out.println(em.isEmpty());

        String s8 = "Developers";
        System.out.println(s8.contains("Dev") + "\nDoes the String Contain \"De\"?" + s8.startsWith("De"));

    }
}
