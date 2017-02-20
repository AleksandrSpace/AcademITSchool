package ru.academits.space.main;

import ru.academits.space.shape.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(" Фигуры. ");
        System.out.println();

        Shape[] shape = {new Triangle(11, 40, 20, 10, 40, 20), new Triangle(1, 8, 23, 1, 43, 12), new Circle(15),
                new Circle(15), new Rectangle(5, 23), new Rectangle(34, 12), new Square(3), new Square(10)};

        Shape s = getMaxArea(shape);
        System.out.printf(" Фигура %s, имеет максимальную площадь %.2f", s.toString(), s.getArea());
        System.out.println();
        Shape p = getSecondMaxPerimeter(shape);
        System.out.printf(" Фигура %s, имеет периметр, второй с конца %.2f", p.toString(), p.getPerimeter());
        System.out.println();
        System.out.printf(" Проверка на equals: %s", shape[2].equals(shape[3]));
        System.out.println();
        for (Shape e : shape) {
            System.out.printf(" Фигура: %s -  hashCode  %d", e.toString(), e.hashCode());
            System.out.println();
        }
    }

    public static Shape getMaxArea(Shape[] shape) {
        Shape record = shape[0];
        for (int i = 1; i < shape.length; ++i) {
            if (shape[i].getArea() > record.getArea()) {
                record = shape[i];
            }
        }
        return record;
    }

    public static Shape getSecondMaxPerimeter(Shape[] shape) {

        Shape record2 = shape[0];
        double[] array = new double[shape.length];
        int i = 0;
        for (Shape e : shape) {
            array[i] = e.getPerimeter();
            ++i;
        }

        Arrays.sort(array);
        for (Shape e : shape) {
            if (array[array.length - 2] == e.getPerimeter()) {
                record2 = e;
                break;
            }
        }
        return record2;
    }
}







