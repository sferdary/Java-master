package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_3 extends Applet {
    Label labelHeader;
    int intOne = 1, intTwo = 0;
    int intTemp = 0;
    int x = 10;

    public void init() {
        setSize(350, 50);
        labelHeader = new Label("Fibonacci:");
        add(labelHeader);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < 13; i++) {
            g.drawString(intOne + intTwo + " ", x, 40);
            x += 25;
            intTemp = intOne;
            intOne = intTwo;
            intTwo = intTemp + intTwo;
        }
    }
}
