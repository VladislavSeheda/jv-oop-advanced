package core.basesyntax;

public class Circle extends Figure {
    int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, " +
                "area: " + getArea() +
                " radius: " + radius +
                " color: " + color);

    }
}
