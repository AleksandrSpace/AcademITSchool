package ru.academits.space.vector;

import java.util.Arrays;


public class Vector {

    //   final double epsilon = 0.0001;
    private double[] vector;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Длина массива меньше нуля.");
        }
        vector = new double[n];
    }

    public Vector(Vector vector) {
        double[] old = vector.vector;
        System.arraycopy(old, 0, vector.vector, 0, old.length);
        this.vector = vector.vector;
    }

    public Vector(double[] vector) {

        System.arraycopy(vector, 0, vector, 0, vector.length);

        this.vector = vector;
    }

    public Vector(double[] vector, int n) {
        this.vector = Arrays.copyOf(vector, n);
    }

    private static void expanding(Vector vector1, Vector vector2) {
        int maxLength = Math.max(vector1.vector.length, vector2.vector.length);
        if (vector1.vector.length < vector2.vector.length) {
            double[] old = vector1.vector;
            vector1.vector = new double[maxLength];
            System.arraycopy(old, 0, vector1.vector, 0, old.length);
        }
    }

    public static Vector getAddition(Vector vector1, Vector vector2) {

        Vector.expanding(vector1, vector2);

        for (int i = 0; i < vector2.vector.length; ++i) {
            vector1.vector[i] += vector2.vector[i];
        }
        return vector1;
    }

    public static Vector getSubtraction(Vector vector1, Vector vector2) {

        expanding(vector1, vector2);

        for (int i = 0; i < vector2.vector.length; ++i) {
            vector1.vector[i] -= vector2.vector[i];
        }
        return vector1;
    }

    public static Vector getMultiplicationScalar(Vector vector1, int x) {

        for (int i = 0; i < vector1.vector.length; ++i) {
            vector1.vector[i] *= x;
        }
        return vector1;
    }

    public int getSize() {
        return vector.length;
    }

    public String toString() {
        String s1 = Arrays.toString(vector).replace("[", "{");
        return s1.replace("]", "}");
    }

    private void expanding(Vector vector) {
        int maxLength = Math.max(this.vector.length, vector.vector.length);
        if (this.vector.length < vector.vector.length) {
            double[] old = this.vector;
            this.vector = new double[maxLength];
            System.arraycopy(old, 0, this.vector, 0, old.length);
        }
    }

    public Vector getAddition(Vector vector) {

        expanding(vector);

        for (int i = 0; i < vector.vector.length; ++i) {
            this.vector[i] += vector.vector[i];
        }
        return this;
    }

    public Vector getSubtraction(Vector vector) {

        expanding(vector);

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
/*
    public Vector getUnfolding() {

        for (int i = 0; i < this.vector.length; ++i) {
            this.vector[i] *= -1;
        }
        return this;
    }
    */

    public double getLength() {

        double sum = 0;
        Vector vector1 = new Vector(this.vector);

        for (int i = 0; i < vector1.vector.length; ++i) {

            this.vector[i] = (Math.pow(vector1.vector[i], 2));
            sum += this.vector[i];
        }
        return Math.abs(Math.sqrt(sum));
    }

    public double getComponentsIndex(int i) {
        return this.vector[i];
    }

    public double setComponentsIndex(int i, double x) {
        return this.vector[i] = x;
    }

    /*
        private boolean isEpsilon(Vector vector) {

            for (int i = 1; i < this.vector.length - 1; ++i)
                if (Math.abs(this.vector[i] - vector.vector[i]) >= epsilon) {
                    return false;
                }
            return true;
        }
    */
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Vector vector = (Vector) o;
        return (this.vector.length == vector.vector.length) && Arrays.equals(this.vector, vector.vector);    //isEpsilon(vector);
    }

    public int hashCode() {
//
        //final int prime = 11;
        //int hash = 1;
        //for (int i = 0; i < this.vector.length; ++i) {
        //hash = prime * hash + (int) this.vector[i];
        //}
        //
        return Arrays.hashCode(vector);
    }
}


