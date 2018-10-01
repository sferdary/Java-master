package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_5 extends Applet {
    int intSize = 20;
    int x = 20, y = 20, w = intSize, h = intSize;



    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        for (int i = 1; i < 6; i++) {
            g.drawRect(x, y, w, h);
            y += intSize;
            x += intSize;
        }
    }
}
