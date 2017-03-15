package ru.academits.space.cft.sort;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadNumbers {

    public static ArrayList<Integer> read(String fileInput) throws FileNotFoundException {

        if (fileInput.equals("inputCFTInt.txt")) {
            ArrayList<Integer> numberArray = new ArrayList<>(100);

            try (Scanner scan = new Scanner(new FileInputStream("inputCFTInt.txt"))) {
                while (scan.hasNextInt()) {
                    numberArray.add(scan.nextInt());
                }
            }
            return numberArray;
        } else {
            throw new FileNotFoundException();
        }
    }
}

