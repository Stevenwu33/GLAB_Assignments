package GLABS.GLab303_11_1_Generics;

public class myRunner {

    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        demoClass.genericMethod(5);
        demoClass.genericMethod("John Jones");
        demoClass.genericMethod(69.69);
        demoClass.genericMethod('H');



        //For Generic Class example
        GMultipleDatatype obj = new GMultipleDatatype<Integer,String>(5,"Carrots");
        System.out.println(obj.getValueOne());
        System.out.println(obj.getValueTwo());
        GMultipleDatatype obj2 = new GMultipleDatatype<Integer,String>(5,"Carrots");
        System.out.println(obj.getValueOne());
        System.out.println(obj.getValueTwo());




    }
}
