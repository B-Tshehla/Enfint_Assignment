public class Triangle extends Shape {
    private int b;
    private int h;

    Triangle(int base, int height) {
        this.b = base;
        this.h = height;
        setTypeOfFigure("Triangle");
    }

    public int getPerimeter() {
        return b * 3;
    }

    public double getArea() {
        return (double) (b / 2) * h;
    }
}
