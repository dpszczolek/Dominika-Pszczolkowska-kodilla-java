package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask (final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("shopping", "eggs", 6.0);
            case PAINTING:
                return new PaintingTask("painting", "beige", "corridor");
            case DRIVING:
                return new DrivingTask("driving", "to school", "bike");
            default:
                return null;
        }
    }
}
