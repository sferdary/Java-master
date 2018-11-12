package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_4 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        int xWeight = 10;
        g.drawString("100 kg", xWeight, 50);
        g.drawString("80 kg", xWeight, 70);
        g.drawString("60 kg", xWeight, 90);
        g.drawString("40 kg", xWeight, 110);
        g.drawString("20 kg", xWeight, 130);

        g.drawLine(50, 150, 200, 150); // x axis
        g.drawLine(50, 40, 50, 150); // y axis

        int weightValerie = 80;
        int weightJeroen = 100;
        int weightHans = 80;

        int yValerie = (150 - weightValerie);
        g.setColor(Color.black);
        int xNames = 55;
        int yNames = 175;
        g.drawString("Valerie", (xNames + 1), yNames);
        g.setColor(Color.red);
        g.fillRect(51, yValerie, 50, weightValerie);

        int yJeroen = (150 - weightJeroen);
        g.setColor(Color.black);
        g.drawString("Jeroen", ((xNames * 2) + 1), yNames);
        g.setColor(Color.green);
        g.fillRect(101, yJeroen, 50, weightJeroen);

        int yHans = (150 - weightHans);
        g.setColor(Color.black);
        g.drawString("Hans", ((xNames * 3) + 1), yNames);
        g.setColor(Color.blue);
        g.fillRect(151, yHans, 50, weightHans);
    }
}