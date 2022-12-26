package Shapes;

public class Square implements Shapes {

    private final Rectangle rectangle;

    public Square(Double length) {
        this.rectangle = new Rectangle(length, length);
    }


    @Override
    public Double calculateArea() {
        return rectangle.calculateArea();
    }

    @Override
    public Double calculatePerimeter() {
        return rectangle.calculatePerimeter();
    }
}
