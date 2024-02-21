package org.example;//I just asked the AI to implement the volume and surface area to the original code and it printed it out //

// RectangularPrism class
class RectangularPrism extends Shape3D {
    private double length;
    private double width;
    private double height;

    // Constructor
    public RectangularPrism(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Getter and setter methods
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate the volume of the rectangular prism
    public double volume() {
        return length * width * height;
    }

    // Calculate the surface area of the rectangular prism
    public double surfaceArea() {
        return 2 * ((length * width) + (width * height) + (height * length));
    }

    // String representation
    @Override
    public String toString() {
        return "RectangularPrism {length=" + length + ", width=" + width + ", height=" + height + ", surface area="
                + surfaceArea() + ", volume=" + volume() + "}";
    }
}