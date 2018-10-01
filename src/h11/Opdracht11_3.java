package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int intOne = 1, intTwo = 0;
        int intTemp = 0;
        int y = 0;

        for (int i = 0; i < 10; i++) {
           g.drawString(intOne + intTwo + " ", 20, y);
           y += 20;
            intTemp = intOne;
            intOne = intTwo;
            intTwo = intTemp + intTwo;
        }
    }
}
