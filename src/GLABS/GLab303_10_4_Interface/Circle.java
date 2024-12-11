package GLABS.GLab303_10_4_Interface;

public class Circle extends Shape implements Movable{

    protected double radius;
    private int x, y;   // x and y coordinates of the point
    private final double PI = Math.PI;

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }

    @Override
    public String getCoordinates() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public double getArea() {
        double area = PI * Math.pow(this.radius, 2);
        return area;
    }

    public void displayShapeName(){
        System.out.println("Drawing a circle of radius: " + radius);
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() +  "] ";
    }


    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void moveLeft() {
        x--;
    }





}


