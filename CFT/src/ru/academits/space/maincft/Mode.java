package ru.academits.space.maincft;

import ru.academits.space.insertionsort.IntegerComparator;

import java.util.Comparator;
import java.util.List;

public class Mode {
    public static <T> List select(String mode, Comparator<T> comparator) {
        try {
            switch (mode) {
                case "-a":
                    list new IntegerComparator();

                case "-b":
                    new IntegerComparator().reversed();

                default:
                    throw new IllegalArgumentException ();
            }
            return list;

        }
