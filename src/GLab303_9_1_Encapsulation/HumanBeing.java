package GLab303_9_1_Encapsulation;

public class HumanBeing {

    private float height;
    private float weight;
    private float bmi;

    HumanBeing(){}

    HumanBeing(float height, float weight, float bmi){
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }


}
