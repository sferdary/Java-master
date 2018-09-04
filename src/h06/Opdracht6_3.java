package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht6_3 extends Applet {
    int GetalEen, GetalTwee, Antwoord;

    public void init() {
        setBackground(Color.white);
        GetalEen = 2147483647;
        GetalTwee = 2147483647;
        Antwoord = GetalEen + GetalTwee;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Negatieve optelsom:", 10, 30 );

        g.drawString("Getal 1:", 15, 60 );
        g.drawString(GetalEen + "", 80, 60 );

        g.drawString("Getal 2:", 15, 80 );
        g.drawString(GetalTwee + "", 80, 80 );

        //Horizontal lines
        g.drawLine(10,85,175,85);
        g.drawString("+", 170, 80 );

        g.drawString("Totaal:", 15, 100 );
        g.drawString(Antwoord + "", 80, 100 );
    }
}