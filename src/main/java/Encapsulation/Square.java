package Encapsulation;

/**
 * Encapsulation.Square class with width and height attributes
 * inherited from Encapsulation.Rectangle.
 */
public class Square extends Rectangle {
    /**
     * Creates a default 1x1 square.
     */
    public Square() {
        // Pass default value to the one-parameter constructor.
        this(1);
    }

    /**
     * Creates a square with the given dimension.
     * The width and height attributes in Encapsulation.Rectangle are private, so they must be accessed using the public
     * setWidth and setHeight methods from the Encapsulation.Rectangle class
     * These methods in the superclass are called from a subclass using the keyword super.
     *
     * @param side the length of the sides of this square.
     */
    public Square(int side) {
        // Pass values to the superclass constructor.
        super(side, side);
    }

    /**
     * Sets the width of this square; also sets height to same value.
     *
     * @param side the length of the sides of this square.
     */

    @Override
    public void setWidth(int side) {
        this.setSide(side);
    }

    /**
     * Sets the height of this square; also sets width to same value.
     *
     * @param side the length of the sides of this square.
     */

    @Override
    public void setHeight(int side) {
        this.setSide(side);
    }

    /**
     * Sets the length of the sides of this square.
     * These methods allow a Encapsulation.Square to be used like a square, where the length of one side is all that needs to be specified.
     * method is where the squareness of a square is enforced; both the width and height attributes inherited from the Encapsulation.Rectangle class are set to the same value, resulting in a square.
     *
     * @param side the length of the sides of this square.
     */
    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    /**
     * Returns the length of the sides of this square.
     * These methods allow a Encapsulation.Square to be used like a square, where the length of one side is all that needs to be specified.
     *
     * @return the length of the sides of this square.
     */
    public int getSide() {
        return this.getWidth();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2);
        System.out.println(square);
        square.setSide(3);
        System.out.println(square);
        square.setWidth(4);
        System.out.println(square);
        square.setHeight(5);
        System.out.println(square);
        System.out.println();

    }
}