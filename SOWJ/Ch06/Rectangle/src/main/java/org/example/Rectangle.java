package org.example;

public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double len) {
        length = len;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getArea() {
        return length * width;
    }
}
