package core.basesyntax;

public class RightTriangle extends Figure2 implements Figure {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        double area = (firstLeg * secondLeg) / 2;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: "
                + getArea()
                + " sq. units, firstLeg: " + firstLeg
                + " units, secondLeg: "
                + secondLeg + " units, color: "
                + color);
    }
}
