package com.kodilla.testing.Shape;

public class Square implements Shape {

    private String shapeName;
    private int sideA;
    private int sideB;
    private double field = sideA * sideB;

    public Square(String shapeName, int sideA, int sideB) {
        this.shapeName = shapeName;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getField() {
        return field;
    }
    public String getShapeName() {
        return shapeName;
    }

}