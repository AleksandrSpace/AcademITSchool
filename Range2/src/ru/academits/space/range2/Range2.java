package ru.academits.space.range2;

public class Range2 {
    private static final double EPSILON = 1.0e-10;
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

    public Range2 getIntersection(Range2 range2) {
        if (Math.min(to, range2.to) < Math.max(from, range2.from)) {
            return null;
        } else {
            return new Range2(Math.max(from, range2.from), Math.min(to, range2.to));
        }
    }

    public double getAddition(Range2 range2) {
        return calcLength() + range2.calcLength();
    }
}
/*
    public double getSubtraction(Range2 range2) {
        if (calcLength() - range2.calcLength() == EPSILON) {
            return null;
        } else {
            return Math.abs(calcLength() - range2.calcLength());
        }
    }
}

/*

    public boolean isInside(double x) {
        return x >= from && x <= to;
    }
}

*/
