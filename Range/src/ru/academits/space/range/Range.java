package ru.academits.space.range;


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

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
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


    public boolean isInside(double x) {
        return x >= from && x <= to;
    }
}
