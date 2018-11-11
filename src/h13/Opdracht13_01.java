package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht13_01 extends Applet {

    public void init() {
    setSize(175,150);
    }

    private void drawTriangle(Graphics g, int xA, int yA, int xB, int yB, int xC, int yC) {
        int[] x = {xA, xB, xC};
        int[] y = {yA, yB, yC};
        g.drawPolygon(x, y, 3);
    }

    public void paint(Graphics g) {
        int x1 = 40, y1 = 109;
        int x2 = 80, y2 = 40;
        int x3 = 120, y3 = 109;
        drawTriangle(g, x1, y1, x2, y2, x3, y3);
    }
}
