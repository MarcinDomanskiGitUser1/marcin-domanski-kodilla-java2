package com.kodilla.testing.Shape;

public class Triangle implements Shape {

    private String shapeName;
    private int sideA;
    private int sideB;
    private int sideC;
    private double field = sideA * sideB * sideC;

    public Triangle(String shapeName, int sideA, int sideB, int sideC) {
        this.shapeName = shapeName;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public double getField() {
        return field;
    }

    @Override //dlaczego intelij tak dopisuje
    public String getShapeName() {
        return shapeName;
    }
}

