package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_6 extends Applet {

    public void init() {
        Color dark_blue = new Color(10, 30, 71);
        this.setBackground(dark_blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillArc(10, 10, 100, 100, 0, 180);
        g.fillRect(11, 60, 99, 110);
        g.fillArc(10, 120, 100, 100, 180, 180);
        g.drawLine(11,60,11,180);
        g.drawLine(109,60,109,180);

        g.setColor(Color.red);
        g.fillOval(45, 65, 30, 30);
        g.setColor(Color.orange);
        g.fillOval(45, 100, 30, 30);
        g.setColor(Color.green);
        g.fillOval(45, 135, 30, 30);

        g.setColor(Color.white);
        g.drawArc(10, 10, 100, 100, 0, 180);
        g.drawArc(10, 120, 100, 100, 180, 180);
        g.drawRect(11, 60, 99, 110);
        g.drawOval(45, 65, 30, 30);
        g.drawOval(45, 100, 30, 30);
        g.drawOval(45, 135, 30, 30);

        g.setColor(Color.gray);
        g.fillRect(55,220,10,150);
    }
}