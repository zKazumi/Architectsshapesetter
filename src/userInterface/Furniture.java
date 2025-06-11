package userInterface;

import labTasks.IFurniture;

import java.awt.*;

public abstract class Furniture implements IFurniture {

    public Color color;

    public int x = 20;
    public int y = 20;

    protected Furniture(Color color) {
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
        if (x >= 0) {
            this.x = x;
        } else {
            System.out.println("Üngültiger Wert für x");
        }
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        } else {
            System.out.println("Ungültiger Wert für y");
        }
    }

    // Exception

    protected void checkBounds(int panelWidth, int panelHeight) throws FurnitureOutOfBorderException {
        if (x < 0 || y < 0 || x > panelWidth || y > panelHeight) {
            throw new FurnitureOutOfBorderException(
                    this.getClass().getSimpleName() + "liegt außerhalb des sichtbaren Bereichs (x=" + x + ",y=" + y + ")"
            );
        }
    }
}
