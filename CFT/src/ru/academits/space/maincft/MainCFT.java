package ru.academits.space.maincft;

import ru.academits.space.insertionsort.InsertionSort;
import ru.academits.space.insertionsort.IntegerComparator;
import ru.academits.space.insertionsort.StringComparator;
import ru.academits.space.ru.academits.space.read.ReadLines;
import ru.academits.space.ru.academits.space.read.ReadNumbers;
import ru.academits.space.ru.academits.space.write.Write;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class MainCFT {
    public static void main(String[] args) throws FileNotFoundException {

        try {

            if (args.length != 4) {
                throw new ArrayIndexOutOfBoundsException();
                //  EntryHelp.help();
            } else {
                switch (args[2]) {
                    case "-i":
                        ArrayList<Integer> resultArrayInt = ReadNumbers.read(args[0]);
                        resultArrayInt = InsertionSort.sorting(resultArrayInt, Mode.select(args[3], new IntegerComparator()));
                        Write.write(resultArrayInt, args[1]);
                        break;
                    case "-s":
                        ArrayList<String> resultArray = ReadLines.read(args[1]);
                        resultArray = InsertionSort.sorting(resultArray, Mode.select(args[3], new StringComparator()));
                        Write.write(resultArray, args[1]);
                        break;
                    default:
                        throw new DataTypeErrorException();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Исходный файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл.");
        } catch (IllegalArgumentException e) {
            System.out.println("Неверно указан режим сортировки.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверное количество аргументов.");
        } catch (DataTypeErrorException e) {
            System.out.println("Неверно указан тип данных.");
        }
    }
}
