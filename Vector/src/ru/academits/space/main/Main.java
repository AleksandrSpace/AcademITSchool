package ru.academits.space.main;

import ru.academits.space.vector.Vector;

public class Main {
    public static void main(String[] args) {

        try {

            double[] a = {3, 6, 9.0001, 0, 0, 0};
            Vector vector = new Vector(a);
            System.out.printf("Вектор1: %55s%n", vector.toString());
            System.out.printf("Размерность вектора1; %10d%n", vector.getSize());

            double[] b = {7, 4, 1};
            Vector vector2 = new Vector(b);
            System.out.printf("Вектор2: %37s%n", vector2.toString());
            System.out.printf("Размерность вектора2 %11d%n", vector2.getSize());

            int n = 10;
            Vector vector3 = new Vector(n);
            System.out.printf("Вектор3: %72s%n", vector3.toString());
            System.out.printf("Размерность вектора3: %11d%n", vector3.getSize());

            Vector vector4 = new Vector(vector);
            System.out.printf("Вектор4: %55s%n", vector4.toString());
            System.out.printf("Размерность вектора4: %10d%n", vector4.getSize());

            Vector vector5 = new Vector(b, n);
            System.out.printf("Вектор5: %72s%n", vector5.toString());
            System.out.printf("Размерность вектора5: %11d%n", vector5.getSize());

            Vector vector6 = vector.getAddition(vector2);
            System.out.printf("Полученный сложением вектор6 %38s%n", vector6);

            double[] a2 = {3, 6, 9.0001, 0, 0, 0};
            vector = new Vector(a2);
            double[] b2 = {7, 4, 1};
            vector2 = new Vector(b2);

            Vector vector7 = vector.getSubtraction(vector2);
            System.out.printf("Полученный вычитанием вектор7: %s%n", vector7);

            double[] a3 = {3, 6, 9.0001, 0, 0, 0};
            vector = new Vector(a3);
            int scalar = 3;

            Vector vector8 = vector.getMultiplicationScalar(scalar);
            System.out.printf("Полученный умножением на скаляр вектор8: %s%n", vector8);

            double[] a4 = {3, 6, 9.0001, 0, 0, 0};
            vector = new Vector(a4);

            Vector vector9 = vector.getRevers();
            System.out.printf("Полученный разворот вектор9: %41s%n", vector9);

            double[] a5 = {3, 3, 3, 3, 0, 0};
            vector = new Vector(a5);

            System.out.printf("Полученный  длина вектор10: %11f%n", vector.getLength());

            double[] a6 = {3, 6, 9.0001, 0, 0, 0};
            vector = new Vector(a6);

            int index = 2;
            System.out.printf("Элемент под индексом %11d = %f%n", index, vector.getComponent(index));

            int index2 = 2;
            double x = 5.6;
            vector3.setComponent(index2, x);
            System.out.printf("Полученный вектор10 с новым значением: %s%n", vector3);

            double[] a7 = {3, 6, 9.0000, 0, 0, 0};
            vector = new Vector(a7);
            double[] b3 = {3, 6, 9.00000, 0, 0, 0};
            vector2 = new Vector(b3);

            System.out.printf("Проверка на equals: %15s%n", vector.equals(vector2));
            System.out.printf("hashCode = %30d%n", vector.hashCode());

            double[] a8 = {3, 6, 9.0001, 0, 0, 0};
            vector = new Vector(a8);
            double[] b4 = {7, 4, 1};
            vector2 = new Vector(b4);

            Vector vector11 = Vector.getAddition(vector, vector2);
            System.out.printf("Полученный сложением вектор11: %s%n", vector11);

            double[] a9 = {3, 6, 9.0001, 0, 0, 0};
            vector = new Vector(a9);
            double[] b5 = {7, 4, 1};
            vector2 = new Vector(b5);

            Vector vector12 = Vector.getSubtraction(vector, vector2);
            System.out.printf("Полученный вычитанием вектор12:%s%n", vector12);

            double[] a10 = {1, 2, 2, 3, 0, 0, 0};
            vector = new Vector(a10);
            double[] b6 = {1, 2, 2, 3};
            vector2 = new Vector(b6);

            System.out.printf("Скалярное умножение векторов: %10f%n", Vector.getMultiplication(vector, vector2));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


