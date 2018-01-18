package com.kodilla.testing.shape;

import java.util.Objects;

class Square implements Shape {
    String name;
    double a;

    public Square (String name, int a) {
        this.name = name;
        this.a = a;
    }
    @Override
    public String getShapeName () {
        return name;
    }
    @Override
    public double getField() {
        return Math.pow(a, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return a == square.a &&
                Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, a);
    }
}
