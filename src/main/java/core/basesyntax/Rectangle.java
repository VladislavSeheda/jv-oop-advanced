package core.basesyntax;

public class Rectangle implements Figure {
    private double width;
    private double height;
    private String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }


    @Override
    public double getArea() {
        double area = width * height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " sq. units, width: " + width + " units, height: " + height + " units, color: " + color);
    }
}
