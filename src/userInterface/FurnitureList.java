package userInterface;

import java.util.ArrayList;

public class FurnitureList extends ArrayList<Furniture> {

    public void shiftAllElements(int direction_x, int direction_y) {
        for (Furniture f : this) {
            f.setX(f.getX() + direction_x);
            f.setY(f.getY() + direction_y);
        }


    }
}
