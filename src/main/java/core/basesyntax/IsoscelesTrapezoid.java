package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    double base1;
    double base2;
    double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        this.color = color;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }


    @Override
    public double getArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + getArea() + " base1: " + base1
                + " base2: " + base2
                + " height: " + height
                + " color: " + color);

    }
}
