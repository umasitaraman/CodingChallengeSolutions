package Polymorphism;

/**
 * Container class to serve as a super class for different containers.
 */
public class Container {
    private String contents;

    /**
     * Creates a Container with the given contents.
     *
     * @param contents the contents of this container.
     */
    public Container(String contents) {
        this.contents = contents;
    }

    /**
     * Calculates and returns the volume of this container;
     * defaults to zero.
     *
     * @return the volume of this container.
     */
    public double volume() {
        return 0.0;
    }

    /**
     * Builds and returns a string representation of this container.
     *
     * @return a string representation of this container.
     */
    @Override
    public String toString() {
        return String.format("%.2f units of %s",
                this.volume(), this.contents);
    }

}