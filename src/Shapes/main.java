package Shapes;

public class main {

    public static void main(String[] args) {

        square(10.00);
        rectangle(10.00,20.00);
    }

    public static void square(double side) {
        Square s = new Square(side);
        double squareArea = s.calculateArea();
        double squarePerimeter = s.calculatePerimeter();
        System.out.println("Square details :--");
        System.out.println("Area: " + squareArea);
        System.out.println("Perimeter: " + squarePerimeter);
    }

    public static void rectangle(double length, double breadth) {
        Rectangle r = new Rectangle(length, breadth);
        double rectangleArea = r.calculateArea();
        double rectanglePerimeter = r.calculatePerimeter();
        System.out.println("Rectangle details :--");
        System.out.println("Area: " + rectangleArea);
        System.out.println("Perimeter: " + rectanglePerimeter);
    }
}
