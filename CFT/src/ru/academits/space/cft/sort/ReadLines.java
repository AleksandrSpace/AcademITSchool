package ru.academits.space.cft.sort;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadLines {
    public static ArrayList<String> read(String fileInput) throws FileNotFoundException {

        if (fileInput.equals("inputCFTString.txt")) {
            ArrayList<String> lines = new ArrayList<>(100);
            try (Scanner scan = new Scanner(new FileInputStream("inputCFTString.txt"))) {
                while (scan.hasNextLine()) {
                    lines.add(scan.nextLine());
                }
            }
            return lines;
        } else {
            throw new FileNotFoundException();
        }
    }
}