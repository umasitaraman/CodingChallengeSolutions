package Polymorphism;

/**
 * Box shaped Container subclass.
 */
public class Box extends Container {
    private double width;
    private double height;
    private double depth;

    /**
     * Creates a Box with the given contents and dimensions.
     *
     * @param contents the contents of this box.
     * @param width the width of this box.
     * @param height the height of this box.
     * @param depth the depth of this box.
     */
    public Box(String contents, double width, double height, double depth) {
        super(contents);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    /**
     * Calculates and returns the volume of this box.
     *
     * @return the volume of this box.
     */
    @Override
    public double volume() {
        return this.width * this.height * this.depth;
    }

}
