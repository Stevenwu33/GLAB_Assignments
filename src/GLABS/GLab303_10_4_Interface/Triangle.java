package GLABS.GLab303_10_4_Interface;

public class Triangle extends Shape implements Movable{
    private int x, y;

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public String getCoordinates() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public double getArea() {
        return 0;
    }




}
