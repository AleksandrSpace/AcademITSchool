package ru.academits.space.shape;

public class Circle implements Shape {

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
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return " Окружность ";
    }

    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    public int hashCode() {
        final int prime = 3;
        int hash = 1;
        hash = prime * hash + (int) radius;
        return hash;
    }
}
