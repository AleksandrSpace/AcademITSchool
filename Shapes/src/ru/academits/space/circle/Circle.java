package ru.academits.space.circle;

import ru.academits.space.shapes.Shapes;

public class Circle extends Shapes {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return 2 * radius;
    }

    public double getWidth() {
        return 2 * radius;
    }

    public double getArea() {
        return 2 * Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
