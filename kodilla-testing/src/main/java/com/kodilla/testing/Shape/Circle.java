package com.kodilla.testing.Shape;

public class Circle implements Shape {

    private String shapeName;
    private int radius;

    public Circle (String shapeName, int radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    public double getField() {
        return 3.14 * (radius * radius);
    }
    public String getShapeName() {
        return shapeName;
    }
}
