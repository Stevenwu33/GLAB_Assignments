package GLab303_10_3_Abstraction;

public class Triangle extends Shape{


    public Triangle(){}


    public Triangle(String color) {
        super.setColor(color);
    }
    public void setBase(int base) {
        this.base = base;
    }



    @Override
    public double getArea() {
        return 0.5*super.base * super.height;
    }

    @Override
    public void displayShapeName() {
        System.out.println("I am a TriAngle");
    }

    public String toString() {
        return "Triangle[base=" + super.base + ",height=" + super.height + "," + super.toString() + "]";
    }
}




