public class Square extends Shapes {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getWidth() {
        return length;
    }

    public double getHeight() {
        return length;
    }


    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return 4 * length;
    }

}
