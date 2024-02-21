package org.example;

//I just asked the AI to implement the volume and surface area to the original code and it printed it out //
class Cube extends Shape3D {
    private double width;

    // Constructor
    public Cube(double width) {
        this.width = width;
    }

    // Getter and setter methods
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Calculate the volume of the cube
    public double volume() {
        return Math.pow(width, 3);
    }

    // Calculate the surface area of the cube
    public double surfaceArea() {
        return 6 * Math.pow(width, 2);
    }

    // String representation
    @Override
    public String toString() {
        return "Cube {width=" + width + ", surface area=" + surfaceArea() + ", volume=" + volume() + "}";
    }
}