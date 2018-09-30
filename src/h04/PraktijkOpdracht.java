package h04;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    public void init() {
        setSize(650, 300);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.fillRect(220,55,200,100);
        g.fillOval(220, 185,200,100);
        g.fillArc(430,55,200,100,0,45);

        g.setColor(Color.black);
        g.drawLine(10,20,210,20);
        g.drawRect(10,55,200,100);
        g.drawRoundRect(10,185,200,100,30,30);
        g.drawOval(220,55,200,100);
        g.drawOval(430,55,200,100);
        g.drawOval(485,185,100,100);

        g.drawString("Lijn", 100, 35 );
        g.drawString("Rechthoek", 80, 170 );
        g.drawString("Afgeronde rechthoek", 50, 300 );
        g.drawString("Gevulde rechthoek met ovaal", 240, 170 );
        g.drawString("Gevulde ovaal", 275, 300 );
        g.drawString("Taartpunt met ovaal eromheen", 450, 170 );
        g.drawString("Cirkel", 520, 300 );
    }
}