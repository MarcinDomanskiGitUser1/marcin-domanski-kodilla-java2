package com.kodilla.spring.shape;

@Component
public class Triangle implements Shape {

    @Override
    public String getShapeName() {
        return "This is a Triangle";
    }
}
