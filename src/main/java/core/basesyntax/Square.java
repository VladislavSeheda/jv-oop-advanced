package core.basesyntax;

public class Square extends Figure2 implements Figure {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        double area = side * side;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + getArea()
                + " sq. units, side: "
                + side
                + " units, color: "
                + color);
    }
}
