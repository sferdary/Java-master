package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdrach8_1  extends Applet {
    Label label;
    TextField tekstvak;
    Button knopOke;
    Button knopCancel;
    String reSet;
    String invoer;
    double getal;

    public void init() {
        setSize(200,300);
        tekstvak = new TextField("", 20);
        label = new Label("Insert text " + "and press 'enter'");
        tekstvak.addActionListener(new TekstvakListener());

        knopOke = new Button();
        knopOke.setLabel( "Ok" );
        knopOke.addActionListener( new KnopOkeListener() );
        knopOke.setBounds(10, 30, 30, 60);
        invoer = "hier moet de uitkomst komen";

        knopCancel = new Button();
        knopCancel.setLabel( "Cancel" );
        knopCancel.addActionListener( new knopCancelListener() );
        reSet = " ";

        add(label);
        add(tekstvak);
        add(knopOke);
        add(knopCancel);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }


    class KnopOkeListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            invoer = tekstvak.getText();
            repaint();
        }
    }

    class knopCancelListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            invoer = "";
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawLine(15,100,185,100);

        g.drawString(invoer, 20, 115);
    }
}