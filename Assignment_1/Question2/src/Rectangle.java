public class Rectangle extends Shape {
    private int l;
    private int b;

    Rectangle(int length, int breadth) {
        this.l = length;
        this.b = breadth;
        setTypeOfFigure("Rectangle");
    }

    public double getArea() {
        return l * b;
    }

    public int getPerimeter() {
        return (2 * l) + (2 * b);
    }

}
