package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Theorie10 extends Applet {
    int leeftijd;
    TextField tekstvakLeeftijd, tekstvakSchrikkel, tekstvakSwitch;
    Label labelLeeftijd, labelSchrikkel, labelSwitch;
    String sLeeftijd, sSchrikkel, sSwitch, tekstLeeftijd, tekstSchrikkel, tekstSwitch;
    int jaartal, dag;

    public void init() {
        setSize(350, 400);

        labelLeeftijd = new Label("Geef uw leeftijd in en druk op enter" );
        tekstvakLeeftijd = new TextField("", 5);
        tekstvakLeeftijd.addActionListener( new TekstVakLeeftijdListener() );

        labelSchrikkel = new Label("Type een jaartal en druk op enter" );
        tekstvakSchrikkel = new TextField("", 5);
        tekstvakSchrikkel.addActionListener( new TekstVakSchrikkelListener() );

        tekstvakSwitch = new TextField("", 5);
        labelSwitch = new Label("Type het dagnummer en druk op enter");
        tekstvakSwitch.addActionListener( new TekstVakSwitchListener() );



        add( labelLeeftijd );
        add( tekstvakLeeftijd );
        add( labelSchrikkel );
        add( tekstvakSchrikkel );
        add(labelSwitch);
        add(tekstvakSwitch);
        tekstLeeftijd = "";
        tekstSchrikkel = "";
        tekstSwitch = "";
    }

    public void paint(Graphics g) {
        g.drawString(tekstLeeftijd, 20, 100);
        g.drawString(tekstSchrikkel, 20, 120);
        g.drawString(tekstSwitch, 20, 140 );

        g.drawLine(10, 160, 340, 160);

        g.drawString("" + 6 + " is groter dan " + 5 + " en kleiner dan " + 8 + ": " + (6 > 5 && 6 < 8), 20, 180);
        g.drawString("" + 6 + " is groter dan " + 5 + " en groter dan " + 8 + ": " + (6 > 5 && 6 > 8), 20, 200);
        g.drawString("" + 6 + " is kleiner dan " + 5 + " en groter dan " + 8 + ": " + (6 < 5 && 6 > 8), 20, 220);
        g.drawString("" + 6 + " is kleiner dan " + 5 + " en kleiner dan " + 8 + ": " + (6 < 5 && 6 < 8), 20, 240);

        g.drawLine(10, 260, 340, 260);

        g.drawString("" + 6 + " is groter dan " + 5 + ": " + (!(6 > 5)), 20, 280);
        g.drawString("" + 6 + " is kleiner dan " + 5 + ": " + (!(6 < 5)), 20, 300);

        g.drawLine(10, 320, 340, 320);

        g.drawString("" + 6 + " is groter dan " + 5 + ": " + (!(6 > 5)), 20, 340 );
        g.drawString("" + 6 + " is kleiner dan " + 5 + ": " + (! (6 < 5)), 20, 360 );

        g.drawLine(10, 380, 340, 380);
    }

    class TekstVakLeeftijdListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sLeeftijd = tekstvakLeeftijd.getText();
            leeftijd = Integer.parseInt(sLeeftijd);
            if (leeftijd > 20) {
                tekstLeeftijd = "U bent meerderjarig.";
            }
            else {
                tekstLeeftijd = "U bent minderjarig.";
            }
            repaint();
        }
    }

    class TekstVakSchrikkelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sSchrikkel = tekstvakSchrikkel.getText();
            jaartal = Integer.parseInt(sSchrikkel);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0) {
                tekstSchrikkel = "" + jaartal + " is een schrikkeljaar";
            } else {
                tekstSchrikkel = "" + jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }

    class TekstVakSwitchListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sSwitch = tekstvakSwitch.getText();
            dag = Integer.parseInt( sSwitch);
            switch(dag) {
                case 1:
                    tekstSwitch = "zondag";
                    break;
                case 2:
                    tekstSwitch = "maandag";
                    break;
                case 3:
                    tekstSwitch = "dinsdag";
                    break;
                case 4:
                    tekstSwitch = "woensdag";
                    break;
                case 5:
                    tekstSwitch = "donderdag";
                    break;
                case 6:
                    tekstSwitch = "vrijdag";
                    break;
                case 7:
                    tekstSwitch = "zaterdag";
                    break;
                default:
                    tekstSwitch = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}

