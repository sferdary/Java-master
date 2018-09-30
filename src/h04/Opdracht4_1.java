package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_1 extends Applet {

    public void init() {
        setSize(110,90);
    }

    public void paint(Graphics g) {
        Color dark_blue = new Color(10, 30, 71);
        this.setBackground(dark_blue);
        g.setColor(Color.white);
        g.drawLine(10, 79, 50, 10);
        g.drawLine(50, 10, 90, 79);
        g.drawLine(10, 79, 90, 79);
    }
}
