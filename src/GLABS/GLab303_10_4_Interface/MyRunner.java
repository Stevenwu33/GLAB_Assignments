package GLABS.GLab303_10_4_Interface;

public class MyRunner {

    public static void main(String[] args) {
        Circle c1 = new Circle(1,2,2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinates());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinates());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinates());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinates());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinates());

        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10,100);
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinates());

        c2.moveLeft();
        System.out.println("After move left , Coordinates are " + c2.getCoordinates());

    }
}
