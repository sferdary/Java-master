package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_2 extends Applet {
    Label label = new Label("klik aantallen aan");
    Button knopManBezoeker, knopManPotL, knopVrouwBezoeker, knopVrouwPotL;
    int startManBNull, startManPNull, startVrouwBNull, startVrouwPNull, getalManB, getalManP, getalVrouwB, getalVrouwP;

    public void init() {
        setSize(600, 175);
        add(label);
        knopManBezoeker = new Button();
        knopManBezoeker.setLabel("Bezoeker Man");
        knopManBezoeker.addActionListener(new knopManBezoekerListener());
        startManBNull = 1;
        add(knopManBezoeker);

        knopManPotL = new Button();
        knopManPotL.setLabel("Pot. leerling Man");
        knopManPotL.addActionListener(new knopManPotLListener());
        startManPNull = 1;
        add(knopManPotL);

        knopVrouwBezoeker = new Button();
        knopVrouwBezoeker.setLabel("Bezoeker Vrouw");
        knopVrouwBezoeker.addActionListener(new knopVrouwBezoekerListener());
        startVrouwBNull = 1;
        add(knopVrouwBezoeker);

        knopVrouwPotL = new Button();
        knopVrouwPotL.setLabel("Pot. leerling Vrouw");
        knopVrouwPotL.addActionListener(new knopVrouwPotLListener());
        startVrouwPNull = 1;
        add(knopVrouwPotL);
    }

    class knopManBezoekerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getalManB = startManBNull++;
            repaint();
        }
    }

    class knopManPotLListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getalManP = startManPNull++;
            repaint();
        }
    }

    class knopVrouwBezoekerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getalVrouwB = startVrouwBNull++;
            repaint();
        }
    }

    class knopVrouwPotLListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getalVrouwP = startVrouwPNull++;
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannelijke:", 20, 95);
        g.drawString("Bezoekers", 20, 115);
        g.drawString(": " + getalManB, 150, 115);
        g.drawString("Potentiële leerlingen", 20, 135);
        g.drawString(": " + getalManP, 150, 135);
        g.drawString("Aantal vrouwlijke:", 250, 95);
        g.drawString("Bezoekers", 250, 115);
        g.drawString(": " + getalVrouwB, 380, 115);
        g.drawString("Potentiële leerlingen", 250, 135);
        g.drawString(": " + getalVrouwP, 380, 135);
        g.drawString("Totaal", 125, 190);
        g.drawString(": " + (getalManB + getalManP + getalVrouwB + getalVrouwP) , 175, 190);
    }
}