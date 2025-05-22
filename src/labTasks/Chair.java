package labTasks;

import userInterface.Furniture;

import java.awt.*;

public class Chair extends Furniture implements IFurniture {
    public boolean isInverted = false;

    // Konstruktor mit Farbe
    public Chair(Color color) {
        super(color);
    }


    @Override
    public void paint(Graphics2D graphic2d) {

        graphic2d.setColor(color); //Boilerplate: Die Zeile ist in Chair und Desk identisch
        graphic2d.scale(2, 2);
        graphic2d.setStroke(new BasicStroke(5));

        int x_set = 20;
        int x_end = 50;
        int memory;

        if (isInverted) {
            memory = x_set;
            x_set = x_end;
            x_end = memory;
        }

        drawSeat(graphic2d);
        drawChairLegs(graphic2d, x_set, x_end);
    }


    private void drawChairLegs(Graphics2D graphic2d, int x_set, int x_end) {
        graphic2d.drawLine(x_set + x, 20 + y, x_set + x, 80 + y);
        graphic2d.drawLine(x_end + x, 50 + y, x_end + x, 80 + y);
    }

    private void drawSeat(Graphics2D graphic2d) {
        graphic2d.drawLine(20 + x, 50 + y, 50 + x, 50 + y);
    }
}