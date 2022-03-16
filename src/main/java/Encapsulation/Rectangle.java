package Encapsulation;

import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulation Example
 * Encapsulation.Rectangle class with width and height attributes.
 */

public class Rectangle {
    private int width;
    private int height;

    /**
     * Creates a default 1x2 rectangle.
     */
    public Rectangle() {
        // Pass default values to the two-parameter constructor.
        this(1, 2);
    }

    /**
     * Creates a rectangle with the given dimensions.
     *
     * @param width the width of this rectangle.
     * @param height the height of this rectangle.
     */
    public Rectangle(int width, int height) {
        // Use the set methods to ensure any error checking is done.
        this.setWidth(width);
        this.setHeight(height);
    }

    /**
     * Sets the width of this rectangle, ensuring it is positive.
     *
     * @param width the width of this rectangle.
     * @throws IllegalArgumentException if parameter value is not positive.
     */
    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException(
                    "Encapsulation.Rectangle width must be positive.");
        }
        this.width = width;
    }

    /**
     * Sets the height of this rectangle, ensuring it is positive.
     *
     * @param height the height of this rectangle.
     * @throws IllegalArgumentException if parameter value is not positive.
     */
    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException(
                    "Encapsulation.Rectangle height must be positive.");
        }
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    /**
     * Returns the area of this rectangle -- calculated as the width times
     * the height.
     *
     * @return the area of this rectangle.
     */
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }

    /**
     * Builds and returns a string representation of this rectangle.
     *
     * @return a string representation of this rectangle.
     */
    public String toString() {
        // Show the class name along with the attributes.
        return String.format("%s is %dx%d with area %.2f.",
                this.getClass().getSimpleName(),
                this.getWidth(), this.getHeight(),
                this.getArea());
    }

    private static Rectangle getNewShape() {
        if (Math.random() < 0.5) {
            return new Rectangle();
        } else {

            return new Square();
        }

    }

    public static void main(String[] args) {
//        Encapsulation.Rectangle rect = new Encapsulation.Rectangle();
//        System.out.println(rect);
//        rect = new Encapsulation.Rectangle(4, 3);
//        System.out.println(rect);
//        rect.setWidth(5);
//        rect.setHeight(2);
//        System.out.println(rect);
//        rect = new Encapsulation.Square(2);
//        System.out.println(rect);
        List<Rectangle> shapes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            shapes.add(getNewShape());
        }

        for (Rectangle rect : shapes) {
            System.out.println(rect);
        }
    }
}