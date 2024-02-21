package org.example;

import java.util.List;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create instances of each shape
        Shape3D sphere = new Sphere(2.0);
        Shape3D cube = new Cube(5.0);
        Shape3D cylinder = new Cylinder(4.0, 1.0);
        Shape3D rectangularPrism = new RectangularPrism(3.0, 4.0, 5.0);

        // Print the details of each shape
        System.out.println(sphere.toString());
        System.out.println(cube.toString());
        System.out.println(cylinder.toString());
        System.out.println(rectangularPrism.toString());
    }
}