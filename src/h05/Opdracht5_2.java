package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht5_2 extends Applet {
    int GewichtValerie = 40;
    int GewichtJeroen = 100;
    int GewichtHans = 80;

    int StaafValerie = 120 - GewichtValerie;
    int StaafJeroen = 120 - GewichtJeroen;
    int StaafHans = 120 - GewichtHans;

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(50,20,50,120);
        g.drawLine(50,120,200,120);
        g.drawString("100 kg", 10, 30 );
        g.drawString("80 kg", 10, 50 );
        g.drawString("60 kg", 10, 70 );
        g.drawString("40 kg", 10, 90 );
        g.drawString("20 kg", 10, 110 );
        g.drawString("Valerie", 51, 135 );
        g.drawString("Jeroen", 101, 135 );
        g.drawString("Hans", 151, 135);

        g.setColor(Color.red);
        g.fillRect(51, StaafValerie, 50, GewichtValerie);
        g.setColor(Color.green);
        g.fillRect(101, StaafJeroen, 50, GewichtJeroen);
        g.setColor(Color.blue);
        g.fillRect(151, StaafHans, 50, GewichtHans);
    }
}