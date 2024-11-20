package Lab303_3_1;

public class concatDemo {
    public static void main(String[] args) {

        String str1 = "Learn ";
        String str2 = "Java";

        System.out.println(str1.concat(str2));
        System.out.println(str2.concat(str1));

        String str3 = "hello";
        String str4 = "Learners";

        String str5 = str3 + str4;
        System.out.println(str5);

        String message = "Welcome " + "to" + "Java";

        String s = "Chapter" + 2;

        String s1 = "Supplement" + 'b';
    }
}
