package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_4 extends Applet {

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
        g.fillRect(51, 80, 50, 40);
        g.setColor(Color.green);
        g.fillRect(101, 20, 50, 100);
        g.setColor(Color.blue);
        g.fillRect(151, 40, 50, 80);
    }
}