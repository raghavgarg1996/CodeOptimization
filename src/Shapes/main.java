package Shapes;

public class main {

    public static void main (String[] args) {

        Square s = new Square(10.00);
        double area = s.calculateArea();
        double perimeter = s.calculatePerimeter();
        System.out.println("Area: " +area);
        System.out.println("Perimeter: " +perimeter);

    }
}
