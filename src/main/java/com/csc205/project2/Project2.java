package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {
    public static void main(String[] args) {



        Sphere Sphere1 = new Sphere(2.0);
        System.out.println(Sphere1);

        Cube Cube1 = new Cube(5.0);
        System.out.println(Cube1);

        Cylinder Cylinder1 = new Cylinder(4.0, 1.0);
        System.out.println(Cylinder1);

        Cone Cone1 = new Cone(Sphere1.getRadius(), Cylinder1.getHeight());
        System.out.println(Cone1);


    }



}

