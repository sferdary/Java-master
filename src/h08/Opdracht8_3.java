package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Opdracht8_3 extends Applet {
    Label labelBTWCalc = new Label("Prijs excl. BTW (21%)");
    TextField tekstvakBedrag;
    Button knopBereken, knopReset;
    double getalText, getalBTW ;
    DecimalFormat Fmt = new DecimalFormat("#.##");

    public void init() {
        setSize(200,150);
        add(labelBTWCalc);
        tekstvakBedrag = new TextField("", 20);
        tekstvakBedrag.addActionListener(new TekstvakListener() );
        add(tekstvakBedrag);
        knopBereken = new Button();
        knopBereken.setLabel( "Bereken" );
        knopBereken.addActionListener( new knopBerekenListener() );
        add(knopBereken);
        knopReset = new Button();
        knopReset.setLabel( "Reset" );
        knopReset.addActionListener( new knopResetListener() );
        add(knopReset);
        getalBTW = 1.21;

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
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawLine(15,100,185,100);
        g.drawString("BTW hoog:", 20, 115);
        g.drawString("€ " + Fmt.format(((getalText  * getalBTW) - getalText)), 125, 115);
        g.drawString("Bedrag incl. BTW:", 20, 135);
        g.drawString("€ " + Fmt.format((getalText  * getalBTW)) + "" ,125, 135);
    }
}