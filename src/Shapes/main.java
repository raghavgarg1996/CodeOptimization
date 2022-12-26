package Shapes;

public class main {

    public static void main (String[] args) {

        Square s = new Square(10.00);
        double squareArea = s.calculateArea();
        double squarePerimeter = s.calculatePerimeter();
        System.out.println("Square details :--");
        System.out.println("Area: " +squareArea);
        System.out.println("Perimeter: " +squarePerimeter);


        Rectangle r = new Rectangle(10.00,20.00);
        double rectangleArea = r.calculateArea();
        double rectanglePerimeter = r.calculatePerimeter();
        System.out.println("Rectangle details :--");
        System.out.println("Area: " +rectangleArea);
        System.out.println("Perimeter: " +rectanglePerimeter);
    }
}
