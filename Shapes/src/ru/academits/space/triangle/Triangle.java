package ru.academits.space.triangle;

import ru.academits.space.shapes.Shapes;

import java.util.Arrays;


public class Triangle extends Shapes {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public static double getMin(double x1, double x2, double x3) {
        double[] array = {x1, x2, x3};
        Arrays.sort(array);
        return array[0];
    }

    public static double getMax(double x1, double x2, double x3) {
        double[] array = {x1, x2, x3};
        Arrays.sort(array);
        return array[2];
    }

    public static double calcLengthSegments(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public double getHeight() {
        return (getMax(x1, x2, x3) - getMin(x1, x2, x3));
    }

    public double getWidth() {
        return (getMax(y1, y2, y3) - getMin(y1, y2, y3));
    }

    public double getArea() {
        return 1 / 2 * getHeight() * getWidth();
    }

    public double getPerimeter() {
        return calcLengthSegments(x1, y1, x2, y2) + calcLengthSegments(x2, y2, x3, y3) + calcLengthSegments(x3, y3, x1, y1);
    }
}
