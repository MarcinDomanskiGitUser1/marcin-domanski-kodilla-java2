package com.kodilla.testing.Shape;

public class Triangle implements Shape {

    private String shapeName;
    private int high;
    private int base;

    public Triangle(String shapeName, int high, int base) {
        this.shapeName = shapeName;
        this.high = high;
        this.base = base;
    }

    public double getField() {
        return 0.5 * base * high;
    }

    public String getShapeName() {
        return shapeName;
    }
}

