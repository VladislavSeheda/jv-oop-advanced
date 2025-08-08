package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5); // 0 - 4
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                int side = random.nextInt(MAX_SIZE) + 1;
                return new Square(side, color);
            case 1:
                int width = random.nextInt(MAX_SIZE) + 1;
                int height = random.nextInt(MAX_SIZE) + 1;
                return new Rectangle(width, height, color);
            case 2:
                int leg1 = random.nextInt(MAX_SIZE) + 1;
                int leg2 = random.nextInt(MAX_SIZE) + 1;
                return new RightTriangle(leg1, leg2, color);
            case 3:
                int radius = random.nextInt(MAX_SIZE) + 1;
                return new Circle(radius, color);
            case 4:
                int base1 = random.nextInt(MAX_SIZE) + 1;
                int base2 = random.nextInt(MAX_SIZE) + 1;
                int trapezoidHeight = random.nextInt(MAX_SIZE) + 1;
                return new IsoscelesTrapezoid(base1, base2, trapezoidHeight, color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
