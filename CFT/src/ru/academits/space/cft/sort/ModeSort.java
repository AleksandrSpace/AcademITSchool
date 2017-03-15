package ru.academits.space.cft.sort;

import java.util.Comparator;

public class  ModeSort {
    public static <T> Comparator<T> select(String mode, Comparator<T> comparator) {

        switch (mode) {
            case "-a":
                return comparator;
            case "-d":
                return comparator.reversed();
            default:
                throw new IllegalArgumentException();
        }
    }
}

