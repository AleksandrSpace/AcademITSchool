package ru.academits.space.mainrange; /**
 * Created by Александр on 28.01.2017.
 */
import ru.academits.space.range.Range;

import java.util.Scanner;

public class MainRange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Создать свой класс Range (числовой диапазон). ");
        System.out.println("Введите начало и конец диапазона: ");

        double from = in.nextDouble();
        double to = in.nextDouble();

        Range range = new Range(from, to);

        System.out.printf("%.3f%n",range.getFrom());

        double interval = range.calcLength();
        System.out.printf("Длина интервала: %.3f%n", interval);

        System.out.println("Введите x: ");
        double x = in.nextDouble();

        boolean inside = range.isInside(x);
        System.out.printf("Данное число %.2f принадлежит диапазону: %b ", x, inside);
    }
}
