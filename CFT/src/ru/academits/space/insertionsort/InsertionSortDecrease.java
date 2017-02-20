package ru.academits.space.insertionsort;

import java.util.ArrayList;

/**
 * Created by Александр on 19.02.2017.
 */
public class InsertionSortDecrease {
    public static ArrayList sorting(ArrayList line) {

        for (int i = 1; i < line.size(); ++i) {

            int memory = (int) line.get(i);
            int j = i;
            while (j > 0 && (int) line.get(j - 1) <= memory) {
                line.set(j, line.get(j - 1));
                --j;
            }
            line.set(j, memory);
        }
        return line;
    }
}

