public class Parallelogram extends Shape {
    private int h;
    private int b;

    Parallelogram(int base, int height) {
        this.b = base;
        this.h = height;
        setTypeOfFigure("Parallelogram");
    }

    public int getPerimeter() {
        return 2 * (b + h);
    }

    public double getArea() {
        return b * h;
    }
}
