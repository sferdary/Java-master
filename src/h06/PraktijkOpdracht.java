package h06;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {
    double CijferEen, CijferTwee,CijferDrie,AantalCijfers ,AnsEen, AnsTwee,Antwoord ;
    int  Gemiddelde;


    public void init() {
        setBackground(Color.white);
        CijferEen = 5.9;
        CijferTwee = 6.3;
        CijferDrie = 6.9;
        AantalCijfers = 3 ;

        AnsEen = ((CijferEen + CijferTwee + CijferDrie) / AantalCijfers) * 10;
        Gemiddelde = (int) AnsEen ;
        AnsTwee = (int) Gemiddelde;
        Antwoord = AnsTwee / 10;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Gemiddelde van 3 cijfers:", 10, 30 );

        g.drawString("Cijfer 1:", 15, 60 );
        g.drawString(CijferEen + "", 90, 60 );

        g.drawString("Cijfer 2:", 15, 80 );
        g.drawString(CijferTwee + "", 90, 80 );

        g.drawString("Cijfer 3:", 15, 100 );
        g.drawString(CijferDrie + "", 90, 100 );

        //Horizontal lines
        g.drawLine(10,105,115,105);

        g.drawString("Gemiddeld:", 15, 120 );
        g.drawString(Antwoord + "", 90, 120 );
    }
}