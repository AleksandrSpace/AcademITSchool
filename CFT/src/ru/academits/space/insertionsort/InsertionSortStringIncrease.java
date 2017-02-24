package ru.academits.space.insertionsort;

import java.util.ArrayList;

/**
 * Created by Александр on 19.02.2017.
 */
public class InsertionSortStringIncrease {

    public static ArrayList<String> sorting(ArrayList<String> line) {

        for (int i = 1; i < line.size(); ++i) {

            String memory = line.get(i);
            int j = i;

            while (j > 0 && line.get(j - 1).compareTo(memory) > 0) {

                line.set(j, line.get(j - 1));
                --j;
            }
            line.set(j, memory);
        }
        return line;
    }
}







