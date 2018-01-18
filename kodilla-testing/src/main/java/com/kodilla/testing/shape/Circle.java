package com.kodilla.testing.shape;

import java.util.Objects;

class Circle implements Shape{
    private String name;
    private double r;

    public Circle (String name, int r) {
        this.name = name;
        this.r = r;
    }
    @Override
    public String getShapeName () {
        return name;
    }
    @Override
    public double getField() {
        return Math.PI*r*2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0 &&
                Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, r);
    }
}
