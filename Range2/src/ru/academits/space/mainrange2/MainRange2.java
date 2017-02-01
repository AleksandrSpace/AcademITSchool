package ru.academits.space.mainrange2;

import ru.academits.space.range2.Range2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Александр on 31.01.2017.
 */

public class MainRange2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Создать свой класс Range2 (числовой диапазон). ");
        System.out.println("Введите начало и конец  первого диапазона: ");

        double from = in.nextDouble();
        double to = in.nextDouble();

        Range2 range = new Range2(from, to);

  //      System.out.printf("%.3f%n", range.getFrom());
 //       System.out.printf("%.3f%n", range.getTo());

        System.out.println("Введите начало и конец  второго диапазона: ");

        from = in.nextDouble();
        to = in.nextDouble();

        Range2 range2 = new Range2(from, to);

        range2.setFrom(from);
        range2.setTo(to);

  //   System.out.printf("%.3f%n", range2.getFrom());
     //   System.out.printf("%.3f%n", range2.getTo());


        double interval = range.calcLength();
        System.out.printf("Длина первого интервала: %.3f%n", interval);

        double interval2 = range2.calcLength();
        System.out.printf("Длина  второго интервала: %.3f%n", interval2);








        //      System.out.printf("%.3f%n", range2.getIntersection(range2).getTo());


        //   public Range2 getIntersection(Range2 range2)

        /*
        System.out.println("Введите x: ");
        double x = in.nextDouble();

        boolean inside = range.isInside(x);
        System.out.printf("Данное число %.2f принадлежит диапазону: %b ", x, inside);
        */
    }
}
