package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht6_2 extends Applet {
    int Seconde, Uur, Dag, Jaar;

    public void init() {
        setBackground(Color.white);
        Seconde = 1;
        Uur = Seconde * 3600;
        Dag = Uur * 24;
        Jaar = Dag *365;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Tijdseenheden in seconden :", 10, 30);

        //Vertical lines
        g.drawLine(10, 45, 10, 105);
        g.drawLine(70, 45, 70, 105);
        g.drawLine(210, 45, 210, 105);

        //Horizontal lines
        g.drawLine(10, 45, 210, 45);
        g.drawLine(10, 65, 210, 65);
        g.drawLine(10, 85, 210, 85);
        g.drawLine(10, 105, 210, 105);

        g.drawString("Uur", 15, 60);
        g.drawString(Uur + "", 80, 60);
        g.drawString("seconden", 150, 60);

        g.drawString("Dag", 15, 80);
        g.drawString(Dag + "", 80, 80);
        g.drawString("seconden", 150, 80);

        g.drawString("Jaar", 15, 100);
        g.drawString(Jaar + "", 80, 100);
        g.drawString("seconden", 150, 100);

    }
}