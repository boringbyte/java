package org.example;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10.0);
        rectangle.setWidth(10.0);

        if (rectangle.getLength() == rectangle.getWidth()) {
            System.out.println("It is a square");
        } else {
            System.out.println("It is not a square");
        }

        System.out.println("Area of rectangle is : " + rectangle.getArea());
    }
}
