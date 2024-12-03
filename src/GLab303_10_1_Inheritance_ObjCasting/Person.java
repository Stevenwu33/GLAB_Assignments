package GLab303_10_1_Inheritance_ObjCasting;

public class Person {

    String name;
    static int lifespan = 60;
    static double ageFactor = 1.0;

    public Person(){
        name = "";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return ("Hello, my name is " + name);
    }

    public String talk(){
        return ("I have nothing to say");
    }

    public String walk(){
        return  ("I have no where to go");
    }

    public static double lifeSpan(){
        return (lifespan * ageFactor);
    }
}
