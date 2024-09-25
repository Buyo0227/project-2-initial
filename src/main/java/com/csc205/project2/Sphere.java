package com.csc205.project2;

public class Sphere extends Shape {
    private double radius;

    public Sphere() {
        this.radius = 0.0;
    }

    public Sphere (double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return 4.0/3.0 * Math.PI * radius * radius * radius;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}


