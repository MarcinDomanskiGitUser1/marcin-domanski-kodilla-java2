package com.kodilla.testing.Shape;

public class Circle implements Shape {

    private String shapeName;
    private int radius;
    private double piNumber = 3.14;
    private double field = piNumber * (radius + radius);

    public Circle (String shapeName, int radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    public double getField() {
        return field;
    }
    public String getShapeName() {
        return shapeName;
    }
}
