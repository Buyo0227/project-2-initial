package com.csc205.project2;
/* Github copilot command: create a class called cylinder with height and radius as instance variables, methods
to get and set the height and radius, methods to calculate the surface area and volume of the cube,
and a toString method. */
public class Cylinder extends Shape {
    private double height;
    private double radius;

    public Cylinder() {
        this.height = 0.0;
        this.radius = 0.0;
    }
    public Cylinder (double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public double getRadius() {
        return radius;
    }
    public void setHeight (double height) {
        this.height = height;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}


