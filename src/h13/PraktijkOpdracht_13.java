package h13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht_13 extends Applet {
    private Color colorBrown = new Color(120, 66, 19);
    private Color grass = new Color(11, 120, 0);

    public void init() {
        setSize(725, 225);
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(grass);
        g.fillRect(0, 80, 725, 145);
        tree(g);
    }

    private void tree(Graphics g) {
        int xA1 = 50;
        while (xA1 < 750) {
            for (int yA1 = 50; yA1 < 100; yA1 += 50) {
                g.setColor(colorBrown);
                g.fillRect(xA1, yA1, 20, 60);
            }
            xA1 += 150;
        }
        int xA2 = 40;
        while (xA2 < 750) {
            for (int yA2 = 35; yA2 < 100; yA2 += 80) {
                g.setColor(Color.green);
                g.fillOval(xA2, yA2, 40, 40);
            }
            xA2 += 150;
        }

        int xB1 = 50;
        while (xB1 < 750) {
            for (int yB1 = 150; yB1 < 200; yB1 += 50) {
                g.setColor(colorBrown);
                g.fillRect(xB1, yB1, 20, 60);
            }
            xB1 += 150;
        }

        int xB2 = 40;
        while (xB2 < 750) {
            for (int yB2 = 135; yB2 < 200; yB2 += 80) {
                g.setColor(Color.green);
                g.fillOval(xB2, yB2, 40, 40);
            }
            xB2 += 150;
        }
    }
}