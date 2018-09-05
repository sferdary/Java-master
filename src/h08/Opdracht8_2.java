package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_2 extends Applet {
    Button knopBezMan;
    Button knopPotMan;
    Button knopBezVrouw;
    Button knopPotVrouw;
    Label label;
    String reSet, invoerBezMan;
    double getal;

    public void init() {
        setSize(600, 300);
        label = new Label("Voer aantallen in");

        knopBezMan = new Button();
        knopBezMan.setLabel("Man");
        knopBezMan.addActionListener(new knopBezManListener());
        invoerBezMan = knopBezMan;
        add(knopBezMan);
    }

    class knopBezManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoerBezMan = "";
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannelijke bezoekers", 20, 115);
        g.drawString(": " + invoerBezMan, 250, 115);
    }
}
