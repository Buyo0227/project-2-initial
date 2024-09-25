package com.csc205.project2;
/* Github copilot command: create a class called Cone with a radius and height as instance variables, methods
to get and set the radius and height, a method to calculate the surface area of the cone, a method to calculate the volume of the cone,
and a toString method. */
public class Cone {
    private double radius;
    private double height;

    public Cone() {
        this.radius = 0.0;
        this.height = 0.0;
    }
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight (double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    public double volume() {
        return Math.PI * radius * radius * height / 3;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}

