package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht6_2 extends Applet {
    int TotaalBedrag, AantalPersonen, DeelBedrag;

    public void init() {
        setBackground(Color.white);
        TotaalBedrag = 113;
        AantalPersonen = 4;
        DeelBedrag = TotaalBedrag / AantalPersonen;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Geld verdeling:", 10, 30);
        g.drawString("€ " + TotaalBedrag, 100, 30);

        //Vertical lines
        g.drawLine(10, 45, 10, 125);
        g.drawLine(70, 45, 70, 125);
        g.drawLine(140, 45, 140, 125);

        //Horizontal lines
        g.drawLine(10, 45, 140, 45);
        g.drawLine(10, 65, 140, 65);
        g.drawLine(10, 85, 140, 85);
        g.drawLine(10, 105, 140, 105);
        g.drawLine(10, 125, 140, 125);

        g.drawString("Ali", 15, 60);
        g.drawString("€ " + DeelBedrag, 80, 60);

        g.drawString("Jan", 15, 80);
        g.drawString("€ " + DeelBedrag, 80, 80);

        g.drawString("Jeannette", 15, 100);
        g.drawString("€ " + DeelBedrag, 80, 100);

        g.drawString("Samuel", 15, 120);
        g.drawString("€ " + DeelBedrag, 80, 120);
    }
}