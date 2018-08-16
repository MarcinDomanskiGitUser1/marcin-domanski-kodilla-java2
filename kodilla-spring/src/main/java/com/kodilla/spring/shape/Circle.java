package com.kodilla.spring.shape;


@Component
public class Circle implements Shape {

    @Override
    public String getShapeName() {
        return "This is a Circle";
    }
}
