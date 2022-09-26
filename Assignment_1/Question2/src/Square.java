public class Square extends Shape {
    private int s;


    Square(int length) {
        this.s = length;
        setTypeOfFigure("Square");
    }

    public int getPerimeter() {
        return 4 * s;
    }

    public double getArea() {
        return s * s;
    }
}
