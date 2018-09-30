package h10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Opdracht10_4 extends Applet {
    Label labelMaand, labelJaar;
    TextField tekstvakMaand, tekstvakJaar;
    Button knopOk;
    String sMaand, sJaar, sSchrikkel;
    int iMaand, iJaar;

    public void init() {
        setSize(300, 150);
        labelMaand = new Label("Voer maandnummer in: ");
        add(labelMaand);
        tekstvakMaand = new TextField("", 5);
        tekstvakMaand.addActionListener(new KnopOkListener());
        add(tekstvakMaand);
        sMaand = "";

        labelJaar = new Label("Voer jaartal in: ");
        add(labelJaar);
        tekstvakJaar = new TextField("", 5);
        tekstvakJaar.addActionListener(new KnopOkListener());
        add(tekstvakJaar);
        sJaar = "";

        knopOk = new Button();
        knopOk.setLabel("Ok");
        knopOk.addActionListener(new KnopOkListener());
        add(knopOk);
    }

    public void paint(Graphics g) {
        g.drawString("maand: " + sMaand, 15, 125);
        g.drawString(sSchrikkel, 15, 145);
    }

    class KnopOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sMaand = tekstvakMaand.getText();
            iMaand = Integer.parseInt(sMaand);
            switch (iMaand) {
                case 1:
                    sMaand = "januari";
                    break;
                case 2:
                    sMaand = "februari";
                    break;
                case 3:
                    sMaand = "maart";
                    break;
                case 4:
                    sMaand = "april";
                    break;
                case 5:
                    sMaand = "mei";
                    break;
                case 6:
                    sMaand = "juni";
                    break;
                case 7:
                    sMaand = "juli";
                    break;
                case 8:
                    sMaand = "augustus";
                    break;
                case 9:
                    sMaand = "september";
                    break;
                case 10:
                    sMaand = "oktober";
                    break;
                case 11:
                    sMaand = "november";
                    break;
                case 12:
                    sMaand = "december";
                    break;
                default:
                    sMaand = "Voer een getal tussen 1 en 12 in.";
                    break;
            }
            sSchrikkel = tekstvakJaar.getText();
            iJaar = Integer.parseInt(sSchrikkel);
            if ((iJaar % 4 == 0 && !(iJaar % 100 == 0)) || iJaar % 400 == 0) {
                sSchrikkel = "" + iJaar + " is een schrikkeljaar";
            } else {
                sSchrikkel = "" + iJaar + " is geen schrikkeljaar";
            }

            repaint();
        }
    }
}
