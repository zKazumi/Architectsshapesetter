package labTasks;

import java.awt.*;

public class Desk {
    private Color color;

    public int x = 20;
    public int y = 20;

    // Konstruktor mit Farbe
    public Desk(Color color) {
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


    public void paintDesk(Graphics2D graphic2d) {

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



