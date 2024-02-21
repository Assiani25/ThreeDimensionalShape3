package org.example;

import java.lang.Math;

// Abstract class for 3D shapes
abstract class Shape3D {
    // Abstract methods to compute surface area and volume
    public abstract double surfaceArea();

    public abstract double volume();

    // Abstract method to provide a string representation of the shape
    public abstract String toString();
}