public class Line extends Shape {
    private int length;

    Line(int length) {
        this.length = length;
        setTypeOfFigure("Line");
    }

    public int getLength() {
        return length;
    }

    public double getArea() {
        return 0.0;
    }
}
