package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_8 extends Applet {

    int x = 500;
    int y = 500;
    int w = 6;
    int h = 6;
    int intCoordinates = -3;
    int intSize = 6;

    public void init() {
        setSize(1025, 1000);
    }

    public void paint(Graphics g) {
        for (int i = 1; i < 151; i++) {
            g.drawOval(x, y, w, h);
            x += intCoordinates;
            y += intCoordinates;
            w += intSize;
            h += intSize;
        }
    }
}
