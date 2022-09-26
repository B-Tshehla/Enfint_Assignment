import java.util.ArrayList;

public class Main {
    public static ArrayList<Shape> arrShape = new ArrayList<>();


    //Method create objects of type shape and adds them to an array
    public static void createObjects(){
        arrShape.add(new Point());
        arrShape.add(new Line(18));
        arrShape.add(new Circle(10));
        arrShape.add(new Triangle(6,7));
        arrShape.add(new Square(5));
        arrShape.add(new Rectangle(10,20));
        arrShape.add(new Parallelogram(15, 10));


    }
    public static void main(String[] args) {

        createObjects();


        for (Shape shape : arrShape) {
            System.out.println("The shape is a: " + shape.getTypeOfFigure());
            if (shape.getTypeOfFigure().equals("Circle")) {
                System.out.println("The circumference of the shape is: " + shape.getCircumference());
                System.out.println("The area of the shape is: " + shape.getArea()+"\n");
            } else {
                if (shape.getTypeOfFigure().equals("Point")) {
                    System.out.println("The length of the shape is: " + shape.getLength());
                    System.out.println("The area of the shape is: " + shape.getArea()+"\n");
                } else {
                    System.out.println("The Perimeter of the shape is: " + shape.getPerimeter());
                    System.out.println("The area of the shape is: " + shape.getArea()+"\n");
                }
            }


        }
    }
}

class Shape{
   private String typeOfFigure;

    public String getTypeOfFigure() {
        return typeOfFigure;
    }

    public void setTypeOfFigure(String typeOfFigure) {
        this.typeOfFigure = typeOfFigure;
    }
    public double getCircumference(){
        return 0.0;
    }
    public int getLength(){
        return 0;
    }
    public double getArea(){
        return 0.0;
    }
    public int getPerimeter(){
        return 0;
    }

}

