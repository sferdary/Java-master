package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_2 extends Applet {
    Label labelTekstVak;
    TextField tekstVak;
    String sGetal;
    Boolean geklikt;
    int invoer, hoogsteGetal, laagsteGetal;

    public void init() {
        setSize(350, 150);
        labelTekstVak = new Label("Voer getal in en druk op enter");
        add(labelTekstVak);
        tekstVak = new TextField("", 5);
        tekstVak.addActionListener(new TekstVakListener());
        add(tekstVak);

        hoogsteGetal = Integer.MIN_VALUE;
        laagsteGetal = Integer.MAX_VALUE;
    }

    class TekstVakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            geklikt = true;
            sGetal = tekstVak.getText();
            invoer = Integer.parseInt(sGetal);
            if (invoer > hoogsteGetal) {
                hoogsteGetal = invoer;
            }
            if (invoer < laagsteGetal) {
                laagsteGetal = invoer;
            }

            repaint();
        }
    }

    public void paint(Graphics g) {
        if (geklikt) {
            g.drawString("Hoogste getal: " + hoogsteGetal, 10, 50);
            g.drawString("Laagste getal: " + laagsteGetal, 10, 75);
        }
    }
}