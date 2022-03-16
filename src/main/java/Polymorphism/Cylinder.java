package Polymorphism;

/**
 * Cylinder shaped Container subclass.
 */
public class Cylinder extends Container {
    private double radius;
    private double height;

    /**
     * Creates a Cylinder with the given contents and dimensions.
     *
     * @param contents the contents of this cylinder.
     * @param radius the radius of this cylinder.
     * @param height the height of this cylinder.
     */
    public Cylinder(String contents, double radius, double height) {
        super(contents);
        this.radius = radius;
        this.height = height;
    }

    /**
     * Calculates and returns the volume of this cylinder.
     *
     * @return the volume of this cylinder.
     */
    @Override
    public double volume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }

}