package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_2 extends Applet {
    Label label;
    Button knopManBezoeker;
    Button knopManPotL;
    Button knopVrouwBezoeker;
    Button knopVrouwPotL;
    int startManBNull, startManPNull, startVrouwBNull, startVrouwPNull, getalManB, getalManP, getalVrouwB, getalVrouwP;

    public void init() {
        setSize(500, 150);
        label = new Label("klik aantallen aan");

        knopManBezoeker = new Button();
        knopManBezoeker.setLabel("Bezoeker Man");
        knopManBezoeker.addActionListener(new knopManBezoekerListener());

        knopManPotL = new Button();
        knopManPotL.setLabel("Pot. leerling Man");
        knopManPotL.addActionListener(new knopManPotLListener());

        knopVrouwBezoeker = new Button();
        knopVrouwBezoeker.setLabel("Bezoeker Vrouw");
        knopVrouwBezoeker.addActionListener(new knopVrouwBezoekerListener());

        knopVrouwPotL = new Button();
        knopVrouwPotL.setLabel("Pot. leerling Vrouw");
        knopVrouwPotL.addActionListener(new knopVrouwPotLListener());

        startManBNull = 1;
        startManPNull = 1;
        startVrouwBNull = 1;
        startVrouwPNull = 1;

        add(knopManBezoeker);
        add(knopManPotL);
        add(knopVrouwBezoeker);
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
    }
}