package userInterface;

import labTasks.Chair;
import labTasks.Desk;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;
import java.util.Random;

public class PaintPanel extends JPanel {
    @Serial
    private static final long serialVersionUID = 1L;

    private final FurnitureList myFurniture = new FurnitureList();

    public PaintPanel() {
        Random random = new Random();

        // Möbel ( Chair und Desk ) werden erzeugt und zur Liste hinzugefügt
        for (int i = 0; i < 1; i++) {
            Chair chair = new Chair(Color.LIGHT_GRAY);
            chair.setX(random.nextInt(100));
            chair.setY(random.nextInt(100));
            myFurniture.add(chair);
        }

        for (int i = 0; i < 1; i++) {
            Desk desk = new Desk(Color.BLACK);
            desk.setX(random.nextInt(100));
            desk.setY(random.nextInt(100));
            myFurniture.add(desk);
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphic2d =  (Graphics2D) g;

        // Möbel ( Chair und Desk ) werden gezeichnet
        for (Furniture furniture : myFurniture) {
            furniture.paint(graphic2d);
            myFurniture.shiftAllElements(2, 2);
        }
    }
}