public class Circle extends Shape {
    private int r;

    Circle(int radius) {
        this.r = radius;
        setTypeOfFigure("Circle");
    }

    public double getCircumference() {

        return (int) (2 * Math.PI * r);
    }

    public double getArea() {
        return Math.round(Math.PI * Math.pow(r, 2)) ;
    }
}
