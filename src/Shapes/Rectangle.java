package Shapes;

public class Rectangle implements Shapes {

    private final Double length;
    private final Double breadth;

    public Rectangle(Double length, Double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public Double calculateArea() {
        return length * breadth;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
