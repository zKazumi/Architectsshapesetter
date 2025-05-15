package labTasks;

import userInterface.Furniture;

import java.awt.*;

public class Desk extends Furniture implements IFurniture {

    // Konstruktor mit Farbe
    public Desk(Color color) {
        super(color);
    }


    @Override
    public void paint(Graphics2D graphic2d) {

        graphic2d.setColor(color);
        graphic2d.translate(50, 0);


        drawTopLine(graphic2d);
        drawDeskLegs(graphic2d);
    }


    private void drawTopLine(Graphics2D graphic2d) {
        graphic2d.drawLine(10 + x, 30 + y, 80 + x, 30 + y);
    }

    private void drawDeskLegs(Graphics2D graphic2d) {
        graphic2d.drawLine(20 + x, 80 + y, 20 + x, 30 + y);
        graphic2d.drawLine( 70 + x, 80 + y, 70 + x, 30 + y);
    }
}



