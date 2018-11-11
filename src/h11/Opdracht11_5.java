package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_5 extends Applet {

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        int intSize = 20, x = 20, y = 20;
        for (int i = 1; i < 6; i++) {
            g.drawRect(x, y, intSize, intSize);
            y += intSize;
            x += intSize;
        }
    }
}
