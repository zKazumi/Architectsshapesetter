package userInterface;

import labTasks.Chair;
import labTasks.Desk;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class PaintPanel extends JPanel {

    @Serial
    private static final long serialVersionUID = 1L;

    private final List<Chair> chair = new ArrayList<>();
    private final List<Desk> desk = new ArrayList<>();

    public PaintPanel() {
        Random random = new Random();


        //Chair und Desk erzeugen ( Objekte )
        for (int i = 0; i < 1; i++) {
            chair.add(new Chair(Color.LIGHT_GRAY));
        }

        for (int i = 0; i < 1; i++) {
            desk.add(new Desk(Color.BLACK));
        }

        //Felder setzen
        for (Chair chair : chair) {
            chair.setX(random.nextInt(100));
            chair.setY(random.nextInt(100));
        }

        for(Desk desk : desk) {
            desk.setX(random.nextInt(100));
            desk.setY(random.nextInt(100));
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphic2d =  (Graphics2D) g;


        // Desk und Chair zeichnen
        for (Chair chair : chair) {
            chair.paintChair(graphic2d);
        }

        for (Desk desk : desk) {
            desk.paintDesk(graphic2d);
        }
    }
}