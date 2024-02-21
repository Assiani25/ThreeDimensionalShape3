package org.example;

//I just asked the AI to implement the volume and surface area to the original code and it printed it out //
class Cylinder extends Shape3D {
    private double height;
    private double radius;

    // Constructor
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    // Getter and setter methods
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate the volume of the cylinder
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Calculate the surface area of the cylinder
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // String representation
    @Override
    public String toString() {
        return "Cylinder {height=" + height + ", radius=" + radius + ", surface area=" + surfaceArea() + ", volume="
                + volume() + "}";
    }
}