package h04;

import java.awt.*;
import java.applet.*;

public class Opdrachten4_2en3 extends Applet {

    public void init() {
        Color dark_blue = new Color(10, 30, 71);
        this.setBackground(dark_blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawLine(10, 100, 100, 10);
        g.drawLine(100, 10, 200, 100);
        g.drawLine(10, 100, 200, 100);
        g.drawOval(90, 50, 25, 25);
        g.drawRect(35, 100, 135, 100);
        g.drawRect(65, 150, 25, 50);
        g.drawRect(110, 150, 50, 25);
        g.setColor(Color.red);
        g.fillRect(225, 100, 50, 10);
        g.setColor(Color.white);
        g.fillRect(225, 110, 50, 10);
        g.setColor(Color.blue);
        g.fillRect(225, 120, 50, 10);
        g.setColor(Color.gray);
        g.fillRect(220, 100, 5, 100);
    }
}
