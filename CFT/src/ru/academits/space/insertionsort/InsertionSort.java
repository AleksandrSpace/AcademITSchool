package ru.academits.space.insertionsort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Александр on 27.02.2017.
 */

public class InsertionSort {
    public static <T> List sorting(ArrayList<T> list, Comparator<T> comparator) {

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
