package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_1  extends Applet
{
    Label labelTekstvak;
    TextField tekstvak;
    String sGetal, sPrintTekst;
    int Getal1, Getal2, hoogsteGetal;

    public void init()
    {
        setSize(350, 400);

        labelTekstvak = new Label("Voer getal in en druk op enter");
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new TekstVakListener());

        add(labelTekstvak);
        add(tekstvak);
    }

    class TekstVakListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            sGetal = tekstvak.getText();
            Getal1 = Integer.parseInt(sGetal);
            Getal2 = hoogsteGetal;
            if (Getal1 >= Getal2)
            {
                hoogsteGetal = Getal1;
            }
            else
                {
                    Getal2 = hoogsteGetal;
                }
            repaint();
        }
    }
    public void paint(Graphics g)
    {
        g.drawString( "hoogste getal: " + hoogsteGetal, 10, 50);
    }
}