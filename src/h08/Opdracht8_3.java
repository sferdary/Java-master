package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_3 extends Applet {
    Label labelBTWCalc;
    TextField tekstvakBedrag;
    Button knopBereken;
    Button knopReset;
    String reSet;
    String invoerBedrag;
    double getalText;
    double getalBTW;

    public void init() {
        setSize(200,300);

        labelBTWCalc = new Label("Prijs excl. BTW (21%)");
        tekstvakBedrag = new TextField("", 20);
        knopBereken = new Button();
        knopReset = new Button();

        tekstvakBedrag.addActionListener(new TekstvakListener() );
        knopBereken.addActionListener( new knopBerekenListener() );
        knopReset.addActionListener( new knopResetListener() );

        knopBereken.setLabel( "Bereken" );
        knopReset.setLabel( "Reset" );
        invoerBedrag = "BTW 21";
        reSet = "";
        getalBTW = 1.21;

        add(labelBTWCalc);
        add(tekstvakBedrag);
        add(knopBereken);
        add(knopReset);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getalText = Double.parseDouble(tekstvakBedrag.getText());
            repaint();
        }
    }

    class knopBerekenListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getalText = Double.parseDouble(tekstvakBedrag.getText());
            repaint();
        }
    }

    class knopResetListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvakBedrag.setText("");
            invoerBedrag = "";
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawLine(15,100,185,100);

        g.drawString((getalText * getalBTW)+"", 20, 115);
    }
}