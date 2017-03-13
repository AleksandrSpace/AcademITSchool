package ru.academits.space.vector;

import java.util.Arrays;


public class Vector {
    private double[] vector;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Длина массива меньше нуля.");
        }
        vector = new double[n];
    }

    public Vector(Vector vector) {
        this.vector = vector.vector;
    }

    public Vector(double[] vector) {
        this.vector = Arrays.copyOf(vector, vector.length);
    }

    public Vector(double[] vector, int n) {
        this.vector = Arrays.copyOf(vector, n);
    }

    public static Vector getAddition(Vector vector1, Vector vector2) {

        Vector vector3 = new Vector(vector1);
        vector3.getAddition(vector2);
        return vector3;
    }

    public static Vector getSubtraction(Vector vector1, Vector vector2) {

        Vector vector3 = new Vector(vector1);
        vector3.getSubtraction(vector2);
        return vector3;
    }

    public static double getMultiplication(Vector vector1, Vector vector2) {

        double multiplication = 0;
        int length = Math.min(vector1.vector.length, vector2.vector.length);

        for (int i = 0; i < length; ++i) {
            multiplication += vector2.vector[i] * vector1.vector[i];

        }
        return multiplication;
    }

    public int getSize() {
        return vector.length;
    }

    public String toString() {
        String s1 = Arrays.toString(vector).replace("[", "{");
        return s1.replace("]", "}");
    }

    private void expand(Vector vector) {
        int maxLength = Math.max(this.vector.length, vector.vector.length);
        if (this.vector.length < vector.vector.length) {
            double[] old = this.vector;
            this.vector = new double[maxLength];
            System.arraycopy(old, 0, this.vector, 0, old.length);
        }
    }

    public Vector getAddition(Vector vector) {

        expand(vector);

        for (int i = 0; i < vector.vector.length; ++i) {
            this.vector[i] += vector.vector[i];
        }
        return this;
    }

    public Vector getSubtraction(Vector vector) {

        expand(vector);

        for (int i = 0; i < vector.vector.length; ++i) {
            this.vector[i] -= vector.vector[i];
        }
        return this;
    }

    public Vector getMultiplicationScalar(int scalar) {

        for (int i = 0; i < this.vector.length; ++i) {
            this.vector[i] *= scalar;
        }
        return this;
    }

    public double getLength() {

        double sum = 0;

        for (double e : vector) {
            sum += (Math.pow(e, 2));
        }
        return Math.sqrt(sum);
    }

    public double getComponent(int i) {
        return this.vector[i];
    }

    public void setComponent(int i, double x) {
        this.vector[i] = x;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Vector vector = (Vector) o;
        return (this.vector.length == vector.vector.length) && Arrays.equals(this.vector, vector.vector);
    }

    public int hashCode() {
        return Arrays.hashCode(vector);
    }
}


