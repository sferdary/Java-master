package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht5_1 extends Applet {

    public void init() {
        setSize(650,300);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.MAGENTA);
        int width = 200;
        int height = 100;
        g.fillRect(220, 55, width, height);
        g.fillOval(220, 185, width, height);
        g.fillArc(430, 55, width, height, 0, 45);

        g.setColor(Color.black);
        g.drawLine(10, 20, 210, 20);
        g.drawRect(10, 55, width, height);
        g.drawRoundRect(10, 185, width, height, 30, 30);
        g.drawOval(220, 55, width, height);
        g.drawOval(430, 55, width, height);
        g.drawOval(485, 185, 100, 100);

        g.drawString("Line", 100, 35);
        g.drawString("Rectangle", 80, 170);
        g.drawString("Rounded rectangle", 50, 300);
        g.drawString("Filled rectangle with oval", 240, 170);
        g.drawString("Filled oval", 275, 300);
        g.drawString("Piece of pie within a oval", 450, 170);
        g.drawString("Circle", 520, 300);
    }
}