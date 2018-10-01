package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_2 extends Applet {
    int counter = 20;
    int y = 0;

    public void init() {
        setSize(100, 250);
    }

    public void paint(Graphics g) {
        while (counter > 9) {
            y += 20;
            g.drawString("" + counter, 10, y);
            counter--;
        }
    }
}
