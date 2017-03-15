package ru.academits.space.cft;


import ru.academits.space.cft.sort.DataTypeErrorException;
import ru.academits.space.cft.sort.EntryHelp;
import ru.academits.space.cft.sort.ReadLines;
import ru.academits.space.cft.sort.ReadNumbers;
import ru.academits.space.cft.sort.InsertionSort;
import ru.academits.space.cft.sort.IntegerComparator;
import ru.academits.space.cft.sort.ModeSort;
import ru.academits.space.cft.sort.StringComparator;
import ru.academits.space.cft.sort.Write;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class MainCFT {

    public static void main(String[] args) throws Exception {

        try {
            if (args.length != 4) {
                throw new ArrayIndexOutOfBoundsException();
            }
            switch (args[2]) {
                case "-i":
                    ArrayList<Integer> resultArrayInt = ReadNumbers.read(args[0]);
                    resultArrayInt = InsertionSort.sorting(resultArrayInt, ModeSort.select(args[3], new IntegerComparator()));
                    Write.write(resultArrayInt, args[1]);
                    break;
                case "-s":
                    ArrayList<String> resultArrayString = ReadLines.read(args[0]);
                    resultArrayString = InsertionSort.sorting(resultArrayString, ModeSort.select(args[3], new StringComparator()));
                    Write.write(resultArrayString, args[1]);
                    break;
                default:
                    throw new DataTypeErrorException();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Исходный файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл.");
        } catch (IllegalArgumentException e) {
            System.out.println("Неверно указан режим сортировки.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверное количество аргументов.");
            EntryHelp.help();
        } catch (DataTypeErrorException e) {
            System.out.println("Неверно указан тип данных.");
        }
    }
}

