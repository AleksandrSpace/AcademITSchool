package ru.academits.space.mainrange;

import ru.academits.space.range.Range;

import java.util.Scanner;


public class MainRange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Создать свой класс Range (числовой диапазон). ");
        System.out.println("Введите начало и конец первого диапазона: ");

        double from = in.nextDouble();
        double to = in.nextDouble();

        Range range = new Range(from, to);

        double interval = range.calcLength();
        System.out.printf("Длина первого интервала: %.3f%n", interval);

        System.out.println("Введите начало и конец второго диапазона: ");

        from = in.nextDouble();
        to = in.nextDouble();

        Range range2 = new Range(from, to);

        range2.setFrom(from);
        range2.setTo(to);

        double interval2 = range2.calcLength();
        System.out.printf("Длина второго интервала: %.3f%n", interval2);

// Range getIntersection(range2)



        System.out.println("Введите x: ");
        double x = in.nextDouble();

        boolean inside = range.isInside(x);
        System.out.printf("Данное число %.2f принадлежит диапазону: %b ", x, inside);
    }
}
