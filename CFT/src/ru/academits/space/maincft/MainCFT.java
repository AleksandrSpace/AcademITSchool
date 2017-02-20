package ru.academits.space.maincft;

import ru.academits.space.insertionsort.InsertionSortDecrease;
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

            if (args[2].equals("-i")) {

                if (args[3].equals("-a")) {

                    ArrayList<Integer> line = new ArrayList<>(20);
                    while (scan.hasNextInt()) {
                        line.add(scan.nextInt());
                    }

                    for (Object e : InsertionSortStringIncrease.sorting(line)) {
                        writer.println(e);
                    }

                } else if (args[3].equals("-d")) {

                    ArrayList<Integer> line = new ArrayList<>(20);
                    while (scan.hasNextInt()) {
                        line.add(scan.nextInt());
                    }

                    for (Object e : InsertionSortDecrease.sorting(line)) {
                        writer.println(e);
                    }

                } else {
                    System.out.println(" Не коректный аргумент. ");

                }

            } else if (args[2].equals("-s")) {

                if (args[3].equals("-a")) {

                    ArrayList<String> line = new ArrayList<>(20);
                    while (scan.hasNextLine()) {
                        line.add(scan.nextLine());
                    }

                    for (Object e : InsertionSortStringIncrease.sorting(line)) {
                        writer.println(e);
                    }

                } else if (args[3].equals("-d")) {

                    ArrayList<String> line = new ArrayList<>(20);
                    while (scan.hasNextLine()) {
                        line.add(scan.nextLine());
                    }

                    for (Object e : InsertionSortStringDecrease.sorting(line)) {
                        writer.println(e);
                    }

                } else {
                    System.out.println(" Не коректный аргумент. ");

                }

            } else {
                System.out.println(" Не коректный тип. ");

            }

        } catch (FileNotFoundException e) {
            System.out.println(" Не обнаружено указанного файла");
        }
    }
}


