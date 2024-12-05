package GLab303_10_2_Polymorphism;

public class Triangle extends Shape{

    public Triangle(){}

    public Triangle(String color, double area, double base, double width, double height) {
        super(color, area, base, width, height);
    }

    public Triangle(String color) {
        super(color);
    }

    @Override
    public double getArea(){       //Polymorphic method from parent / must be overriden
        return (0.5*height*base);
    }

    @Override
    public void setBase(double base) {
        super.base = base;
    }
    @Override
    public void setWidth(double width) {
        super.width = width;
    }

    //Overriding method of base class with different implementation
    @Override
    public void displayShapeName() {
        System.out.println("I am a TriAngle"  );
    }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }
}



