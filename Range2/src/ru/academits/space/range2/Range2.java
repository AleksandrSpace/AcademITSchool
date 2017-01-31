package ru.academits.space.range2;

import ru.academits.space.range2.MainRange2;

public class Range2 {
    private double from;
    private double to;

    public Range2(double from, double to) {
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

    public double  getIntervalIntersection {
        if (range.to == )


    }

    

    public boolean isInside(double x) {
        return x >= from && x <= to;
    }
}

