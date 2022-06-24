package com.kodilla.testing.shape;

public class Circle implements Shape{
    private int radius;
    private String name = "Circle";

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getField() {
        return radius * radius * 3.14;
    }

    @Override
    public String getShapeName() {
        return name;
    }
}
