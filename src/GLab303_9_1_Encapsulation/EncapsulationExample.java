package GLab303_9_1_Encapsulation;

public class EncapsulationExample {

    public static void main(String[] args) {

        HumanBeing h1 = new HumanBeing();
        h1.setWeight(68);
        h1.setHeight(1.65f);
        h1.setBmi(calculateBMI(h1));

        System.out.println("Person has "+h1.getWeight()+" kgs and is "+h1.getHeight()+" meters in height, which results in BMI of "+h1.getBmi());

    }

    public static float calculateBMI(HumanBeing h1){
        return h1.getWeight()/(h1.getHeight()* h1.getHeight());
    }
}
