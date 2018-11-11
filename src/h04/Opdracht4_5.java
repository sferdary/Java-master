package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_5 extends Applet {

    public void init() {
        setSize(225, 125);
        Color dark_blue = new Color(10, 30, 71);
        this.setBackground(dark_blue);
    }

    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        g.fillArc(10, 10, 200, 100, 0, 90);
        g.fillArc(10, 10, 200, 100, 90, 90);
        g.fillArc(10, 10, 200, 100, 180, 90);
        g.fillArc(10, 10, 200, 100, 270, 90);
    }
}
