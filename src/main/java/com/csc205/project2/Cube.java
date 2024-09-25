package com.csc205.project2;
/* Github copilot command: create a class called Cube with a width as instance variables, methods
to get and set the width, a methods to calculate the surface area and volume of the cube,
and a toString method. */
public class Cube extends Shape {
    private double width;

    public Cube() {
        this.width = 0.0;
    }
    public Cube(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth (double width) {
        this.width = width;
    }

    public double surfaceArea() {
        return 6 * width * width;
    }

    public double volume() {
        return width * width * width;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}

