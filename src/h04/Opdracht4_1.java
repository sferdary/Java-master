package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_1 extends Applet {
    int xA = 40, yA = 109;
    int xB = 80, yB = 40;
    int xC = 120, yC = 109;

    public void init() {
        setSize(160, 150);
        Color dark_blue = new Color(10, 30, 71);
        setBackground(dark_blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawLine(xA, yA, xB, yB);
        g.drawLine(xB, yB, xC, yC);
        g.drawLine(xC, yC, xA, yA);

        g.drawString("a", 25, 124);
        g.drawString("b", 75, 30);
        g.drawString("c", 125, 124);
    }
}
