package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Opdracht10_5 extends Applet {
    private TextField textFieldOne, textFieldTwo, textFieldThree, textFieldFour, textFieldFive;
    private String stringAverage, stringOne, stringTwo, stringThree, stringFour, stringFive;
    private double doubleAverage;
    private DecimalFormat Fmt;

    public void init() {
        setSize(180, 250);
        setLayout(null);

        Label label = new Label("Insert numbers ( 0 - 10 ): ");
        label.setBounds(10, 10, 150, 25);
        add(label);

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

        Button buttonOk = new Button("Ok");
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

    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double doubleOne = Double.parseDouble(textFieldOne.getText());
            if (doubleOne < 5.5) {
                stringOne = "Failed";
            } else {
                stringOne = "Passed";
            }

            double doubleTwo = Double.parseDouble(textFieldTwo.getText());
            if (doubleTwo < 5.5) {
                stringTwo = "Failed";
            } else {
                stringTwo = "Passed";
            }

            double doubleThree = Double.parseDouble(textFieldThree.getText());
            if (doubleThree < 5.5) {
                stringThree = "Failed";
            } else {
                stringThree = "Passed";
            }

            double doubleFour = Double.parseDouble(textFieldFour.getText());
            if (doubleFour < 5.5) {
                stringFour = "Failed";
            } else {
                stringFour = "Passed";
            }

            double doubleFive = Double.parseDouble(textFieldFive.getText());
            if (doubleFive < 5.5) {
                stringFive = "Failed";
            } else {
                stringFive = "Passed";
            }

            doubleAverage = ((doubleOne + doubleTwo + doubleThree + doubleFour + doubleFive) / 5.0);
            stringAverage = Double.toString(doubleAverage);
            if (doubleAverage < 5.5) {
                stringAverage = "Failed";
            } else {
                stringAverage = "Passed";
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("" + stringOne, 100, 70);
        g.drawString("" + stringTwo, 100, 95);
        g.drawString("" + stringThree, 100, 120);
        g.drawString("" + stringFour, 100, 145);
        g.drawString("" + stringFive, 100, 170);
        g.drawString("Average: " + Fmt.format(doubleAverage) + "   " + stringAverage, 10, 200);
    }
}