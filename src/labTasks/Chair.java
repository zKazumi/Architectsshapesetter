package labTasks;

import java.awt.*;

public class Chair {
    public boolean isInverted = false;

    private Color color;

    public int x = 20;
    public int y = 20;


    // Konstruktor mit Farbe
    public Chair(Color color) {
        this.color = color;
    }


    // Getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    // Setter mit Validierung
    public void setX(int x) {
        if (x >= 0){
            this.x = x;
        }else{
            System.out.println("Üngültiger Wert für x");
        }
    }

    public void setY(int y) {
        if (y >= 0){
            this.y = y;
        } else{
            System.out.println("Ungültiger Wert für y");
        }
    }


    public void paintChair(Graphics2D graphic2d) {

        graphic2d.setColor(color);
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

        drawLeftLeg(graphic2d, x_set);
        drawSeat(graphic2d);
        drawRightLeg(graphic2d, x_end);
    }


    private void drawLeftLeg(Graphics2D graphic2d, int x_set) {
        graphic2d.drawLine(x_set + x, 20 + y, x_set + x, 80 + y);
    }

    private void drawRightLeg(Graphics2D graphic2d, int x_end) {
        graphic2d.drawLine(x_end + x, 50 + y, x_end + x, 80 + y);
    }

    private void drawSeat(Graphics2D graphic2d) {
        graphic2d.drawLine(20 + x, 50 + y, 50 + x, 50 + y);
    }
}