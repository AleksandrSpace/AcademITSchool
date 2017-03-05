package ru.academits.space.vector;

import java.util.Arrays;


public class Vector {

    final double epsilon = 0.0001;
    private double[] vector;

    public Vector(int n) {
        vector = new double[n];
    }

    public Vector(Vector vector) {
        this.vector = vector.vector;
    }

    public Vector(double[] vector) {
        this.vector = vector;
    }

    public Vector(double[] vector, int n) {
        this.vector = Arrays.copyOf(vector, n);
    }

    private static void Expanding2(Vector vector1, Vector vector2) {
        int a = Math.max(vector1.vector.length, vector2.vector.length);
        if (vector1.vector.length < vector2.vector.length) {
            double[] old = vector1.vector;
            vector1.vector = new double[a];
            System.arraycopy(old, 0, vector1.vector, 0, old.length);
        }
    }

    public static Vector getAddition2(Vector vector1, Vector vector2) {

        Vector.Expanding2(vector1, vector2);

        for (int i = 0; i < vector2.vector.length; ++i) {
            vector1.vector[i] += vector2.vector[i];
        }
        return vector1;
    }

    public static Vector getSubtraction2(Vector vector1, Vector vector2) {

        Expanding2(vector1, vector2);

        for (int i = 0; i < vector2.vector.length; ++i) {
            vector1.vector[i] -= vector2.vector[i];
        }
        return vector1;
    }

    public static Vector getMultiplicationScalar2(Vector vector1, int x) {

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

    public String toString(double[] vector) {
        return Arrays.toString(vector).replace("[", "{").replace("]", "}");
    }

    private void Expanding(Vector vector) {
        int a = Math.max(this.vector.length, vector.vector.length);
        if (this.vector.length < vector.vector.length) {
            double[] old = this.vector;
            this.vector = new double[a];
            System.arraycopy(old, 0, this.vector, 0, old.length);
        }
    }

    public Vector getAddition(Vector vector) {

        Expanding(vector);

        for (int i = 0; i < vector.vector.length; ++i) {
            this.vector[i] += vector.vector[i];
        }
        return this;
    }

    public Vector getSubtraction(Vector vector) {

        Expanding(vector);

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

    public Vector getUnfolding() {

        for (int i = 0; i < this.vector.length; ++i) {
            this.vector[i] *= -1;
        }
        return this;
    }

    public double getLength() {

        double sum = 0;
        for (int i = 0; i < this.vector.length; ++i) {

            this.vector[i] = (Math.pow(this.vector[i], 2));
            sum += this.vector[i];
        }
        return Math.abs(Math.sqrt(sum));
    }

    public double getIndex(int i) {
        return this.vector[i];
    }

    public double setIndex(int i, double x) {
        return this.vector[i] = x;
    }

    private boolean isEpsilon(Vector vector) {

        for (int i = 1; i < this.vector.length - 1; ++i)
            if (Math.abs(this.vector[i] - vector.vector[i]) >= epsilon) {
                return false;
            }
        return true;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Vector vector = (Vector) o;
        return (this.vector.length == vector.vector.length) && isEpsilon(vector);
    }

    public int hashCode() {
        final int prime = 11;
        int hash = 1;
        for (int i = 0; i < this.vector.length; ++i) {
            hash = prime * hash + (int) this.vector[i];
        }
        return hash;
    }
}


