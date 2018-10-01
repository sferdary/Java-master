package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_1 extends Applet {
    int tellerFor;
    int yFor = 0;

    public void init() {


    }

    public void paint(Graphics g) {

        for (tellerFor = 0; tellerFor < 10; tellerFor++) {
            yFor += 20;
            g.drawLine(50, yFor, 300, yFor);
        }
    }
}
