package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht5_2 extends Applet {
    private int weightValerie = 40, weightJeroen = 100, weightHans = 80;
    private int barValerie = 120 - weightValerie;
    private int barJeroen = 120 - weightJeroen;
    private int barHans = 120 - weightHans;

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(50, 20, 50, 120);
        g.drawLine(50, 120, 200, 120);
        g.drawString("100 kg", 10, 30);
        g.drawString("80 kg", 10, 50);
        g.drawString("60 kg", 10, 70);
        g.drawString("40 kg", 10, 90);
        g.drawString("20 kg", 10, 110);
        g.drawString("Valerie", 51, 135);
        g.drawString("Jeroen", 101, 135);
        g.drawString("Hans", 151, 135);

        g.setColor(Color.red);
        g.fillRect(51, barValerie, 50, weightValerie);
        g.setColor(Color.green);
        g.fillRect(101, barJeroen, 50, weightJeroen);
        g.setColor(Color.blue);
        g.fillRect(151, barHans, 50, weightHans);
    }
}