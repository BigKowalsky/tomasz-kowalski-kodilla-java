package com.kodilla.testing.shape;

public class Square implements Shape {
    private int side;
    private String name = "Square";

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getField() {
        return side * side;
    }

    @Override
    public String getShapeName() {
        return name;
    }
}

