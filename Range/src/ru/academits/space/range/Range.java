package ru.academits.space.range;

/**
 * Created by Александр on 24.01.2017.
 */
public class Range {

    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
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

    public boolean isInside(double x) {
        return x >= from && x <= to;
    }
}
