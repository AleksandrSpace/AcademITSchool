package ru.academits.space.space.shape;

public class Square implements Shape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getWidth() {
        return length;
    }

    public double getHeight() {
        return length;
    }

    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return 4 * length;
    }

    public String toString() {
        return " Квадрат ";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Square square = (Square) o;
        return length == square.length;
    }

    public int hashCode() {
        final int prime = 5;
        int hash = 1;
        hash = prime * hash + (int) length;
        return hash;
    }

}
