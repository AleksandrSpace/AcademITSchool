package ru.academits.space.cft.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InsertionSort {
    public static <T> ArrayList<T> sorting(ArrayList<T> list, Comparator<T> comparator) {

        for (int i = 1; i < list.size(); ++i) {

            T memory = list.get(i);
            int j = i;

            while (j > 0 && comparator.compare(list.get(j - 1), memory) > 0) {

                list.set(j, list.get(j - 1));
                --j;
            }
            list.set(j, memory);
        }
        return list;
    }
}