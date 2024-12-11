package GLABS.GLab303_10_4_Interface;

/**
 * interfaces uses abstract methods to be defined in subclasses
 */

public interface Movable {


    // "public" and "abstract" by default
    void moveUp();
    void moveDown();
    void moveRight();
    void moveLeft();
    String getCoordinates();

}
