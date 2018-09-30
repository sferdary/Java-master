package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Opdracht10_5 extends Applet {
    Label labelHeader;
    TextField textFieldOne, textFieldTwo, textFieldThree, textFieldFour, textFieldFive;
    Button buttonOk;
    String stringAverage, stringOne, stringTwo, stringThree, stringFour, stringFive;
    double doubleAverage, doubleOne, doubleTwo, doubleThree, doubleFour, doubleFive;
    DecimalFormat Fmt;


    public void init() {
        setSize(180, 250);
        setLayout(null);

        labelHeader = new Label("Voer cijfers in: ");
        labelHeader.setBounds(10, 10, 100, 25);
        add(labelHeader);

        textFieldOne = new TextField("", 4);
        textFieldOne.addActionListener(new ButtonOkListener());
        textFieldOne.setBounds(10, 60, 40, 20);
        add(textFieldOne);

        textFieldTwo = new TextField("", 4);
        textFieldTwo.addActionListener(new ButtonOkListener());
        textFieldTwo.setBounds(10, 85, 40, 20);
        add(textFieldTwo);

        textFieldThree = new TextField("", 4);
        textFieldThree.addActionListener(new ButtonOkListener());
        textFieldThree.setBounds(10, 110, 40, 20);
        add(textFieldThree);

        textFieldFour = new TextField("", 4);
        textFieldFour.addActionListener(new ButtonOkListener());
        textFieldFour.setBounds(10, 135, 40, 20);
        add(textFieldFour);

        textFieldFive = new TextField("", 4);
        textFieldFive.addActionListener(new ButtonOkListener());
        textFieldFive.setBounds(10, 160, 40, 20);
        add(textFieldFive);

        buttonOk = new Button("Ok");
        buttonOk.addActionListener(new ButtonOkListener());
        buttonOk.setBounds(10, 220, 40, 20);
        add(buttonOk);

        stringOne = "";
        stringTwo = "";
        stringThree = "";
        stringFour = "";
        stringFive = "";
        stringAverage = "";
        Fmt = new DecimalFormat("#.##");
    }


    public void paint(Graphics g) {
        g.drawString("" + stringOne, 100, 70);
        g.drawString("" + stringTwo, 100, 95);
        g.drawString("" + stringThree, 100, 120);
        g.drawString("" + stringFour, 100, 145);
        g.drawString("" + stringFive, 100, 170);
        g.drawString("Gemiddeld: " + Fmt.format(doubleAverage) + "   " + stringAverage, 10, 200);
    }


    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            doubleOne = Double.parseDouble(textFieldOne.getText());
            if (doubleOne < 5.5) {
                stringOne = "Onvoldoende";
            } else {
                stringOne = "Voldoende";
            }

            doubleTwo = Double.parseDouble(textFieldTwo.getText());
            if (doubleTwo < 5.5) {
                stringTwo = "Onvoldoende";
            } else {
                stringTwo = "Voldoende";
            }

            doubleThree = Double.parseDouble(textFieldThree.getText());
            if (doubleThree < 5.5) {
                stringThree = "Onvoldoende";
            } else {
                stringThree = "Voldoende";
            }

            doubleFour = Double.parseDouble(textFieldFour.getText());
            if (doubleFour < 5.5) {
                stringFour = "Onvoldoende";
            } else {
                stringFour = "Voldoende";
            }

            doubleFive = Double.parseDouble(textFieldFive.getText());
            if (doubleFive < 5.5) {
                stringFive = "Onvoldoende";
            } else {
                stringFive = "Voldoende";
            }

            doubleAverage = ((doubleOne + doubleTwo + doubleThree + doubleFour + doubleFive) / 5.0);
            stringAverage = Double.toString(doubleAverage);
            if (doubleAverage < 5.5) {
                stringAverage = "Onvoldoende";
            } else {
                stringAverage = "Voldoende";
            }
            repaint();
        }
    }
}