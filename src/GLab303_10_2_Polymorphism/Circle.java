package GLab303_10_2_Polymorphism;

public class Circle extends Shape{

    protected double radius;
    public final double PI = Math.PI;

    Circle(double radius){
        this.radius = radius;
    }


    Circle(double radius, double height){
        this.radius = radius;
        super.height = height;
    }

    public double getArea(){
        super.area = PI * Math.pow(this.radius, 2);
        return super.area;
    }

    @Override
    public void displayShapeName(){
        System.out.println("Drawing a Circle of radius " + this.radius);
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "]";
    }

}
