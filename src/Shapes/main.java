package Shapes;

public class main {

    public static void main(String[] args) {

        square(10.00);
        rectangle(10.00,20.00);
    }

    public static void square(double side) {
        Square squa = new Square(side);
        double squareArea = squa.calculateArea();
        double squarePerimeter = squa.calculatePerimeter();
        System.out.println("Square details :--");
        System.out.println("Area: " + squareArea);
        System.out.println("Perimeter: " + squarePerimeter);
    }

    public static void rectangle(double length, double breadth) {
        Rectangle rect = new Rectangle(length, breadth);
        double rectangleArea = rect.calculateArea();
        double rectanglePerimeter = rect.calculatePerimeter();
        System.out.println("Rectangle details :--");
        System.out.println("Area: " + rectangleArea);
        System.out.println("Perimeter: " + rectanglePerimeter);
    }
}
