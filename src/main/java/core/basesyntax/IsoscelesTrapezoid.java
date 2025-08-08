package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private double base1;
    private double base2;
    private String color;
    private double height;

    public IsoscelesTrapezoid(double base1, double base2, int trapezoidHeight, String color) {
        this.base1 = base1;
        this.base2 = base2;
        this.color = color;
        this.height = height;

    }

    @Override
    public double getArea() {
        double area = ((base1 + base2) / 2) * height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + getArea()
                + " sq. units, base1: "
                + base1
                + " units, base2: "
                + base2
                + " units, height: "
                + height + " units, color: "
                + color);
    }
}
