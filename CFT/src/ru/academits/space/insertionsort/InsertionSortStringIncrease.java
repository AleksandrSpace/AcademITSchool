package ru.academits.space.insertionsort;

import java.util.ArrayList;

/**
 * Created by Александр on 19.02.2017.
 */
public class InsertionSortStringIncrease {

    public static ArrayList<String> sorting(ArrayList line) {

        for (int i = 1; i < line.size(); ++i) {

            Object memory = line.get(i);
            int j = i;

            while (j > 0 && line.get(j - 1).toString().compareTo(memory.toString()) > 0) {

                line.set(j, line.get(j - 1));
                --j;
            }
            line.set(j, memory);
        }
        return line;
    }
}







