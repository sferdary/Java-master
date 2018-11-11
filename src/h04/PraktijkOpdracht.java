package h04;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    public void init() {
        setSize(650, 300);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(10, 20, 210, 20);
        g.drawString("Line", 100, 35);


        g.setColor(Color.black);
        g.drawRect(10, 55, 200, 100);
        g.drawString("Rectangle", 80, 170);

        g.setColor(Color.black);
        g.drawRoundRect(10, 185, 200, 100, 30, 30);
        g.drawString("Round Rectangle", 65, 300);

        g.setColor(Color.MAGENTA);
        g.fillRect(220, 55, 200, 100);
        g.setColor(Color.black);
        g.drawOval(220, 55, 200, 100);
        g.drawString("Oval within a filled rectangle", 250, 170);

        g.setColor(Color.MAGENTA);
        g.fillOval(220, 185, 200, 100);
        g.setColor(Color.black);
        g.drawString("Filled oval", 290, 300);

        g.setColor(Color.MAGENTA);
        g.fillArc(430, 55, 200, 100, 0, 45);
        g.setColor(Color.black);

        g.drawOval(430, 55, 200, 100);
        g.drawString("Oval with a pizza slice", 475, 170);

        g.setColor(Color.black);
        g.drawOval(485, 185, 100, 100);
        g.drawString("Cirkel", 520, 300);
    }
}