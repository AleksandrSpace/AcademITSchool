package ru.academits.space.maincft;

import ru.academits.space.insertionsort.InsertionSortDecrease;
import ru.academits.space.insertionsort.InsertionSortIncrease;
import ru.academits.space.insertionsort.InsertionSortStringDecrease;
import ru.academits.space.insertionsort.InsertionSortStringIncrease;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class MainCFT {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length != 4) {
            System.out.println("Параметры командной строки не соответствуют программе.");
            return;
        }

        try (Scanner scan = new Scanner(new FileInputStream(args[0]));
             PrintWriter writer = new PrintWriter(args[1])) {

            switch (args[2]) {
                case "-i": {
                    ArrayList<Integer> line = new ArrayList<>(100);
                    while (scan.hasNextInt()) {
                        line.add(scan.nextInt());
                    }
                    switch (args[3]) {
                        case "-a":
                            for (Object e : InsertionSortIncrease.sorting(line)) {
                                writer.println(e);
                            }
                            break;
                        case "-d":
                            for (Object e : InsertionSortDecrease.sorting(line)) {
                                writer.println(e);
                            }
                            break;
                        default:
                            System.out.println(" Не коректная функция: increase, decrease ");
                            break;
                    }
                    break;
                }
                case "-s": {
                    ArrayList<String> line = new ArrayList<>(100);
                    while (scan.hasNextLine()) {
                        line.add(scan.nextLine());
                    }
                    switch (args[3]) {
                        case "-a":
                            for (Object e : InsertionSortStringIncrease.sorting(line)) {
                                writer.println(e);
                            }
                            break;
                        case "-d":
                            for (Object e : InsertionSortStringDecrease.sorting(line)) {
                                writer.println(e);
                            }
                            break;
                        default:
                            System.out.println(" Не коректная функция: increase, decrease  ");
                            break;
                    }
                    break;
                }
                default:
                    System.out.println(" Тип или String,  или Int не соответствует заданному .");
                    break;
            }
        } catch (FileNotFoundException e) {
            System.out.println(" Не обнаружено указанного файла");
        }
    }
}

