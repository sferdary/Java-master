package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        Color dark_blue = new Color(10, 30, 71);
        this.setBackground(dark_blue);
        g.setColor(Color.white);
        g.drawLine(10, 100, 100, 10);
        g.drawLine(100, 10, 210, 100);
        g.drawLine(10, 100, 210, 100);
    }
}
