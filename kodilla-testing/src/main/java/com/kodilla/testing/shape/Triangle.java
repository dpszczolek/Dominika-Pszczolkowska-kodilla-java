package com.kodilla.testing.shape;

import java.util.Objects;

class Triangle implements Shape{

    private String name;
    private double a, h;

    public Triangle (String name, int a, int h) {
        this.name = name;
        this.a = a;
        this.h = h;
    }
    @Override
    public String getShapeName () {
        return name;
    }
    @Override
    public double getField() {
        return (a*h)/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a &&
                h == triangle.h &&
                Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, a, h);
    }
}
