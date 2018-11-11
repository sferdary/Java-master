package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_7 extends Applet {

    public void init() {
        setSize(600, 600);
    }

    public void paint(Graphics g) {
        int x = 300, y = 300, w = 10, h = 10, intCoordinates = -5, intSize = 10;

        for (int i = 1; i < 51; i++) {
            g.drawOval(x, y, w, h);
            x += intCoordinates;
            y += intCoordinates;
            w += intSize;
            h += intSize;
        }
    }
}