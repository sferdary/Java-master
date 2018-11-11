package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_9 extends Applet {

    public void init() {
        setSize(500, 500);
        setBackground(Color.gray);
    }

    public void paint(Graphics g) {
        int x = 50, y = 50, width = 50, height = 50;

        for (int row = 0; row < 4; row++) {
            for (int colom = 0; colom < 8; colom++) {

                if (colom == 0 || colom == 2 || colom == 4 || colom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, width, height);
                }
                x += width;
            }
            x = 50;
            y += height;
            for (int colom = 0; colom < 8; colom++) {
                if (colom == 0 || colom == 2 || colom == 4 || colom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, width, height);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);
                }
                x += width;
            }
            y += height;
            x = width;
        }
    }
}