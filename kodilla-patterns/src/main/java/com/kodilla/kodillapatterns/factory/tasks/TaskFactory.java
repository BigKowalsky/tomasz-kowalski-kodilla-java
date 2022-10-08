package com.kodilla.kodillapatterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task makeTask(final String task) {
        switch (task) {
            case SHOPPING:
                return new ShoppingTask("Buying painting utilities", "Watercolours", 23);
            case PAINTING:
                return new PaintingTask("Painting a landscape", "Blue", "A ship on the stormy see");
            case DRIVING:
                return new DrivingTask("Giving a painting", "Gallery", "Minivan");
            default:
                return null;
        }
    }
}
