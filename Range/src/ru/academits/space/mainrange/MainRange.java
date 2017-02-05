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

        System.out.println("Введите начало и конец второго интервала: ");

        from = in.nextDouble();
        to = in.nextDouble();

        Range range2 = new Range(from, to);

        double interval2 = range2.calcLength();
        System.out.printf("Длина второго интервала: %.3f%n", interval2);

        Range range3 = range.getIntersection(range2);
        if (range3 == null) {
            System.out.println("Пересечений интервалов нет");
        } else {
            System.out.printf("Пересечение интервала: (%.2f, %.2f)%n", range3.getFrom(), range3.getTo());
        }

        Range[] range4 = range.getAssociation(range2);
        System.out.printf("Объединение двух интервалов, новый интервал: %s%n", Range.toString(range4));

        Range[] range5 = range.getSubtraction(range2);
        if (range5 == null) {
            System.out.println("Разности двух интервалов нет.");
        } else {
            System.out.printf("Разности двух интервалов, новый интервал: %s%n", Range.toString(range5));
        }

        System.out.println();
        System.out.println("Введите x: ");
        double x = in.nextDouble();

        boolean inside = range.isInside(x);
        System.out.printf("Данное число %.2f принадлежит первому диапазону: %b ", x, inside);
    }
}
