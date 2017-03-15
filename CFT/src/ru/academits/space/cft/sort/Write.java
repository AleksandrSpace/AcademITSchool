package ru.academits.space.cft.sort;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Write {

    public static void write(ArrayList<?> array, String output) throws IOException {

        if (output.equals("outputCFT.txt")) {
            try (PrintWriter writer = new PrintWriter("outputCFT.txt")) {
                array.forEach(writer::println);
            }
        } else {
            throw new IOException();
        }
    }
}


