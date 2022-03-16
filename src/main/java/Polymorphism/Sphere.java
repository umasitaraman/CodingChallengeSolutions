package Polymorphism;

/**
 * Sphere shaped Container subclass.
 */
public class Sphere extends Container {
    private double radius;

    /**
     * Creates a Sphere with the given contents and dimensions.
     *
     * @param contents the contents of this sphere.
     * @param radius the radius of this sphere.
     */
    public Sphere(String contents, double radius) {
        super(contents);
        this.radius = radius;
    }

    /**
     * Calculates and returns the volume of this sphere.
     *
     * @return the volume of this sphere.
     */
    @Override
    public double volume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(this.radius, 3);
    }

}