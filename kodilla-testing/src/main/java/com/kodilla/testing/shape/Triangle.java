package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private int side;
    private int high;
    private String name = "Triangle";

    public Triangle(int side, int high) {
        this.side = side;
        this.high = high;
    }
    @Override
    public double getField() {
        return (side * high) / 2.0;
    }

    @Override
    public String getShapeName() {
        return name;
    }
}
