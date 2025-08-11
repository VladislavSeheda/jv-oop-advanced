package core.basesyntax;

public class Square extends Figure {

    double side;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }


    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square," +
                " area " + getArea() +
                " side: " + side
                + " color: " + color);

    }
}
