package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int tellerFor, yFor = 0;

        for (tellerFor = 0; tellerFor < 10; tellerFor++) {
            yFor += 20;
            g.drawLine(50, yFor, 300, yFor);
        }
    }
}
