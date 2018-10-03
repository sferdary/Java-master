package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_8 extends Applet {

    public void init() {
        setSize(1025, 1000);
    }

    public void paint(Graphics g) {
        int x = 500, y = 500, w = 6, h = 6, intCoordinates = -3, intSize = 6;

        for (int i = 1; i < 151; i++) {
            g.drawOval(x, y, w, h);
            x += intCoordinates;
            y += intCoordinates;
            w += intSize;
            h += intSize;
        }
    }
}
