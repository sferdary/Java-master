package h10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Opdracht10_3 extends Applet {
    Label labelInvoer;
    TextField tekstvak;
    Button knopOk;
    String sMaand;
    int iMaand;


    public void init() {
        setSize(210, 100);
        labelInvoer = new Label("Voer maandnummer in: ");
        add(labelInvoer);

        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new KnopOkListener());
        add(tekstvak);

        knopOk = new Button();
        knopOk.setLabel("Ok");
        knopOk.addActionListener(new KnopOkListener());
        add(knopOk);

        sMaand = "";
    }

    public void paint(Graphics g) {
        g.drawString("Maand:", 15, 75);
        g.drawString(sMaand, 15, 95);
    }


    class KnopOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sMaand = tekstvak.getText();
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
            repaint();
        }
    }
}






