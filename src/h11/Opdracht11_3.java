package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_3 extends Applet {

    public void init() {
        setSize(350, 100);
        setLayout(null);
        Label labelHeader= new Label("Fibonacci:");
        labelHeader.setBounds(150, 10, 75, 25);
        add(labelHeader);
    }

    public void paint(Graphics g) {
        int intOne = 1, intTwo = 0, intTemp, x = 10;
        for (int i = 0; i < 13; i++) {
            g.drawString(intOne + intTwo + " ", x, 60);
            x += 25;
            intTemp = intOne;
            intOne = intTwo;
            intTwo = intTemp + intTwo;
        }
    }
}
