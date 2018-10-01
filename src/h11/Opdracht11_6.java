package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_6 extends Applet {
    int x = 300;
    int y = 300;
    int w = 10;
    int h = 10;
    int intCoordinates = -5;
    int intSize = 10;

    public void init() {
        setSize(600, 600);
    }

    public void paint(Graphics g) {
        for (int i = 1; i < 6; i++) {
            g.drawOval(x, y, w, h);
            x += intCoordinates;
            y += intCoordinates;
            w += intSize;
            h += intSize;
        }
    }
}

