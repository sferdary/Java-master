package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht6_1 extends Applet {
    private  int intTotal;
    private int intPart;

    public void init() {
        setBackground(Color.white);
        intTotal = 113;
        int intPersons = 4;
        intPart = intTotal / intPersons;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Share money equally:", 10, 20);
        g.drawString("Total amount: € " + intTotal, 10, 35);

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
        g.drawString("€ " + intPart, 80, 60);

        g.drawString("Jan", 15, 80);
        g.drawString("€ " + intPart, 80, 80);

        g.drawString("Jeannette", 15, 100);
        g.drawString("€ " + intPart, 80, 100);

        g.drawString("Samuel", 15, 120);
        g.drawString("€ " + intPart, 80, 120);
    }
}