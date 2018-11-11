package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht5_1 extends Applet {


    int breedte = 200;
    int hoogte = 100;

    public void init() {
        setSize(500,400);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.fillRect(220, 55, breedte, hoogte);
        g.fillOval(220, 185, breedte, hoogte);
        g.fillArc(430, 55, breedte, hoogte, 0, 45);

        g.setColor(Color.black);
        g.drawLine(10, 20, 210, 20);
        g.drawRect(10, 55, breedte, hoogte);
        g.drawRoundRect(10, 185, breedte, hoogte, 30, 30);
        g.drawOval(220, 55, breedte, hoogte);
        g.drawOval(430, 55, breedte, hoogte);
        g.drawOval(485, 185, hoogte, hoogte);

        g.drawString("Lijn", 100, 35);
        g.drawString("Rechthoek", 80, 170);
        g.drawString("Afgeronde rechthoek", 50, 300);
        g.drawString("Gevulde rechthoek met ovaal", 240, 170);
        g.drawString("Gevulde ovaal", 275, 300);
        g.drawString("Taartpunt met ovaal eromheen", 450, 170);
        g.drawString("Cirkel", 520, 300);
    }
}