package ru.academits.space.rectangle;

import ru.academits.space.square.Square;

public class Rectangle extends Square {
    private double width;

    public Rectangle(double length, double width) {
        super(length);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
}
