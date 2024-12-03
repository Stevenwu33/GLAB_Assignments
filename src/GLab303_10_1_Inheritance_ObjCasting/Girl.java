package GLab303_10_1_Inheritance_ObjCasting;

public class Girl extends Person {

    static double ageFactor = 1.3;

    public Girl(String girlName){
        name = "Ms. " + girlName;
    }

    public String talk(){
        return ("Hello! " + jump());

    }

    public String jump(){
        return ("I am jumping!");
    }

    public static double lifespan (){
        return (lifespan * ageFactor);
    }


}
