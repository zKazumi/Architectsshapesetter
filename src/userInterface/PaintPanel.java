package userInterface;

import labTasks.Chair;
import labTasks.Desk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.util.Random;

public class PaintPanel extends JPanel {
    @Serial
    private static final long serialVersionUID = 1L;

    private final FurnitureList myFurniture = new FurnitureList();

    public PaintPanel() {
        Random random = new Random();

        setLayout(new BorderLayout());

        JButton button = new JButton("Shift");
        add (button, BorderLayout.EAST);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myFurniture.shiftAllElements(5, 5);

                for (Furniture furniture : myFurniture) {
                    try {
                        furniture.checkBounds(getWidth(), getHeight());
                    } catch (FurnitureOutOfBorderException ex) {
                        System.out.println("Fehler: " + ex.getMessage());
                    }
                }

                repaint();
            }
        });

        // Möbel ( Chair und Desk ) werden erzeugt und zur Liste hinzugefügt
        for (int i = 0; i < 1; i++) {
            Chair chair = new Chair(Color.LIGHT_GRAY);
            chair.setX(random.nextInt(100));
            chair.setY(random.nextInt(100));
            myFurniture.add(chair);
        }
        // Boilerplate: Erzeugung + Zufallsplatzierung - identsich in beiden Fällen


        for (int i = 0; i < 1; i++) {
            Desk desk = new Desk(Color.BLACK);
            desk.setX(random.nextInt(100));
            desk.setY(random.nextInt(100));
            myFurniture.add(desk);

        // Boilerplate: Erzeugung + Zufallsplatzierung - identsich in beiden Fällen
        }
    }


    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphic2d =  (Graphics2D) g;

        // Möbel ( Chair und Desk ) werden gezeichnet
        for (Furniture furniture : myFurniture) {
            furniture.paint(graphic2d);
        }
    }
}