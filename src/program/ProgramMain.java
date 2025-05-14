package program;

import userInterface.PaintPanel;

import javax.swing.*;

public class ProgramMain {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Architects Shape Setter");
        PaintPanel paintPanel = new PaintPanel();

        frame.add(paintPanel);
        frame.setSize(550, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
