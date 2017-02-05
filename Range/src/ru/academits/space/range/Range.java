package ru.academits.space.range;

import java.util.Arrays;

public class Range {

    private static final double EPSILON = 1.0e-10;
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public static String toString(Range[] rangeArray) {
        return Arrays.toString(rangeArray);
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public double calcLength() {
        return to - from;
    }

    public Range getIntersection(Range range2) {
        if (Math.min(to, range2.to) < Math.max(from, range2.from)) {
            return null;
        } else {
            return new Range(Math.max(from, range2.from), Math.min(to, range2.to));
        }
    }

    public Range[] getAssociation(Range range2) {

        if (Math.min(to, range2.to) < Math.max(from, range2.from)) {
            return new Range[]{new Range(Math.min(from, range2.from), Math.min(to, range2.to)),
                    new Range(Math.max(from, range2.from), Math.max(to, range2.to))};
        } else {
            return new Range[]{new Range(Math.min(from, range2.from), Math.max(to, range2.to))};
        }
    }

    public Range[] getSubtraction(Range range2) {
        if ((to < range2.from)) {                                                                  // 3
            return new Range[]{new Range(from, to)};
        } else if ((from < range2.from) && (range2.to < to)) {                                     // 4
            return new Range[]{new Range(from, range2.from), new Range(range2.to, to)};
        } else if (from < range2.from) {                                                           // 1
            return new Range[]{new Range(from, range2.from)};
        } else if ((from - range2.from <= EPSILON) && (range2.to < to)) {                          // 2
            return new Range[]{new Range(range2.to, to)};
        } else {
            return null;
        }
    }

    public boolean isInside(double x) {
        return x >= from && x <= to;
    }

    public String toString() {
        return "(" + from + "," + to + ")";
    }
}






