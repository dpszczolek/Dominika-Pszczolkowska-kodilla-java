package com.kodilla.testing.shape;

import java.util.ArrayList;

class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape> ();

    public void addFigure (Shape shape) {
        shapes.add(shape);
    }
    public boolean removeFigure (Shape shape) {
        boolean result = true;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = false;
        }
        return result;
    }
    public Shape getFigure (int n) {
        Shape shape = null;
        if (n >= 0 && n < shapes.size()) {
            shape = shapes.get(n);
        }
        return shape;
    }
    public String showFigures() {
        String listOfFigures = shapes.toString();
        listOfFigures = listOfFigures.replace("[", "");
        listOfFigures = listOfFigures.replace("]", "");
        return listOfFigures;
    }
    public int getFiguresQuantity () {
        int figuresQuantity = shapes.size();
        return figuresQuantity;
    }
}
