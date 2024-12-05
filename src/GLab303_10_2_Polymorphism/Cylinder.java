package GLab303_10_2_Polymorphism;

public class Cylinder extends Circle{

    Cylinder(double radius, double height) {
        super(radius, height);
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public double getVolume() {
        return (PI * Math.pow(super.radius, 2)) * super.height;
    }

    public double getSurfaceArea() {
        return 2.0 * Math.PI*super.radius*super.height;
    }
    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Cylinder for radius " + super.radius);
    }
    public String toString()
    {
        return "radius is: " + super.radius +"height is : " + super.height;

    }

}
