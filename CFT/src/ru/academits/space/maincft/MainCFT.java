package ru.academits.space.maincft;

import ru.academits.space.insertionsort.EntryHelp;
import ru.academits.space.insertionsort.InsertionSort;
import ru.academits.space.insertionsort.IntegerComparator;
import ru.academits.space.insertionsort.StringComparator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class MainCFT {
    public static void main(String[] args) { // throws FileNotFoundException {

        if (args.length != 4) {
            System.out.println("Параметры командной строки не соответствуют программе.");
            System.out.println();
            EntryHelp.Help();
            return;
        }

        try (Scanner scan = new Scanner(new FileInputStream(args[0]));
             PrintWriter writer = new PrintWriter(args[1])) {

            switch (args[2]) {
                case "-i": {
                    ArrayList<Integer> list = new ArrayList<>(100);
                    while (scan.hasNextInt()) {
                        list.add(scan.nextInt());
                    }
                    switch (args[3]) {
                        case "-a":
                            InsertionSort.sorting(list, new IntegerComparator()).forEach(writer::println);
                            break;
                        case "-d":
                            InsertionSort.sorting(list, new IntegerComparator().reversed()).forEach(writer::println);
                            break;
                        default:
                            System.out.println(" Не коректная функция: increase, decrease ");
                            break;
                    }
                    break;
                }
                case "-s": {
                    ArrayList<String> list = new ArrayList<>(100);
                    while (scan.hasNextLine()) {
                        list.add(scan.nextLine());
                    }
                    switch (args[3]) {
                        case "-a":
                            InsertionSort.sorting(list, new StringComparator()).forEach(writer::println);
                            break;
                        case "-d":
                            InsertionSort.sorting(list, new StringComparator().reversed()).forEach(writer::println);
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
