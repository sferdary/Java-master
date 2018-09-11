package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    Label LabelCalculator;
    TextField TekstVak1, TekstVak2;
    Button KnopCalcPlus, KnopCalcMin, KnopCalcKeer, KnopCalcDelen, KnopReset;
    String CalcPlusAns, CalcMinAns, CalcKeerAns, CalcDelenAns;
    Double TekstVak1Cijfers, TekstVak2Cijfers, CalcPlus1, CalcPlus2, CalcPlusTot, CalcMin1, CalcMin2, CalcMinTot, CalcKeer1, CalcKeer2, CalcKeerTot, CalcDelen1, CalcDelen2, CalcDelenTot;

    public void init() {
            setSize(150, 150);
            LabelCalculator = new Label("Calculator");
            add(LabelCalculator);
            TekstVak1 = new TextField("", 15);
            TekstVak1.addActionListener(new TekstVak1Listener());
            add(TekstVak1);
            TekstVak2 = new TextField("", 15);
            TekstVak2.addActionListener(new TekstVak2Listener());
            add(TekstVak2);
            KnopCalcPlus = new Button();
            KnopCalcPlus.setLabel("+");
            KnopCalcPlus.addActionListener(new KnopCalcPlusListener());
            CalcPlusAns = "";
            add(KnopCalcPlus);
            KnopCalcMin = new Button();
            KnopCalcMin.setLabel(" - ");
            KnopCalcMin.addActionListener(new KnopCalcMinListener());
            CalcMinAns = "";
            add(KnopCalcMin);
            KnopCalcKeer = new Button();
            KnopCalcKeer.setLabel(" * ");
            KnopCalcKeer.addActionListener(new KnopCalcKeerListener());
            CalcKeerAns = "";
            add(KnopCalcKeer);
            KnopCalcDelen = new Button();
            KnopCalcDelen.setLabel(" / ");
            KnopCalcDelen.addActionListener(new KnopCalcDelenListener());
            CalcDelenAns = "";
            add(KnopCalcDelen);
            KnopReset = new Button();
            KnopReset.setLabel("C");
            KnopReset.addActionListener(new KnopResetListener());
            add(KnopReset);
        }

    class TekstVak1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TekstVak1Cijfers = Double.parseDouble(TekstVak1.getText());
            repaint();
        }
    }

    class TekstVak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TekstVak2Cijfers = Double.parseDouble(TekstVak2.getText());
            repaint();
        }
    }

    class KnopCalcPlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            CalcPlus1 = Double.parseDouble(TekstVak1.getText());
            CalcPlus2 = Double.parseDouble(TekstVak2.getText());
            CalcPlusTot = CalcPlus1 + CalcPlus2;
            CalcPlusAns = String.valueOf(CalcPlusTot);
            TekstVak1.setText(CalcPlusAns);
            TekstVak2.setText("");
            repaint();
        }
    }

    class KnopCalcMinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            CalcMin1 = Double.parseDouble(TekstVak1.getText());
            CalcMin2 = Double.parseDouble(TekstVak2.getText());
            CalcMinTot = CalcMin1 - CalcMin2;
            CalcMinAns = String.valueOf(CalcMinTot);
            TekstVak1.setText(CalcMinAns);
            TekstVak2.setText("");
            repaint();
        }
    }

    class KnopCalcKeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            CalcKeer1 = Double.parseDouble(TekstVak1.getText());
            CalcKeer2 = Double.parseDouble(TekstVak2.getText());
            CalcKeerTot = CalcKeer1 * CalcKeer2;
            CalcKeerAns = String.valueOf(CalcKeerTot);
            TekstVak1.setText(CalcKeerAns);
            TekstVak2.setText("");
            repaint();
        }
    }

    class KnopCalcDelenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            CalcDelen1 = Double.parseDouble(TekstVak1.getText());
            CalcDelen2 = Double.parseDouble(TekstVak2.getText());
            CalcDelenTot = CalcDelen1 / CalcDelen2;
            CalcDelenAns = String.valueOf(CalcDelenTot);
            TekstVak1.setText(CalcDelenAns);
            TekstVak2.setText("");
            repaint();
        }
    }

    class KnopResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TekstVak1.setText("");
            TekstVak2.setText("");
            repaint();
        }
    }
}