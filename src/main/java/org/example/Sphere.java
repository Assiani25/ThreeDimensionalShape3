package org.example;

//I just asked the AI to implement the volume and surface area to the original code and it printed it out //
class Sphere extends Shape3D {
    private double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Getter and setter methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate the volume of the sphere
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Calculate the surface area of the sphere
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // String representation
    @Override
    public String toString() {
        return "Sphere {radius=" + radius + ", surface area=" + surfaceArea() + ", volume=" + volume() + "}";
    }
}