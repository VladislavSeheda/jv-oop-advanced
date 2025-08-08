package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 5; i++) {
            Figure figure = figureSupplier.getRandomFigure();
            figure.draw();
        }
    }
}
