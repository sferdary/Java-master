package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht_13 extends Applet {

    public void init() {
        setSize(725, 225);
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        Color grass = new Color(11, 120, 0);
        g.setColor(grass);
        g.fillRect(0,80,725,145);
        tree(g);
    }

    private void tree(Graphics g) {
        Color colorBrown = new Color(120, 66, 19);

        for (int xA1 = 50; xA1 < 750; xA1 += 150) {
            for (int yA1 = 50; yA1 < 100; yA1 += 50) {

                g.setColor(colorBrown);
                g.fillRect(xA1, yA1, 20, 60);
            }
        }
        for (int xA2 = 40; xA2 < 750; xA2 += 150) {
            for (int yA2 = 35; yA2 < 100; yA2 += 80) {
                g.setColor(Color.green);
                g.fillOval(xA2, yA2, 40, 40);
            }
        }

        for (int xB1 = 50; xB1 < 750; xB1 += 150) {
            for (int yB1 = 150; yB1 < 200; yB1 += 50) {

                g.setColor(colorBrown);
                g.fillRect(xB1, yB1, 20, 60);
            }
        }

        for (int xB2 = 40; xB2 < 750; xB2 += 150) {
            for (int yB2 = 135; yB2 < 200; yB2 += 80) {
                g.setColor(Color.green);
                g.fillOval(xB2, yB2, 40, 40);
            }
        }
    }
}
